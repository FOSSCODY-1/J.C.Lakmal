package fosscod;
import java.util.Scanner;
public class InDegree {
    public void cal_indegree(int size,int[][] array,int node)
    {
       
        int count=0; 
        if(node<=size)
        {
            for(int j=0;j<size;j++)
            {
                if(array[j][node-1]==1)                
                {
                    count++;                                     
                }
                
            } 
            System.out.println("Number "+node+" Indegree is :"+count );
        }
        else
        {
            System.out.println("Error.Your node is not in the Graph ");
            
        }
           
        
        
    }
}
