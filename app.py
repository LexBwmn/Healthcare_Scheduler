from flask import Flask, render_template, request, redirect, session
from werkzeug.security import generate_password_hash, check_password_hash
from extensions import db

app = Flask(__name__)
app.secret_key = 'secret-key-123'
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///scheduler.db'
db.init_app(app)

from models import User, Appointment

@app.route('/')
def home():
    return render_template('login.html')

@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        email = request.form['email']
        password = generate_password_hash(request.form['password'])
        user = User(email=email, password=password)
        db.session.add(user)
        db.session.commit()
        return redirect('/')
    return render_template('register.html')

@app.route('/login', methods=['POST'])
def login():
    email = request.form['email']
    password = request.form['password']
    user = User.query.filter_by(email=email).first()
    if user and check_password_hash(user.password, password):
        session['user_id'] = user.id
        return redirect('/dashboard')
    return 'Invalid credentials'

@app.route('/dashboard')
def dashboard():
    if 'user_id' not in session:
        return redirect('/')
    doctor_filter = request.args.get('doctor')
    if doctor_filter:
        appointments = Appointment.query.filter_by(doctor=doctor_filter).all()
    else:
        appointments = Appointment.query.all()
    doctors = [appt.doctor for appt in Appointment.query.with_entities(Appointment.doctor).distinct()]
    return render_template('dashboard.html', appointments=appointments, doctors=doctors)

@app.route('/schedule', methods=['GET', 'POST'])
def schedule():
    if request.method == 'POST':
        name = request.form['name']
        doctor = request.form['doctor']
        time = request.form['time']
        appt = Appointment(name=name, doctor=doctor, time=time)
        db.session.add(appt)
        db.session.commit()
        return redirect('/schedule?success=true')  # ✨ New line for toast
    return render_template('schedule.html')

@app.route('/cancel/<int:id>')
def cancel(id):
    appt = Appointment.query.get_or_404(id)
    db.session.delete(appt)
    db.session.commit()
    return redirect('/dashboard')

@app.route('/consult', methods=['GET', 'POST'])
def consult():
    if request.method == 'POST':
        patient_name = request.form['patient']
        reason = request.form['reason']
        print(f"[Virtual Consult] {patient_name}: {reason}")
        return redirect('/dashboard')
    return render_template('consult.html')

@app.route('/insurance', methods=['GET', 'POST'])
def insurance():
    status = None
    if request.method == 'POST':
        patient = request.form['patient']
        insurance_id = request.form['insurance']
        # Simulated validation logic
        status = "✅ Valid Insurance" if insurance_id.endswith("1") else "❌ Invalid Insurance"
    return render_template('insurance.html', status=status)

@app.route('/logout')
def logout():
    session.pop('user_id', None)
    return redirect('/')

with app.app_context():
    db.create_all()

if __name__ == '__main__':
    app.run(debug=True)
