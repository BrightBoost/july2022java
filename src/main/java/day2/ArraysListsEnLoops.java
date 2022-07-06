package day2;

public class ArraysListsEnLoops {
    public static void main(String[] args) {
        // for loop - i++ betekent i = i + 1
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        infinite loop
//        for(;;) {
//            System.out.println("oh...");
//        }
        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        int k = 0;
        // do while loop
        do {
            System.out.println("altijd minimaal 1x: " + k);
            k++;
        } while (k < 3);

        // arrays
        int[] ints = {3, 4, 6, 2, 4};
        System.out.println("lengte array: " + ints.length);
        int element = ints[4];
        System.out.println("elem:" + element);

        int l = 0;
        while(l < 3 && ints.length > l){
            System.out.println(ints[l]);
            l++;
        }


        // enhanced for loop (foreach loop)
        for(int hoi : ints) {
            System.out.println("int: " + hoi);
        }

    }
}
