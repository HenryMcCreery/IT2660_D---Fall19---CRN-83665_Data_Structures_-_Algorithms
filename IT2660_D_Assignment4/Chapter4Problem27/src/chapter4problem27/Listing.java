
package chapter4problem27;

import java.util.Scanner;



public class Listing implements SinglyLinkedList.KeyMode {                    //node class changed to listing class
		private String name;
		private String identificationNumber;
		private String gradePointAvg;
		
		
        public Listing(){
            
        }
                
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
                
                
 

                
                public String getName(){
                    return name;
                }
                
                public void setName(String n){
                    name = n;
                }
                
                public String getidentificationNumber(){
                    return identificationNumber;
                }
                
                public void setIdentificationNumber(String a){
                    identificationNumber = a;
                }
                
                public String getGradePointAvg(){
                    return gradePointAvg;
                }
                
                public void setGradePointAvg(String num){
                    gradePointAvg = num;
                }

                Scanner keyboardInput = new Scanner(System.in);

                public void input()
                {
                System.out.println("Enter a name");
               		name = keyboardInput.nextLine();
 
                System.out.println("Entre an identification number");
		 identificationNumber = keyboardInput.nextLine();;

                System.out.println("Enter a grade point average");
		gradePointAvg = keyboardInput.nextLine();;
                
                
                }

                public void input(String targetKey)
                {
                System.out.println("Enter a name");
               		name = keyboardInput.nextLine();
 
                System.out.println("Entre an identification number");
		 identificationNumber = keyboardInput.nextLine();;

                System.out.println("Enter a grade point average");
		gradePointAvg = keyboardInput.nextLine();;
                
                
                }
     
} 