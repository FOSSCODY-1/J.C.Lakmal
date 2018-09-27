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
public class Neighbor {

            public int vertexNum;
            public Neighbor next;
            public Neighbor(int vnum,Neighbor nbr)
            {
                this.vertexNum=vnum;
                next=nbr;                
            }   
}
