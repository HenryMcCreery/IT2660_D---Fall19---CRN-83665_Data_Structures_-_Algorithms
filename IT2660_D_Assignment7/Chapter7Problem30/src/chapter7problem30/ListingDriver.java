/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7problem30;

/**
 *
 * @author hjmcc
 */
public class ListingDriver {
    
    public static void main (String[] args)       
    {
        Listing testObjectOne = new Listing();        //new object creation
                
        testObjectOne.input();                      //tests input Listing
    
        Listing testObjectTwo = new Listing("Ann", "5555", "1.2");       
  
        
                    testObjectTwo.toString();                           //testObjectTwo tests toString

        Listing testObjectThree = new Listing("Bill", "5555", "2.0");           
        
    
                    testObjectThree.deepCopy();                         //test deepCopy Listing
                    
       Listing testObjectFour = new Listing("Carol","5555", "3.2");           
        

                    
            System.out.println(testObjectOne); 
            System.out.println(testObjectTwo);
            System.out.println(testObjectThree);
            System.out.println(testObjectFour.compareTo("Mike"));             //tests compareTo Listing
    }
}
