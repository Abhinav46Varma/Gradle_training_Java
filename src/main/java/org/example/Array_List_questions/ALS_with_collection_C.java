package org.example.Array_List_questions;

import java.util.ArrayList;
import java.util.Collections;

public class ALS_with_collection_C {
    ArrayList<Integer> myArr1 = new ArrayList<>();

    public static void main(String[] args) {
        ALS_with_collection_C obj = new ALS_with_collection_C();

        obj.addElements();

        System.out.println("Original array:");
        obj.printArray();

        System.out.println("Sorting the array in ascending order:");
        Collections.sort(obj.myArr1);
        obj.printArray();

        System.out.println("Sorting the array in descending order:");
        Collections.sort(obj.myArr1, Collections.reverseOrder());
        obj.printArray();
    }

    public void addElements() {
        myArr1.add(5);
        myArr1.add(2);
        myArr1.add(8);
        myArr1.add(1);
        myArr1.add(4);
    }

    public void printArray() {
        for(Integer num: myArr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
