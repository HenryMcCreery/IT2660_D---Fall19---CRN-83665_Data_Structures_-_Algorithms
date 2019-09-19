/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlistings;

import javax.swing.JOptionPane;

/**
 *
 * @author hjmcc
 */
public class StudentListings {

        private String name;            //key field
        private String identificationNumber;
        private String gradePointAvg;
        
        public StudentListings()            //no parameter constructor added
        {
            name = "";
            identificationNumber = "";
            gradePointAvg = "";
        }
        
        public StudentListings(String n, String a, String num)
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
        
        public StudentListings deepCopy()
        {
            StudentListings clone = new StudentListings(name, identificationNumber, gradePointAvg);
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
