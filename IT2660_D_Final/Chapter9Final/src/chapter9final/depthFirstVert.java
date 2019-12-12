/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9final;

/**
 *
 * @author hjmcc
 */
import java.util.*; 
public class depthFirstVert {
    
    private int userDefinedNumber;
   private boolean completed;
   private LinkedList<depthFirstVert> vertices;

    
    public depthFirstVert(int newUserDefinedNumber)
   {
       userDefinedNumber = newUserDefinedNumber;
       vertices = new LinkedList<depthFirstVert>();
   }






   public int getNumber()
   {
       return userDefinedNumber;
   }
   
      public boolean visitedVertice()
   {
       return completed;
   }

   public void setVertice(boolean newVertice)
   {
       completed = newVertice;
   }
  
   public void setNumber(int newUserDefinedNumber)
   {
       userDefinedNumber = newUserDefinedNumber;
   }
   
      public void addNextVert(depthFirstVert newVert)
   {
       vertices.add(newVert);
   }

   public LinkedList<depthFirstVert> getNextVert()
   {
       return vertices;
   }

   public void setVert(LinkedList<depthFirstVert> newVert)
   {
       vertices = newVert;
   }
   
      public String toString()
   {
       return "" + userDefinedNumber;
   }

}
