
package listing;


public class Driver_Program {
    
    public static void main (String[] args)       //main method
    {
        Listing testObjectOne = new Listing();        //new object creation
                
        testObjectOne.input();                      //tests input default Listing
    
        Listing testObjectTwo = new Listing();       //testObjectTwo tests set methods
    
        testObjectTwo.setName("Henry2");
        testObjectTwo.setAge(39);
        
        Listing testObjectThree = new Listing( "Henry3", 39);    //testObjectThree tests parameterized constructor Listing
    
        System.out.println(testObjectOne);                      //Displays user entered data, input
        System.out.println(testObjectTwo);                      //Displays data provided for set method, toString
        System.out.println("Name: " + testObjectThree.getName() +
                " Age: "+ testObjectThree.getAge());    //Displays data provided for get method, toString
    
    
    }
    
    
}
