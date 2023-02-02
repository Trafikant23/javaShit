package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if(arr1[i] > arr1[j]){
                    System.out.printf("%d ",arr1[i]);

                }else {
                    break;
                }

            }

        }

    }
}
