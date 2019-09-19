/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information;

import java.util.Scanner;


/**
 *
 * @author hjmcc
 */

public class Node {                             //old Listing class creates initial student data
    private String name;
    private String identificationNumber;
    private String gpa;

    
    public Node()
    {
        
    }
    
    public Node(String n, String i, String g)
            {
                name = n;
                identificationNumber = i;
                gpa = g;
            }




    public String toString()
            {return ("Name is " + name +
                    "\nIdentifcation Number is" + identificationNumber +
                    "\nGPA is " + gpa + "\n");
                    }
    public Node deepCopy()
    {Node clone = new Node(name, identificationNumber, gpa);
    return clone;        
    }
    public int compareTo (String targetKey){
        return (name.compareTo(targetKey));
    }
    
        public String getName()
    {
        return name;
    }
    
        public void setName(String n){              //full encapsulation
        identificationNumber = n;
    }
        
        public void getIdentificationNumber(String i){
        identificationNumber = i;
    }
    
    public void setIdentificationNumber(String i){
        identificationNumber = i;
    }
    
    
    
        public void getGpa(String g){
        identificationNumber = g;
    }
    
        public void setGpa(String g){
        identificationNumber = g;
    }
    Scanner keyboardInput = new Scanner(System.in); 
    
    
    public void input()                         //input method
            {
                          Scanner keyboardInput = new Scanner(System.in);
            System.out.println("Enter a name");
            name = keyboardInput.nextLine();
            System.out.println("Enter a identification number");
            identificationNumber = keyboardInput.nextLine();
            System.out.println("Enter a grade point average");
            gpa = keyboardInput.nextLine();
            }
}
        