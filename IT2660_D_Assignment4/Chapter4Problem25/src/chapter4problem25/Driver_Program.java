
package chapter4problem25;


public class Driver_Program {
    
    public static void main (String[] args)       //main method
    {
        Listing testObjectOne = new Listing();        //new object creation
                
        testObjectOne.input();                      //tests input default StudentListings
    
        Listing testObjectTwo = new Listing("Henry2", "5555", "3.2");       //testObjectTwo tests toString
  
        
                    testObjectTwo.toString();

        Listing testObjectThree = new Listing("Henry3", "5555", "3.4");            //testObjectThree creates a deepCopy
        
    
                    testObjectThree.deepCopy();
                    
       Listing testObjectFour = new Listing("Henry4","5555", "3.6");           //compares against unser input for match
        

                    
            System.out.println(testObjectOne); 
            System.out.println(testObjectTwo);
            System.out.println(testObjectThree);
            System.out.println(testObjectFour.compareTo("Henry5"));
    }
    
}
