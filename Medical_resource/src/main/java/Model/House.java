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
public class House {
    private String houseName;
    private ArrayList<Person> people;
    private int uniqueId;
    private static int count=0;

    public House(String houseName) {
        this.houseName = houseName;
        this.uniqueId = count++;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        House.count = count;
    }
    
}
