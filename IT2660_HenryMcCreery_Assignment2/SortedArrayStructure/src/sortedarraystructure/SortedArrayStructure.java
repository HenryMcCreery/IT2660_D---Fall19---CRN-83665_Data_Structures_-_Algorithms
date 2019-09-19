
package sortedarraystructure;

import java.util.Scanner;

public class SortedArrayStructure {

Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
                   
 
    {
       SortedArrayAlgorithms sortedArrayStructure = new SortedArrayAlgorithms();
       Listings temp;
       
       
       Listings Adam = new Listings("Adam", "1111", "4.0");
       Listings Cade = new Listings("Cade", "2222", "3.9");
       Listings Ernie = new Listings("Ernie", "3333", "3.8");
       Listings Frank = new Listings("Frank", "4444", "3.7");
       
       System.out.println(Adam.toString());
       
       System.out.println("\nTest of Fetch and Insert\n");
       
       System.out.println(sortedArrayStructure.insert(Adam));
       System.out.println(sortedArrayStructure.insert(Cade));
       
       System.out.println(sortedArrayStructure.fetch("Adam"));
       System.out.println(sortedArrayStructure.fetch("Cade"));     
       System.out.println(sortedArrayStructure.fetch("Ernie"));
       
       temp = sortedArrayStructure.fetch("Cade");
       System.out.println(temp.toString());
       
       System.out.println(sortedArrayStructure.insert(Ernie));
       
       System.out.println("\nTest of Delete\n");
       System.out.println(sortedArrayStructure.delete("Cade"));
       System.out.println(sortedArrayStructure.fetch("Cade"));
       
       System.out.println("\ntest of Update\n");
       System.out.println(sortedArrayStructure.insert(Frank));
       System.out.println(sortedArrayStructure.insert(Adam));
       System.out.println(sortedArrayStructure.update("Adam", Frank));
       System.out.println(sortedArrayStructure.fetch("Adam"));
       
    }
            
            
        
        
    }
    
}

