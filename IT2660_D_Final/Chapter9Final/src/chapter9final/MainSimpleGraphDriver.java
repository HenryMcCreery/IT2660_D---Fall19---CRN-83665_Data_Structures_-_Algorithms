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
public class MainSimpleGraphDriver {
    
   public static void main(String[] args)             //Main Method
    {
       int verticesCreation = 100;                         //tested with 1,000 and worked, later changed to 100,000
       Scanner userInput = new Scanner(System.in);
       Random randomNumber = new Random();
       
       LinkedList<breadthFirstVert> newBreadthFirstVert = new LinkedList<breadthFirstVert>();    //creates new linked lists for search algorithms
       LinkedList<depthFirstVert> newDepthFirstVert = new LinkedList<depthFirstVert>();
       LinkedList<newDijkstraVert> newDijkstraVert = new LinkedList<newDijkstraVert>();

       for (int i = 0; i < verticesCreation; i++)              //for loop creates number of vertices needed
       {
           int n = 1 + randomNumber.nextInt(300000);        //picks the random numbers as verticies within 1-300000
           System.out.println(n);                                       //prints numbers
           newBreadthFirstVert.add(new breadthFirstVert(n));            //uses n for the number of verticies to create and add method to assign
           newDepthFirstVert.add(new depthFirstVert(n));
           newDijkstraVert.add(new newDijkstraVert(n));
       }
            System.out.println();                                 //prints results
                  for (int i = 0; i < verticesCreation; i++)
       {
           int edgesNumber = 1 + randomNumber.nextInt(5);               //number of edges/weight created from 1-5

           for (int j = 0; j < edgesNumber; j++)
           {
               int k = randomNumber.nextInt(verticesCreation);

               newBreadthFirstVert.get(i).addNextVert(newBreadthFirstVert.get(k));                 //retrieves number i and adds the number of verticies k
               newDepthFirstVert.get(i).addNextVert(newDepthFirstVert.get(k));
               int distance = 1 + randomNumber.nextInt(300000);
               newDijkstraVert.get(i).addNextVert(new newDijkstraEdge(newDijkstraVert.get(i), newDijkstraVert.get(k), distance));
           }
       }
                        System.out.print("Enter a number to search for between 1 and 300,000: ");
                        int inputNumber = userInput.nextInt();
       
               breadthFirstVert bfResult = searchBreadthVert(newBreadthFirstVert, inputNumber);           //attempts algorithms, first result if fail, next if successful
               depthFirstVert dfResult = searchDepthVert(newDepthFirstVert, inputNumber);
               newDijkstraVert dijResult = searchDijkstraVert(newDijkstraVert, inputNumber);
               String result = "Failed";
               int bfsLength = 0;
               int bfsCount = 0;
               int dfsLength = 0;
               int dfsCount = 0;
               int dijkstraLength = 0;
               int dijkstraCount = 0;
               
            if (bfResult != null && dfResult != null && dijResult != null)               //if successful, retrieve results and display
       {
           result = "Successful";
          
           LinkedList<breadthFirstVert> breadthFirstListSize = new LinkedList<breadthFirstVert>();          //new linked lists
           LinkedList<depthFirstVert> depthFirstListSize = new LinkedList<depthFirstVert>();
           LinkedList<newDijkstraVert> dijsktraListListSize = new LinkedList<newDijkstraVert>();
          
           BreadthFirstAlgorithm newBreadthFirst = new BreadthFirstAlgorithm();                     //new algorithms
           bfsCount = newBreadthFirst.bfCall(bfResult, breadthFirstListSize);
           bfsLength = breadthFirstListSize.size();
          
           DepthFirstAlgorithm newDepthFirst = new DepthFirstAlgorithm();          
           dfsCount = newDepthFirst.dfCall(dfResult, depthFirstListSize);
           dfsLength = depthFirstListSize.size();  
          
           DijkstraAlgorithm newDijkstra = new DijkstraAlgorithm();
           dijkstraCount = newDijkstra.dijkPath(newDijkstraVert.get(0));
           dijsktraListListSize = newDijkstra.dijkstraSearch(dijResult);  
           dijkstraLength = dijsktraListListSize.size();
       }
            
        System.out.println("Breadth-First search was: " + result);                                         //user message if successful, gives result, shortes path, vertices 
       System.out.println("The length of the shortest path was: " + bfsLength);
       System.out.println("The total number of verticies examined was: " + bfsCount);          
       System.out.println("Depth-First search was: " + result);
       System.out.println("The length of the shortest path was: " + dfsLength);
       System.out.println("The total number of verticies examined was: " + dfsCount);          
       System.out.println("Dijkstra's Algorithm search was: " + result);
       System.out.println("The length of the shortest path was: " + dijkstraLength);
       System.out.println("The total number of verticies examined was: " + dijkstraCount);
    }
 
    
       private static breadthFirstVert searchBreadthVert(LinkedList<breadthFirstVert> newBreadthFirstVert, int inputNumber)
   {
       for (int i = 0; i < newBreadthFirstVert.size(); i++)
       {
           if (newBreadthFirstVert.get(i).getNumber() == inputNumber)
               return newBreadthFirstVert.get(i);
       }

       return null;
   }

   private static depthFirstVert searchDepthVert(LinkedList<depthFirstVert> newDepthFirstVert, int inputNumber)
   {
       for (int i = 0; i < newDepthFirstVert.size(); i++)
       {
           if (newDepthFirstVert.get(i).getNumber() == inputNumber)
               return newDepthFirstVert.get(i);
       }

       return null;
   }

   private static newDijkstraVert searchDijkstraVert(LinkedList<newDijkstraVert> newDijkstraVert, int inputNumber)
   {
       for (int i = 0; i < newDijkstraVert.size(); i++)
       {
           if (newDijkstraVert.get(i).getNumber() == inputNumber)
               return newDijkstraVert.get(i);
       }

       return null;
   }
}

