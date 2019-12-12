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
public class newDijkstraEdge {
    
 
   private newDijkstraVert firstVertex;
   private newDijkstraVert lastVertex;
   private int weight;

   public newDijkstraEdge(newDijkstraVert newFirstVertex, newDijkstraVert newLastVertex, int newWeight)

   {      
       firstVertex = newFirstVertex;
       lastVertex = newLastVertex;
       weight = newWeight;
   }

   public newDijkstraVert getFirstVertex()
   {
       return firstVertex;
   }

   public void setFirstVertex(newDijkstraVert newFirstVertex)
   {
       firstVertex = newFirstVertex;
   }

   public newDijkstraVert getLastVertex()
   {
       return lastVertex;
   }

   public void setLastVertex(newDijkstraVert newLastVertex)
   {
       lastVertex = newLastVertex;
   }
  
   public int getWeight()
   {
       return weight;
   }

   public void setWeight(int newWeight)
   {
       weight = newWeight;
   }
}