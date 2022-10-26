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
public class PersonDirectory {
    
    private ArrayList<Person> personDir;

    public PersonDirectory() {
        this.personDir = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public void setPersonDir(ArrayList<Person> personDir) {
        this.personDir = personDir;
    }
    
    public Person addNewPerson() {
        Person newPerson = new Person();
        personDir.add(newPerson);
        return newPerson;
    }

    public void deletePerson(Person p) {
        personDir.remove(p);
    }
    
}
