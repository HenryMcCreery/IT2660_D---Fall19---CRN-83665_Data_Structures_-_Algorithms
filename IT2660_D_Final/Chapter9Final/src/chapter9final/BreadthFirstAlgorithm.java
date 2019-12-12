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
public class BreadthFirstAlgorithm {
    
    
       public BreadthFirstAlgorithm()                                               //uses a queue for breadth-first
   {}

   public int bfCall(breadthFirstVert vertices, LinkedList<breadthFirstVert> list)
   {
       int count = 0;
       Queue<breadthFirstVert> queue = new LinkedList<breadthFirstVert>();

       queue.add(vertices);
       vertices.setVertice(true);

       while (!queue.isEmpty())
       {
           breadthFirstVert thisVert = queue.remove();
           list.add(thisVert);
           LinkedList<breadthFirstVert> NextVert = thisVert.getNextVert();
           for (int i = 0; i < NextVert.size(); i++)
           {
               count++;
               breadthFirstVert temp = NextVert.get(i);
               if (temp != null && !temp.visitedVertice())
               {
                   queue.add(temp);
                   temp.setVertice(true);                  
               }
           }
       }

       return count;
   }
} 