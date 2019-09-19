/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlistings;

/**
 *
 * @author hjmcc
 */
public class Driver_Program {
    
    public static void main (String[] args)       //main method
    {
        StudentListings testObjectOne = new StudentListings();        //new object creation
                
        testObjectOne.input();                      //tests input default StudentListings
    
        StudentListings testObjectTwo = new StudentListings("Henry2", "5555", "5555");       //testObjectTwo tests set methods
  
        
                    testObjectTwo.toString();

        StudentListings testObjectThree = new StudentListings("Henry3", "5555", "5555");
        
    
                    testObjectThree.deepCopy();
                    
       StudentListings testObjectFour = new StudentListings("Henry4","5555", "5555");
        

                    
            System.out.println(testObjectOne); 
            System.out.println(testObjectTwo);
            System.out.println(testObjectThree);
            System.out.println(testObjectFour.compareTo("Henry5"));
    }
    
}
