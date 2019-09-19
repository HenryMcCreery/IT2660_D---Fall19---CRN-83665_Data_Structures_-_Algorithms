/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedarraystructure;

import javax.swing.JOptionPane;

/**
 *
 * @author hjmcc
 */
public class Listings {                            //class for Listings
    private String name;                            //targetKey
    private String identificationNumber;
    private String gradePointAvg;
    
    
    
    
    
    
            public Listings()            //no parameter constructor added
        {
            name = "";
            identificationNumber = "";
            gradePointAvg = "";
        }
        
        public Listings(String n, String a, String num)
        {
            name = n;
            identificationNumber = a;
            gradePointAvg = num;
        }
        
        public String toString()
        {
            return("Name is " + name + "\nAddress is " +
                    identificationNumber + "\nNumber is " + gradePointAvg + "\n");
        }
        
        public Listings deepCopy()
        {
            Listings clone = new Listings(name, identificationNumber, gradePointAvg);
            return clone;
        }
        
        public int compareTo(String targetKey)
        {
            return(name.compareTo(targetKey));
        }
        
        public void input()
        {
            name = JOptionPane.showInputDialog("Enter a name");
            identificationNumber = JOptionPane.showInputDialog("Enter an identification number");
            gradePointAvg= JOptionPane.showInputDialog("Enter a grade point average");
        }  
        

    
        
        
}
