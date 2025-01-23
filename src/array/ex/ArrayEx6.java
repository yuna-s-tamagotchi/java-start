package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수 입력");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;


        System.out.println(n + "개의 정수 입력");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
