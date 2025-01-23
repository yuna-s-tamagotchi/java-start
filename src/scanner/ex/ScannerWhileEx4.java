package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;

        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();


            if(option == 1){
                input.nextLine();

                System.out.print("상품명 입력하세요: ");
                String name = input.nextLine();

                System.out.print("가격 입력하세요: ");
                int price = input.nextInt();

                System.out.print("수량 입력하세요: ");
                int quantity = input.nextInt();

                sum += price * quantity;

                System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + quantity + "합계: " + sum);
            }

            else if(option == 2){
                System.out.println("총 비용: " + sum);
                sum = 0;
            }
            else if(option == 3){
                System.out.println("종료");
                break;
            }
            else {
                System.out.println("숫자 잘못 입력띠");
            }
        }
    }


}
