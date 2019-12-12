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
public class breadthFirstVert {
    


   private int userDefinedNumber;
   private boolean completed;
   private LinkedList<breadthFirstVert> vertices;

   public breadthFirstVert(int newUserDefinedNumber)
   {
       userDefinedNumber = newUserDefinedNumber;
       vertices = new LinkedList<breadthFirstVert>();
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
   
      public void addNextVert(breadthFirstVert newVert)
   {
       vertices.add(newVert);
   }

   public LinkedList<breadthFirstVert> getNextVert()
   {
       return vertices;
   }

   public void setVert(LinkedList<breadthFirstVert> newVert)
   {
       vertices = newVert;
   }
   
      public String toString()
   {
       return "" + userDefinedNumber;
   }

}
