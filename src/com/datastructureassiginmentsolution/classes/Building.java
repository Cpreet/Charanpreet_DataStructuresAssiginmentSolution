package com.datastructureassiginmentsolution.classes;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

public class Building {

    Stack<Integer> buildStack = new Stack<>();
    ArrayList<Integer> floorList = new ArrayList<>();

    public void buildingInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building");
        
        int buildLength = input.nextInt();
        
        for (int i = 0; i < buildLength; i++ ) {
            System.out.println("Enter the size of the floor delivered on day: " + (i + 1));
            floorList.add(input.nextInt());
        }
        input.close();
    }

    public void buildOrder() {
        //find max floor size
        Integer max = Collections.max(floorList);
        for (int i = 0; i < floorList.size(); i++) {
            System.out.println("Floors built on Day " + (i+1) +": ");
            if (floorList.get(i) >= max) {
                System.out.print(floorList.get(i) + " ");
                floorList.remove(i);
                max = Collections.max(floorList);
                try 
                {
                    while (buildStack.peek() >= max) {
                        System.out.print(buildStack.pop() + " ");
                    }
                }
                catch (EmptyStackException e) {
                    System.out.print(" ");
                }
            }
            else {
                buildStack.push(floorList.get(i));
                floorList.remove(i);
            }
        }
    }
}