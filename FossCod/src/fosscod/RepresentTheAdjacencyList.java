/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fosscod;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author CHAMOD LAKMAL
 */
//create linked list using Array
public class RepresentTheAdjacencyList {
     public void list(int size,int[][] array)
    {
        System.out.println();
        System.out.println("-------Adjacency List-------");
        int[] array1=new int[size];
        int [][] list=new int[size][size];
        for(int i=0;i<size;i++)
        {
            array1[i]=i+1;
            for(int j=0;j<size;j++)
            {
                if(array[i][j]==1)
                {
                    list[i][j]=j+1;
                    
                }
                
            }
            
        }
        
        for(int i=0;i<size;i++)
        {
            System.out.print("["+array1[i]+"]");
            for(int j=0;j<size;j++)
            {  
                if(list[i][j]!=0){
            System.out.print("-->"+"["+list[i][j]+"]");  
            }
            }
            System.out.println();
        }
    }


//create linked list using Lnked list
 public void createAdjListUsingLinkedList(int size,int[][] array) 
 {
     List<Integer> l[]=new LinkedList[size*size];
     for(int i=0;i<size;i++)
         l[i]=new LinkedList<>();
     for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(array[i][j]==1)
                {
                    l[i].add(j+1);
                    
                }
                
            }
            
        }
     for(int i=0;i<size;i++)
         System.out.println(i+"==>"+l[i]);
     
         
         }
}
