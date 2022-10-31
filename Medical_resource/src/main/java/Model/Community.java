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
public class Community {
    private String communityName;
    private ArrayList<House> houses;
    private int uniqueId,addit=0;
    private static int count=0;

    public Community(String communityName, City city) {
        this.communityName = communityName;
        this.houses =new ArrayList();
        this.uniqueId=count++;
    }
    
    public void addHouseToList(House h) {
        if(this.houses.isEmpty())
        {
            this.houses.add(h);
        }
        else
        {
            for(House temp: this.houses)
            {
                if(temp.getUniqueId()==h.getUniqueId())
                {
                    addit=1;
                    JOptionPane.showMessageDialog(null, h.getHouseName()+" already exists. Find another name", "Warning", JOptionPane.WARNING_MESSAGE);

                    break;
                }
            }
            if(addit==0)
                this.houses.add(h);
        }
         addit=0;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    @Override
    public String toString(){
        return communityName;
    }
    
}
