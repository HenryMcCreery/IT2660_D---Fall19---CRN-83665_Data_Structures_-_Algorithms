
package listing;

    import java.util.Scanner;

public class Listing {                  //class name from UML diagram, public because of plus sign from diagram

    private String name;                //declared variables private because of the negative sign from diagram
    private int age;

    public Listing()                    //method listing, default no parameter constructor
    {
        name = " ";                     //initiated string variable to " " from problem
        age = 0;                        //initiated int variable to zero from problem
    }
    
    public Listing (String newName, int newAge) //constructor with string and int
    {
        name = newName;                         
        age= newAge;
    }
    
    public String toString()                            //returns string display to user
    {
        return "Name: " + name + " Age: " + age;
    }
    
    public void input()                     //user inputs values of an object's data members, from problem description
    {
       Scanner keyboardInput = new Scanner(System.in);
       
       System.out.print("Enter name: ");
       name = keyboardInput.nextLine();
       
       System.out.print("Enter age: ");
       age = keyboardInput.nextInt();
       keyboardInput.nextLine();
    }
    
    public void setName (String newName)               //sets name for variable name 
    {
        name = newName;
    }
    
    public void setAge (int newAge)                   //sets age for variable age
    {
        age = newAge;
    }
    
    public String getName()                           //retrieves name variable
    {
        return name;
    }
    
    public int getAge()                              //retrieves age variable
    {
        return age;
    }
    

}
