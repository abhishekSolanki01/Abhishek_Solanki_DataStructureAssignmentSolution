package solution1.service;

public class Construction {
    public void order(int floors, int floorSize[], int maxSize) {
        System.out.println("The order of construction is as follows");

        /*
         * -> floorArrivingOrder is array contains the order of arriving where index
         * of array dipicts the floor size. 
         * -> arriving order starts from 1. 
         * -> 0 is considred as not arrived yet.
         */
        int[] floorArrivingOrder = new int[floors + 1];

        for (int i = 0; i < floors; i++) {
            floorArrivingOrder[floorSize[i]] = i + 1;
            if (floorSize[i] == maxSize) {
                System.out.print("\nDay: " + (i + 1) + "\n" + floorSize[i] + " ");
                for (int j = floorSize[i] - 1; j >= 0; j--) {
                    if (floorArrivingOrder[j] == 0) {
                        System.out.println();
                        break;
                    }
                    System.out.print(j + " ");
                    maxSize--;
                }
                maxSize--;
            } else {
                System.out.println("\nDay: " + (i + 1));
            }

        }
    }
}
