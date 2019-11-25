/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7problem30;



import javax.swing.JOptionPane;




public class Listing {                              
		private String name;                        //key field
		private String identificationNumber;
		private String gradePointAvg;
		
		
		public Listing(){
			name = "" ;
			identificationNumber = "" ;
			gradePointAvg = "" ;
		}
                
                public Listing(String newName, String newID, String newGPA)           
                 {
                        name = newName;
                        identificationNumber = newID;
                        gradePointAvg = newGPA;
                }
                

                
                public String getKey()          //getKey method
                {
                    return name;
                }
                
                public String setNewName()
                {
                    return name;
                }
                
                public void setNewName(String n)
                {
                    name = n;
                }
                
                public String getNewID()
                {
                    return identificationNumber;
                }

                public void setNewID(String newID)
                {
                    identificationNumber = newID;
                }
                
                public String getNewGPA()
                {
                    return gradePointAvg;
                }

                public void setNewGPA(String newGPA)
                {
                    gradePointAvg = newGPA;
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
