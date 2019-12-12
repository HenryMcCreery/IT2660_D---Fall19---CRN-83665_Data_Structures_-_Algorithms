/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9final;
import java.util.*;  
/**
 *
 * @author hjmcc
 */
public class newDijkstraVert implements Comparable <newDijkstraVert>                 
{
   private int userDefinedNumber;
   private boolean completed;
   private int lengthTraveled = Integer.MAX_VALUE;
   private newDijkstraVert predecessor;
   private LinkedList<newDijkstraEdge> vertexDistance;      

   public newDijkstraVert(int newNumber)
   {
       userDefinedNumber = newNumber;
       vertexDistance = new LinkedList<newDijkstraEdge>();
   }
   public int getNumber()
   {
       return userDefinedNumber;
   }

   public void setNumber(int newNumber)
   {
       userDefinedNumber = newNumber;
   }  
      
   public boolean isVisited()
   {
       return completed;
   }

   public void setVisited(boolean newVisited)
   {
       completed = newVisited;
   }
  
   public int getLengthTraveled()
   {
       return lengthTraveled;
   }

   public void setLengthTraveled(int newLengthTraveled)
   {
       lengthTraveled = newLengthTraveled;
   }
  
   public newDijkstraVert getPredecessor()
   {
       return predecessor;
   }

   public void setPredecessor(newDijkstraVert newPredecessor)
   {
       predecessor = newPredecessor;
   }
  
   public void addNextVert(newDijkstraEdge edge)
   {
       vertexDistance.add(edge);
   }

   public LinkedList<newDijkstraEdge> getOneVertex()
   {
       return vertexDistance;
   }
  
   public void setNeighbours(LinkedList<newDijkstraEdge> newNeighbours)
   {
       vertexDistance = newNeighbours;
   }

   
   public int compareTo(newDijkstraVert otherVertex)
   {
       return Integer.compare(lengthTraveled, otherVertex.getLengthTraveled());
   }
  
   
   public String toString()
   {
       return "" + userDefinedNumber;
   }
}

