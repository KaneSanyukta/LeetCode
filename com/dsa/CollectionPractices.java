package com.dsa;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPractices {
    public static void collectionPractices(){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(30);
        printList(intList);
        intList.remove(10);
        printList(intList);
    }

    public static void printList(ArrayList<Integer> list){
        for(int i : list){
            System.out.println(i);
        }
    }
}
