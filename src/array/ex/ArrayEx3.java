package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수 입력: ");
        for(int i = 0; i < 5; i++){
            num[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");
        for(int i = 4; i >= 0; i--){
            if (i > 0){
                System.out.print(num[i] + ",");
            }
        }
    }
}
