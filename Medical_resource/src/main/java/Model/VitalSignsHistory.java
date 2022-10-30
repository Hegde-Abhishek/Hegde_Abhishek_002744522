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
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsDir;

    public VitalSignsHistory() {
        this.vitalSignsDir = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignsDir() {
        return vitalSignsDir;
    }

    public void setVitalSignsDir(ArrayList<VitalSigns> vitalSignsDir) {
        this.vitalSignsDir = vitalSignsDir;
    }

    public VitalSigns addVitalSign() {
        VitalSigns v = new VitalSigns();
        vitalSignsDir.add(v);
        return v;
    }
    
}
