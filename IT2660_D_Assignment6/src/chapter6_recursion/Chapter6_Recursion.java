/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6_recursion;




public class Chapter6_Recursion {

   
    public static void main(String[] args) {
      
         
        int[] randomSequence=new int[100];          //Creates array for the random sequence
        
        
        for (int i=0;i<randomSequence.length;i++)
        {
            randomSequence[i] = (int)Math.floor(Math.random() * 101);           //fills the array with random numbers
        }
        
        System.out.println("Random sequence");
          for(int i= 0; i < randomSequence.length; i++)
			{
				System.out.print(randomSequence[i] + "\n" );        //prints array of random numbers
			}
          
          
          randomSequence = recursive_merge_sort(randomSequence);
          
        System.out.println("Ordered top down sequence ");
          for(int i = 0; i < randomSequence.length; i++)
			{
				System.out.print(randomSequence[i] + "\n" );            //prints array of ordered numbers
			}
        
    }
    
    
    public static int[] recursive_merge_sort(int[] randomSequence)
    {
        
        
        if(randomSequence.length <= 1)                     
        {
            return randomSequence;
        }
        
                         int split = randomSequence.length/2;                   //splits random list into two arrays and sorts
			 int[] left = new int[split];
			 int[] right = new int[randomSequence.length - split];
			 int[] result = new int[randomSequence.length];   
					 
			 for(int i = 0; i < split; i++)
			 {
				left[i] = randomSequence[i];
			 }
			 
			 int x = 0;
			 for(int j = split; j < randomSequence.length; j++)
			 {
				right[x] = randomSequence[j];
				x++;  
			 }
			 
			 
			 left = recursive_merge_sort(left);
			 right = recursive_merge_sort(right);
			 
			  
			 result = merge(left, right); 
			 
			 return result;    
      }
		
		public static int[] merge(int[] left, int[] right)
		{
		  int resultLength = left.length + right.length;    //final list thats sorted
		  int[] result = new int[resultLength]; 
		  int leftIndex = 0;
		  int rightIndex = 0;
		  int resultIndex = 0; 
		  
		  while (leftIndex < left.length || rightIndex < right.length)
		  {
			 if (leftIndex < left.length && rightIndex < right.length)
			 {
				
				if (left[leftIndex] <= right[rightIndex]) 
				{
				   result[resultIndex] = left[leftIndex];
				   leftIndex++;
				   resultIndex++; 
				}
				
				
				else                            
				{
				   result[resultIndex] = right[rightIndex];
				   rightIndex++;
				   resultIndex++; 
				}

			 }
			 
			 else if (leftIndex < left.length)
			 {
				result[resultIndex] = left[leftIndex];
				   leftIndex++;
				   resultIndex++;
			 }
			 else if (rightIndex < right.length)
			 {
				result[resultIndex] = right[rightIndex];
				   rightIndex++;
				   resultIndex++;
			 }
		  }
		  return result; 
		}
}
    

