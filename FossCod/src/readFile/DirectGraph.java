/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class DirectGraph {
    Vertex[] adjLists;
    public DirectGraph(String file) throws FileNotFoundException{
        Scanner sc=new Scanner(new File(file));
        adjLists=new Vertex[sc.nextInt()];
        
        //read vertices
        for(int v=0;v<adjLists.length;v++)
        {
            adjLists[v]=new Vertex(sc.next(),null);
        }
        //read edges
        while(sc.hasNext()){
            int v1=indexForName(sc.next());
            int v2=indexForName(sc.next());
            
            adjLists[v1].adjList=new Neighbor(v2,adjLists[v1].adjList);
            
     
        }
    }
    int indexForName(String name)
    {
        for(int v=0;v<adjLists.length;v++)
        {
            if(adjLists[v].name.equals(name)){
                return v;
            }
        }
        return -1;
    }
   public void print(){
       System.out.println();
       for(int v=0;v<adjLists.length;v++)
       {
           System.out.print(adjLists[v].name);
           for(Neighbor nbr=adjLists[v].adjList;nbr!=null;nbr=nbr.next){
               System.out.print("-->"+adjLists[nbr.vertexNum].name);
           }
           System.out.println("\n");
       }
   }
   
}
