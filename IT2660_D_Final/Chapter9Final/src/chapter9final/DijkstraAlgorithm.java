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
public class DijkstraAlgorithm
{
   public DijkstraAlgorithm()
   {}
  
   public int dijkPath(newDijkstraVert source)
   {
       int count = 0;
       source.setLengthTraveled(0);
       PriorityQueue<newDijkstraVert> pq = new PriorityQueue<newDijkstraVert>();
       pq.add(source);
       source.setVisited(true);

       while (!pq.isEmpty())
       {
           count++;
          
           newDijkstraVert thisVert = pq.poll();

           for (newDijkstraEdge currEdge : thisVert.getOneVertex())
           {
               count++;
               newDijkstraVert temp = currEdge.getLastVertex();
               if (!temp.isVisited())
               {
                   int currDist = thisVert.getLengthTraveled() + currEdge.getWeight();

                   if (currDist < temp.getLengthTraveled())
                   {
                       pq.remove(temp);
                       temp.setLengthTraveled(currDist);
                       temp.setPredecessor(thisVert);
                       pq.add(temp);
                   }
               }
           }
           thisVert.setVisited(true);
       }
      
       return count;
   }

   public LinkedList<newDijkstraVert> dijkstraSearch(newDijkstraVert target)
   {
       LinkedList<newDijkstraVert> nodes = new LinkedList<newDijkstraVert>();

       for (newDijkstraVert currNode = target; currNode != null; currNode = currNode.getPredecessor())
       {
           nodes.add(currNode);
       }

       Collections.reverse(nodes);      
      
       return nodes;
   }

}