
package chapter4problem26;






public class Listing implements SinglyLinkedList.KeyMode {                    //node class changed to listing class
		private String name;
		private String identificationNumber;
		private String gradePointAvg;
		
		

                
		public Listing(String n, String a, String num){
			name = n ;
			identificationNumber = a ;
			gradePointAvg = num ;
		}
                
                
                
		

		public String toString(){
                    return("Name is " + name + 
                                "\nAddress is " + identificationNumber 
                                + "\nNumber is " + gradePointAvg + "\n");
		}
		
		public Listing deepCopy()
		{
			Listing clone = new Listing(name, identificationNumber, gradePointAvg) ; 
			return clone ; 
		}
                
                public int compareTo(String targetKey){
                    String tKey = (String) targetKey;
                    return(name.compareTo(tKey));
                }

         
} 