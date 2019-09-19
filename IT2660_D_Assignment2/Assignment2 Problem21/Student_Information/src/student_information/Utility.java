/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_information;



import java.util.Scanner;

public class Utility {                              //old Array class
    private int next;
    private int size;
    private StudentListings[] data;

        Scanner keyboardInput = new Scanner(System.in);
    
       {
           
       System.out.println("What is the maximum size of your data set?");  // starts user interactoon
                size = keyboardInput.nextInt();
                next =0;
           for(next=0;next<StudentListings.length; next++){
                data = new StudentListings [size];
           }
       }

    
public Utility()                                            //constructor
{
    next = 0;
    size = 100;
    data = new StudentListings[size];
}
public Utility(int s)
{
    
    size = s;
    next =0;
    data= new StudentListings[s];

}

public boolean insert (StudentListings newStudentListings)                    //insert method
{
    if(next>= size)
        return false;
    data[next] = newStudentListings.deepCopy();
    
    if(data[next] == null)
        return false;
    next = next + 1;
    return true;
}

public StudentListings fetch(String targetKey){                    //fetch method
    StudentListings student;
    StudentListings temp;
    
    int i = 0;
    while(i< next && !(data[i].compareTo(targetKey)==0))
    {
        i++;
    }
    if(i == next)
        return null;
    student = data[i].deepCopy();
    if(i !=0)
    {
        temp = data[i-1];
        data[i-1] = data[i];
        data[i] = temp;
    }
    return student;
}  
public boolean delete(String targetKey){                        //delete method
    int i=0;
    while(i< next && !(data[i].compareTo(targetKey)==0))
    {
        i++;
    }
    if(i== next)
        return false;
    data[i] =data[next -1];
    data[next-1] =null;
    next = next-1;
    return true;
    }

public boolean update(String targetKey, StudentListings newStudentListings)               //update method
{
    if(delete(targetKey)== false)
        return false;
    else if(insert(newStudentListings) == false)
        return false;
    else
        return true;
}

public void showAll()                               //show all method
{
    for(int i = 0; i< next; i++)
        System.out.println(data[i].toString());
}

    
    }

    

    
    




