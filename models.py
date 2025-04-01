from extensions import db

class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    email = db.Column(db.String(100), unique=True, nullable=False)
    password = db.Column(db.String(200), nullable=False)

class Appointment(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(100), nullable=False)
    doctor = db.Column(db.String(100), nullable=False)
    time = db.Column(db.String(50), nullable=False)

class ConsultRequest(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    patient = db.Column(db.String(100), nullable=False)
    reason = db.Column(db.Text, nullable=False)

class InsuranceCheck(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    patient = db.Column(db.String(100), nullable=False)
    insurance_id = db.Column(db.String(100), nullable=False)
    status = db.Column(db.String(50), nullable=False)
