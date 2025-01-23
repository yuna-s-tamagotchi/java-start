package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg;


        System.out.println("입력받을 숫자의 개수 입력: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];

        System.out.println(num + "개의 정수 입력: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        avg = (double) sum / arr.length;

        System.out.println("정수의 합계: " + sum);
        System.out.println("정수의 평균: " + avg);
    }
}
