
package chapter4problem27;



    
public class StudentRecords<T> {                         
     
	
	private Node h;  


    public StudentRecords()
    {  h = new Node();  
        h.l = null;
        h.next = null;
    }
    
    
    public boolean insert(Listing newListing)
    { 
        KeyMode node = (KeyMode) newListing;
        Node n = new Node();
        if(n == null) 
           return false;
        else
        { n.next = h.next; 
           h.next = n;
           n.l = (T)node.deepCopy();
           return true;
        }
   }
    
    
public T fetch(String targetKey)
 {  Node p = h.next;
 
 KeyMode node = (KeyMode) p.l; 
     while (p != null  &&  !(node.compareTo(targetKey) == 0))
     {  p = p.next;
     }
     if(p != null)
        return (T)node.deepCopy();
     else
        return null;
  }


  public boolean delete(String targetKey)
  {  Node q = h;
      Node p = h.next;
      
      KeyMode node = (KeyMode) p.l;
      
      while (p != null && !(node.compareTo(targetKey) == 0))
      {  q = p;
          p = p.next;
      }
      if(p != null)
      {   q.next = p.next;
           return true;
      }
      else
           return false;
  }
  
  
  
  public boolean update(String targetKey, T newNode)
    {
        if(delete(targetKey) == false)
        {
            return false;
        }
        else{
        return true;
        }
    }

  
  
  public void showAll()
  { Node p = h.next;
     while (p != null) 
     {   System.out.println(p.l.toString( ));
          p = p.next;
     }
   }

  
  public class Node
  {  private T l;
      private Node next;
      public Node()
     {
     }
   }
  
  public interface KeyMode
  {
        public abstract KeyMode deepCopy();                                 //fig 2.36
        public abstract int compareTo(String targetKey);
        public abstract String toString();
  }
  
}
