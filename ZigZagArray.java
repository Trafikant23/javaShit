package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int [] arr1 = new int [n];
        int [] arr2 = new int [n];

        for (int i = 0; i < n; i++) {
              int [] numbers = Arrays.stream(scanner.nextLine()
                      .split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();
            if(i % 2 ==0){
                arr1 [i] = numbers[0];
                arr2 [i] = numbers[1];

            }else {
                arr1[i] = numbers [1];
                arr2[i] = numbers[0];
            }

        }
        for (int digit:arr1
             ) {
            System.out.printf("%d ",digit);

        }
        System.out.println();
        for (int digit:arr2
             ) {
            System.out.printf("%d ",digit);

        }
    }
}
