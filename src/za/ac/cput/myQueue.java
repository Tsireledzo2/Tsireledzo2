package za.ac.cput;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Tsire
 */
public class myQueue {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        
        q.add("kakashi");
        q.add("Obito");
        q.add("Madara");
        q.add("L");
        q.add("Light");
        q.remove();
        Object x = q.peek();
        q.remove();
        q.remove();
        q.add(x);
       // q.add(q.remove());
        System.out.println(q.size());
       /* 
        if(q.size()>3 && q.size()<6){
            System.out.println(q);
        }else
            System.out.println(q.peek());
        
        if(q.peek().equals("Light")){
            q.clear();
        }else
            System.out.println(q.peek());
        
        //System.out.println(q.peek());
       
        for(int i = 1;i<3;i++){
            q.remove();
            //count++;
        }
        System.out.println(q +"\n-------------------------\nNumber of objects: "+q.size());*/
       
       
    }
}
