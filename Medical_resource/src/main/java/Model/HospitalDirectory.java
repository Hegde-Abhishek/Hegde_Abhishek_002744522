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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDir;

    public HospitalDirectory() {
        this.hospitalDir = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDir() {
        return hospitalDir;
    }

    public void setHospitalDir(ArrayList<Hospital> hospitalDir) {
        this.hospitalDir = hospitalDir;
    }
    

    public Hospital addHospital() {
        Hospital newHospital = new Hospital();
        hospitalDir.add(newHospital);
        return newHospital;
    }

    public void deletePerson(Hospital h) {
        hospitalDir.remove(h);
    }
    
    
}
