package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        while(true){
            System.out.print("가격 입력 (-1입력시 종료): ");
            int price = input.nextInt();

            if(price == -1) {
                System.out.println("종료");
                break;
            }
            System.out.print("구매 수량: ");
            int num = input.nextInt();

            int result = price * num;

            System.out.println("총 비용: " + result);
        }
    }
}
