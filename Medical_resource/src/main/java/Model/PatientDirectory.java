/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDir;

    public PatientDirectory() {
        this.patientDir = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public void addPatient(Patient patient){
        patient.setPatientId(patient.person.getPersonId());
        patientDir.add(patient);
    }

    public void deletePerson(Patient selectedPerson) {
        patientDir.remove(selectedPerson);
    }
}
