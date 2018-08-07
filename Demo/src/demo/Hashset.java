package demo;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(1);
		
		for(int value : hs){  
            System.out.print(value+" ");  
        } 
		
//		for(Iterator<Integer> iterator = hs.iterator();iterator.hasNext();){  
//            System.out.print(iterator.next()+" ");  
//        }  
//          
//        System.out.println();  
//        System.out.println("********************"); 
	}
}
