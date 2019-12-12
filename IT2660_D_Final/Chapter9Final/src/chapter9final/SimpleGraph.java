/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package chapter9final;

import java.util.Stack;


class SimpleGraph {
Listing vertex[];
int edge [][];
int max, numberOfVertices;

public SimpleGraph(int n)
{
    vertex = new Listing[n];
    edge = new int[n][n];
    max = n; numberOfVertices =0;
}

public boolean insertVertex(int vertexNumber, Listing newListing)
{
if(vertexNumber >= max)
    return false;
vertex[vertexNumber] = newListing.deepCopy(); numberOfVertices++;
return true;
}

public boolean insertEdge(int fromVertex, int toVertex)
{ if(vertex[fromVertex] == null || vertex[toVertex] == null)
    return false;
edge[fromVertex][toVertex] = 1;
return true;
}
public void showVertex(int vertexNumber)
{
    System.out.println(vertex[vertexNumber]);
}
public void showEdges(int vertexNumber){
    for(int column = 0; column <numberOfVertices; column++)
    {
        if(edge[vertexNumber][column] == 1)
            System.out.println(vertexNumber + "," + column);
    }
}
}
        
        
*/