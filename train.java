package fundamentals;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
            sum+=numArr[i];
            System.out.printf("%d ",numArr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}


