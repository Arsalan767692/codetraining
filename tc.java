package coding;

import java.util.*;



public class tc {
    public static void main(String args[])
    {
        NavigableSet<Integer> obj=new TreeSet <Integer>();
        NavigableSet<Integer> obj1=new TreeSet <Integer>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(8);
        obj1.add(7);
        obj1.add(3);
        obj1.pollFirst();
        obj1.pollLast();
        System.out.println(obj);
    
        System.out.println(obj.lower(4));
        System.out.println(obj1.addAll(obj));
        System.out.println(obj);


    }
    
}
