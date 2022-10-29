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
public class EncounterHistory {
    private ArrayList<Encounter> encounters;
    
    public EncounterHistory() {
        this.encounters = new ArrayList();
    }

    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }

    public Encounter addEncounter() {
        int size = encounters.size();
        int encounterId;
        if(size == 0){
            encounterId = 1;
        } else {
            encounterId = encounters.get((size - 1)).getEncounterId()+ 1;
        }
        Encounter e = new Encounter();
        e.setEncounterId(encounterId);
        encounters.add(e);
        return e;
    }
    
}
