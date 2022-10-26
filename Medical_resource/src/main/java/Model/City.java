/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class City {
    
    private String cityName;
    private ArrayList<Community> communities;
    private int addCount=0;
    
    public City(String cityName) {
        this.cityName = cityName;
        this.communities = new ArrayList();
    }
    

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }

    public void addCommunityToList(Community c) {
        if(this.communities.isEmpty()){
            this.communities.add(c);
        } else {
            for(Community temp: this.communities) {
                if(temp.getCommunityName().equals(c.getCommunityName())) {
                    addCount=1;
                    JOptionPane.showMessageDialog(null, c.getCommunityName()+" already exists. Find another name", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                } 
            }
            if(addCount==0){
                this.communities.add(c);
            }
        }
        addCount=0;
    }
    
}
