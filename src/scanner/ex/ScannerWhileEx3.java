package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("숫자 입력하세. 중단하려면 -1 입력: ");

        while(true){
            int num = input.nextInt();

            if(num == -1){
                break;
            }

            sum += num;
            count ++;
        }

        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
