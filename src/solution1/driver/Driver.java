package solution1.driver;

import java.util.Scanner;

import solution1.service.Construction;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Enter the total no of floors in the building");

        Scanner scn = new Scanner(System.in);
        int floors = scn.nextInt();

        int[] floorSize = new int[floors];
        int maxSize = Integer.MIN_VALUE;

        for (int i = 0; i < floors; i++) {
            System.out.println("enter the floor size given on day : " + (i + 1));
            int size = scn.nextInt();
            floorSize[i] = size;

            if (maxSize < size)
                maxSize = size;
        }

        Construction construction = new Construction();
        construction.order(floors, floorSize, maxSize);

    }
}
