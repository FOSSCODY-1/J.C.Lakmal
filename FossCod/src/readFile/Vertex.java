/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readFile;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class Vertex {
    String name;
    Neighbor adjList;

     Vertex(String name,Neighbor neighbors) {
         this.name=name;
         this.adjList=neighbors;
         
    }
    
    
}
