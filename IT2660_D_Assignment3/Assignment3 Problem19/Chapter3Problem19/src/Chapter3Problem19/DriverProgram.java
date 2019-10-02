
package Chapter3Problem19;


public class DriverProgram {
 	public static void main(String[] args)
	{
		Stack stack = new Stack(3);
		
			Listing Henry = new Listing("Henry", "55555", "555-555-5555\n");
			Listing Henry1 = new Listing("Henry1", "55555", "555-555-5555\n");
			Listing Henry2 = new Listing("Henry2", "55555", "555-555-5555\n"); 
			Listing temp; 

		System.out.println("Test if stack is emtpy");           
		System.out.println(stack.emptyTest());              
		System.out.println("Test if stack is full");            
		System.out.println(stack.fullTest()); 
		
                System.out.println(); 
                
		System.out.println("Stack push test ");
		System.out.println(stack.pop());	

                System.out.println(); 
                
		System.out.println("The three listings are: ");                 //displays to user 
		System.out.println(stack.push(Henry));
		System.out.println(stack.push(Henry1));
		System.out.println(stack.push(Henry2));

                System.out.println(); 
                                
		System.out.println("Displays all listings"); 
		stack.showAll(); 

		stack.reset(); 
		

		stack.showAll();                            //displays nothing 
		
		System.out.println("Listings for Henry, Henry1, Henry2 after push");
		System.out.println(stack.push(Henry));
		System.out.println(stack.push(Henry1));
		System.out.println(stack.push(Henry2)); 
		
                System.out.println(); 
                
		System.out.println("Show Henry2 for peek test \n");             //top location listing
		System.out.println(stack.peak());   
		
		System.out.println("Test for Pop algorithm");
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		System.out.println(); 
		
		stack.showAll(); 
		System.out.println(); 
		
	}
}