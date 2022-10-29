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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDir;

    public DoctorDirectory() {
        this.doctorDir = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(ArrayList<Doctor> doctorDir) {
        this.doctorDir = doctorDir;
    }

    public void addDoctor(Doctor doc) {
        doc.setDoctorId(doc.person.getPersonId());
        doctorDir.add(doc);
    }
    
}
