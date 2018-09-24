/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fosscod;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class OutDegree {
    public void cal_outdegree(int size,int[][] array,int node)
    {
       
        int count=0; 
        if(node<=size)
        {
            for(int j=0;j<size;j++)
            {
                if(array[node-1][j]==1)                
                {
                    count++;                                     
                }
                
            } 
            System.out.println("Number "+node+" Outdegree is :"+count );
        }
        else
        {
            System.out.println("Error.Your node is not in the Graph ");
            
        }
           
        
        
    }
}
