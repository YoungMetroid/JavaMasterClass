package Java_Certification.DataStructures;

import java.util.Map;
import java.util.TreeMap;

public class Trees {


    public static void main(String []args){
        Map<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("L",55);
        treeMap.put("K",45);
        treeMap.put("G",30);
        treeMap.put("H",20);
        treeMap.put("I",25);
        treeMap.put("J",35);
        treeMap.put("D",1);
        treeMap.put("E",80);
        treeMap.put("F",40);
        treeMap.put("A",100);
        treeMap.put("B",0);
        treeMap.put("C",14);
        treeMap.put("C",14);



        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
