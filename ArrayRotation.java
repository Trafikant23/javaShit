package fundamentals;


import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String [] arr1 = input.split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotations; i++) {
            String first = arr1[0];
            for (int j = 0; j < arr1.length - 1; j++) {
                arr1[j] = arr1[j + 1];

            }
             arr1[arr1.length - 1] = first;



        }
        for (String element : arr1) {
            System.out.print(element + " ");

        }


    }

}
