package main.java.lu.study;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {

    record Element(int id, String value){}

    public static void main(String[] args){
        Element e1 = new Element(1, "val1");
        Element e2 = new Element(2, "val2");
        Element e_1_1 = new Element(1, "valxxx");

        Map<Object, Element> hashMap = new HashMap<>();

        hashMap.put(e1.id(), e1);
        hashMap.put(e2.id(), e2);
        hashMap.put(e_1_1.id(), e_1_1); //as there is already an id w

        //as the key can be any objets we can assign a string also
        hashMap.put("blablabla", e1); //in this case the object e1 will exist

        //accessing a value of key 1
        System.out.println(hashMap.get(1).value()); //it will print valxxx

        hashMap.remove(1); //it will remove the element

        //iterate over it
        for(Object key: hashMap.keySet()){
            Element eLement = hashMap.get(key);
            System.out.println("Key " + key + " for value " + eLement.value()); //it will print val2 and val1
        }


    }

}
