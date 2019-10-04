
package chapter4problem27;

import java.util.Scanner;




public class Driver_Program {
    
    public static void main (String[] args){       //main method

            Scanner keyboardInput = new Scanner(System.in);
            
        
        
        System.out.println("Please input the initial number of students and their data.");
        System.out.println("How many student records are you entering?");
        
        
            String targetKey= "";
            int userSizeInput =0;
            int userChoice =0;    
                userSizeInput = keyboardInput.nextInt();


           
try{
            

    
    
                       while(userChoice <=6)
                       {

                           
                SinglyLinkedList<Listing> list = new SinglyLinkedList<Listing>();
            
            Listing l1 = new Listing ("Bill", "1st Avenue", "5555");
            Listing l2 = new Listing ("Jane", "2nd Avenue", "6666");
            Listing l3 = new Listing ("Ed", "3rd Avenue", "7777");
            
                        list.showAll();
                           
                              //gives choices to user
                System.out.println("Enter 1 to insert a new student's information,\n" +       
                "Enter 2 to fetch and output a student's information,\n" +
                "Enter 3 to delete a student's information,\n" +
                "Enter 4 to update a student's information,\n" +
                "Enter 5 to output all the student information, and\n" + 
                "Enter 6 to exit the program"); 
                System.out.println("Enter your choice "); 
                
                userChoice = keyboardInput.nextInt();                
        

        
        
                    if(userChoice == 1)
                {
                
                    Listing newListing = new Listing();
                    newListing.input();
                    list.insert(newListing);
                
                    System.out.println("Inserted this record" + list.fetch(newListing.getName()));
                    System.out.println("operation complete");
                    
                    
                            
                }else if (userChoice == 2)
                {
                    System.out.println("Enter a student's name to fetch their record");
                    targetKey = keyboardInput.nextLine();
                    if(list.fetch(targetKey) != null)
                    {
                        System.out.println(list.fetch(targetKey).toString());
                        System.out.println("operation complete");
                    }
                    else
                    {
                        System.out.println(targetKey + "node not in structure");
                    }
                
                }else if(userChoice == 3)
                {
                    System.out.println("Enter a student name to delete the record");
                    targetKey = keyboardInput.nextLine();
                    System.out.println("Deleting record" + targetKey);
                    if(list.delete(targetKey))
                    {
                        System.out.println("Deleted record" + targetKey + "\n");
                        System.out.println("operation complete");
                    }else
                    {
                        System.out.println(targetKey + "node not in structure");
                    }   
                }else if(userChoice == 4)
                {
                    System.out.println("Please enter a student name to update the record:");
                    targetKey = keyboardInput.nextLine();
                    Listing newListing = new Listing();
                    newListing.input(targetKey);
                    if(list.update(targetKey, newListing))
                    {
                        System.out.println("Updated " + targetKey + "record\n");
                    }else
                    {
                        System.out.println(targetKey + " is not in the data set."+ "\n");
                    }
                    
                }else if(userChoice == 5)
                {
                    System.out.println("Here are all the records: ");
                    list.showAll();
                }
                else if(userChoice == 6)
                    
                {
                    System.exit(0);
                }
                

                }
     
            }catch(Exception ex)
                {
                    System.out.println("Please try again.");
                }
    }
}
            