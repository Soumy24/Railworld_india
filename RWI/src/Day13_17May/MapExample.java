package Day13_17May;

import java.util.*;
class MapExample{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){ //for each loop
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}