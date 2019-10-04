
package chapter4problem26;

public class Driver_Program {
    
    public static void main (String[] args)       //main method
    {
               
                    
            SinglyLinkedList<Listing> list = new SinglyLinkedList<Listing>();
            
            Listing l1 = new Listing ("Bill", "1st Avenue", "5555");
            Listing l2 = new Listing ("Jane", "2nd Avenue", "6666");
            Listing l3 = new Listing ("Ed", "3rd Avenue", "7777");
            list.insert(l1);
            list.insert(l2);
            list.insert(l3);
            list.showAll();
            
            l3 = list.fetch("Ed");
            System.out.println(l3.toString());
            
            list.delete("Jane");
            list.showAll();
            list.update("Ed", l2);
            list.showAll();
            

            
    }
    
}
