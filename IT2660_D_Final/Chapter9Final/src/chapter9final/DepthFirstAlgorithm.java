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
public class DepthFirstAlgorithm {
    

      public DepthFirstAlgorithm()                                      //uses a stack for Depth-First
   {}

   public int dfCall(depthFirstVert vertices, LinkedList<depthFirstVert> list)
   {
       int count = 0;
       Stack<depthFirstVert> stack = new Stack<depthFirstVert>();
       stack.add(vertices);
       
              while (!stack.isEmpty())
       {
           count++;
           depthFirstVert thisVert = stack.pop();
           if (!thisVert.visitedVertice())
           {
               list.add(thisVert);
               thisVert.setVertice(true);
           }
           
                      LinkedList<depthFirstVert> NextVert = thisVert.getNextVert();
           for (int i = 0; i < NextVert.size(); i++)
           {
               count++;
               depthFirstVert temp = NextVert.get(i);
               if (temp != null && !temp.visitedVertice())
               {
                   stack.add(temp);
               }
           }
       }

       return count;
   }
}
