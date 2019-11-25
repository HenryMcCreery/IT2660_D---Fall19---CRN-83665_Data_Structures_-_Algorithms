/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7problem31;

/**
 *
 * @author hjmcc
 */
public class MainBinaryTree {
    public static void main (String[] args){
            
            
    BinaryTree t = new BinaryTree();
    Listing newL;
    Listing newL1 = new Listing("John", "11111", "1.1");
    Listing newL2 = new Listing("Nate", "22222", "2.2");
    Listing newL3 = new Listing("Kelly", "33333", "3.3");
    Listing newL4 = new Listing("James", "44444", "4.0");
    Listing newL5 = new Listing("Sam", "55555", "3.2");
    Listing newL6 = new Listing("Heather", "66666", "2.7");
    
    t.insert(newL1);
    t.insert(newL2);
    t.insert(newL3);
    t.insert(newL4);
    
    System.out.println(t.fetch("Kelly"));
    System.out.println(t.fetch("Nate"));
    System.out.println(t.fetch("James"));   
    
    t.delete("Kelly");
    System.out.println(t.fetch("Kelly"));

    t.delete("Nate");
    System.out.println(t.fetch("Nate"));
    
    t.delete("James");
    System.out.println(t.fetch("James"));
    
    t.update("Heather", newL3);
    
    System.out.println(t.fetch("Kelly"));
    System.out.println(t.fetch("Heather"));
    
    
    }
            }
  

