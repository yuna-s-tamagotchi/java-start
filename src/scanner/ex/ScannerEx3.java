package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름: ");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량: ");
        int foodNum = scanner.nextInt();

        System.out.println(foodName + " " + foodNum + "개를 주문. 총 가격은 " + foodPrice + "원");
    }
}
