
package chapter3problem20;


public class Listing {
		private String name;
		private String address;
		private String number;
		
		public Listing()
		{
			name = " ";
			address = " ";
			number = " ";	
		}
		
		public Listing(String n, String a, String num){
			name = n ;
			address = a ;
			number = num ;
		}
		

		public String toString(){
			return(("Name: " + name +  "\n") + 
                                ("Address: " + address + "\n") + 
                                ("Number: " + number));
		}
		
		public Listing deepCopy()
		{
			Listing clone = new Listing(name, address, number) ; 
			return clone ; 
		}
         
} 