/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information;


import java.util.Scanner;


public class StudentListings {

    static int length;

    

        private String name;            //key field
        private String identificationNumber;
        private String gpa;
        
        public StudentListings()            //no parameter constructor added
        {
            name = "";
            identificationNumber = "";
            gpa = "";
        }
        
        public StudentListings(String n, String a, String num)
        {
            name = n;
            identificationNumber = a;
            gpa = num;
        }
        
        public String toString()
        {
            return("Name is " + name + "\nidentification number is " +
                    identificationNumber + "\ngpa is " + gpa + "\n");
        }
        
        public StudentListings deepCopy()                                           //creates copy
        {
            StudentListings clone = new StudentListings(name, identificationNumber, gpa);
            return clone;
        }
        
        public int compareTo(String targetKey)
        {
            return(name.compareTo(targetKey));
        }
        
        
        public void input()                                             //creating student file from user input
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