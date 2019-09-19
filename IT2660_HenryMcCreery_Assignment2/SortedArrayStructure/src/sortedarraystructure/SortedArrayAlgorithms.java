/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedarraystructure;

import java.util.Scanner;

public class SortedArrayAlgorithms {


    private int next;
    private int arraySize;
    private Listings[] data;
    Scanner input = new Scanner(System.in);
    
    public SortedArrayAlgorithms()
            
    {
       System.out.println("What is the maximum size of your data set?");  
                arraySize = input.nextInt();
                next = 0;          
                data = new Listings [arraySize];
    }
    
    
        public Listings fetch(String targetKey){
            
            
            Listings node;
            Listings temp;
            
            int i = 0;
            while(i< next && !(data[i].compareTo(targetKey) == 0))
            {
                i++;
                
            }
            if (i == next)
                return null;
            
            node = data[i].deepCopy();
            
            if(i!=0)
            {
                temp = data[i-1];
                data[i-1] = data[i];
                data[i] = temp;
                
            }
            return node;
        }
        
        public boolean delete(String targetKey){
            
            int i = 0;
            while(i< next && !(data[i].compareTo(targetKey) == 0))
            {
                i++;
            }
            if (i == next)
                return false;
            
            data[i] = data[next-1];
            data[next-1] = null;
            next = next -1;
            return true;
        }
        
        public boolean insert(Listings newListing)
        {
            if(next >= arraySize)
                return false;
            
            data[next] = newListing.deepCopy();
            
            if(data[next] == null)
                return false;
            
            next = next + 1;
            return true;
        }
        public boolean update(String targetKey, Listings newListing ){
                if (delete(targetKey) == false)
                    return false;
                
                else if(insert(newListing) == false)
                    return false;
                else
                    return true;
                
                
            }
        public void showAll()
        {
            for(int i =0; i <next; i++)
                System.out.println(data[i].toString());
        }
        }
