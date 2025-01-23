package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double avg;

        System.out.println("5개 정수 입력: ");
        for(int i = 0; i < 5; i ++){
            numbers[i] = scanner.nextInt();

            sum += numbers[i];
        }
        avg = (double) sum / numbers.length;

        System.out.println(sum);
        System.out.println(avg);
    }
}
