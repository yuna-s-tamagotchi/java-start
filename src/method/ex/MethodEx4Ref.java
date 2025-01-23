package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balacne = 0;

        while(true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("입금액을 입력하세요: ");
                int add = scanner.nextInt();
                balacne += add;
                System.out.println(add + "원을 입금하였습니다. 현재 잔액: " + balacne + "원");
            }
            else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int minus = scanner.nextInt();
                if(balacne > minus){
                    balacne -= minus;
                    System.out.println(minus + "원을 출금하였습니다. 현재 잔액: " + balacne + "원");
                }
                else {
                    System.out.println(minus + "원을 출금하려 했으나 잔액이 부족합니다.");
                }
            }
            else if (choice == 3) {
                System.out.println("현재 잔액: " + balacne + "원");
            }
            else if (choice ==4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
            else {
                System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }
}
