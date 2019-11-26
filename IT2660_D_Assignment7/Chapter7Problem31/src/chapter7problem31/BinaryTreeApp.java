/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7problem31;
import java.util.Scanner;
        
        
public class BinaryTreeApp {
    
    
            public static void main(String[] args){             //main method
            
            Scanner keyboardInput = new Scanner(System.in);
           
            String targetKey= "";
            int userChoice;
            
       
            {
                Listing newListing =new Listing();                           //for new listing
                
                               //implements insert, delete, fetch, update

        
             
             
        do {
            BinaryTree newBinaryTree = new BinaryTree();           
                                     
               
                System.out.println("Enter your choice ");                               //gives choices to user
                System.out.println("Enter 1 to insert a new student's information,\n" +       
                "Enter 2 to fetch and output a student's information,\n" +
                "Enter 3 to delete a student's information,\n" +
                "Enter 4 to update a student's information,\n" +
                "Enter 5 to output all the student information, and\n" + 
                "Enter 6 to exit the program"); 
                userChoice = keyboardInput.nextInt();
                                        

            if(userChoice == 1)
                {
                
                    System.out.println("Enter a student's name, student identification, and gpa");
                    newListing.input();
                    newBinaryTree.insert(newListing);                                      //instructions for adding new studentdata
                    if(newBinaryTree.insert(newListing))
                            {
                         System.out.println("Added data");
                            }
                            
                }
            
            
            else if(userChoice == 2)
            {

                System.out.println("Search for a student name ");                //returns student info
                targetKey = keyboardInput.nextLine();
                newBinaryTree.fetch(targetKey);
                if(newBinaryTree.fetch(targetKey) !=null)
                {
                    System.out.println("Here is your record " + newBinaryTree.fetch(targetKey).toString());
                }
            }
            
            else if(userChoice == 3)                                                //deletes record
            {
                System.out.println(" Please enter a student file to delete");
                targetKey = keyboardInput.nextLine();
                
                if(newBinaryTree.delete(targetKey))
                {
                    System.out.println("Deleted " + targetKey + " ");
                }
            }
                else if(userChoice ==4)
                {
               
                    newListing.input();                                     //retrieves student file, can change and update the information
                    newBinaryTree.update(targetKey, newListing);
                    if(newBinaryTree.update(targetKey, newListing))
                    {
                        System.out.println("Updated " + targetKey);
                    }
                }
                
                else if(userChoice ==5)                                     //shows all records on file
                {
                    System.out.println("These are all the student records");
                    System.out.println(newListing.toString());
                }
                
                else if (userChoice ==6)                                        //ends program
                {
                    System.out.println("Exiting");
                
                    System.exit(6);
                }
                
                if(userChoice < 1 || userChoice > 6)                            //error message
                {
                    System.out.println ("Your choice was invalid");
                }
        
        }while(userChoice != 6);
        
       }                    
                    
        }  

            
        }
        

