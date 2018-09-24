/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fosscod;

import java.util.Scanner;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class FossCod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*   Scanner s = new Scanner(System.in);
        System.out.println("-------adjacency matrix--------");
        System.out.print("Enter your number of nodes in Graph :");
         int size = s.nextInt();   
          int[][] array=new int[size][size];
        System.out.println("you must enter numbers 1 and 0 ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("Enter a node num row,col ="+"["+(i+1)+"]"+"["+(j+1)+"]"+"=");
                array[i][j]=s.nextInt();
                if(array[i][j]==0||array[i][j]==1)
                {                    
                }
                else
                {
                    System.out.println("Error.You must Enter 1 and 0 only");
                    System.exit(0);
                }                
            }            
        }
       int choise;
   /* do
    {
        System.out.println("");
        System.out.println("*********MENU***********");
        System.out.println("Enter 1 Represent the Adjacency List Using Array ");
        System.out.println("Enter 2 Represent the Adjacency List Using Linked List ");
        System.out.println("Enter 3 get the indegree ");
        System.out.println("Enter 4 get the outdegree ");
        System.out.println("Enter 5 to exit ");
        System.out.print("Enter your choise :");
        choise=s.nextInt();
      switch(choise)
      {
      case 1:
          RepresentTheAdjacencyList m=new RepresentTheAdjacencyList();
          m.list(size, array);
        break;
      case 2:
          RepresentTheAdjacencyList l=new RepresentTheAdjacencyList();
          l.createAdjListUsingLinkedList(size, array);
        break;
      case 3:
           System.out.print("Enter your node, calculate the indegree :");
           int node = s.nextInt();
           InDegree i=new InDegree();
           i.cal_indegree(size,array,node);
        break;
      case 4:
             System.out.print("Enter your node, calculate the Outdegree :");
             int node1 = s.nextInt();
             OutDegree o=new OutDegree();
             o.cal_outdegree(size, array, node1);
        break;
      case 5:
            System.exit(0);
        break;
      case 6:
       
        break;
      default:
      System.out.println("Invalid input ");
      }

    }
    while(choise!=5);*/
      Graph g=new Graph(10);
      g.addEdge(0,2,10);
      g.addEdge(0, 5, 15);
        System.out.println(g);
    }
    
}
