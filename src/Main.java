import java.util.LinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        Arrays.fill(arr, 1);
        Arrays.fill(arr1,0);

        int b = 0;
        for (int i = 1; i < args.length/2+1; i++) {
            int z = 1;
            while (arr[z] == 1) {

                z = random.nextInt(args.length);
            }
            for (int j = 1; j > args.length/2+1; j++) {
                b = 1;
                while (arr[b] == 1) {
                    b = random.nextInt(args.length);

                }

            }
            arr[z] = 1;


        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr1));


    }


        }
    