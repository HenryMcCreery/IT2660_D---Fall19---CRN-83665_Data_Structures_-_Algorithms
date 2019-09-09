
package listingarray;

import java.util.Scanner;


public class ListingArray {


    public static void main(String[] args) {                //main method

                Scanner input = new Scanner(System.in);
        
        Listings[] threeListings = new Listings [3];            //array declaration
        String name;
        int age;
        
        for (int i = 0; i < threeListings.length;i++){          //user input fills array
            System.out.println("Enter name ");
            name = input.next();
            threeListings[i] = new Listings();
            threeListings[i].setName(name);           
            
            System.out.println("Enter age ");
            age= input.nextInt();

            threeListings[i].setAge(age);
      
        }
        
            
            System.out.println("\n" + "In reverse order: ");                //displays results in reverse
            for (int i=threeListings.length-1; i>=0;i--)
            {
            System.out.println(threeListings[i].getName() + " " + threeListings[i].getAge());
        }
        
        }

        
        
    }
    

