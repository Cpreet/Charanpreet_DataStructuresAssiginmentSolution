package com.datastructureassiginmentsolution.classes;

import java.util.Scanner;

public class Building {
    public int[] buildingInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building");
        
        int buildLength = input.nextInt();
        int[] buildList = new int[buildLength];
        
        for (int i = 0; i < buildLength; i++ ) {
            System.out.println("Enter the size of the floor delivered on day: " + (i + 1));
            buildList[i] = input.nextInt();
        }
        input.close();

        return buildList;
    }

    
}