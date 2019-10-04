
package chapter4problem25;

import javax.swing.JOptionPane;




public class Listing {                              //node class changed to listing class
		private String name;
		private String identificationNumber;
		private String gradePointAvg;
		
		
                        public Listing()           
        {
            name = "";
            identificationNumber = "";
            gradePointAvg = "";
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
                    return(name.compareTo(targetKey));
                }
                public void input()
                {
                    name= JOptionPane.showInputDialog("Enter a name");
                    identificationNumber = JOptionPane.showInputDialog("Entre an identification number");
                    gradePointAvg = JOptionPane.showInputDialog("Enter a grade point average");
                }
         
} 


