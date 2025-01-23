package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while(true){
            System.out.print("이름 입력 (종료 입력하면 종료): ");
            String name = scanner.nextLine();


            if (name.equals("종료")){
                System.out.println("종료");
                break;
            }

            System.out.print("나이 입력: ");
            int age = scanner.nextInt();
            scanner.nextLine();



            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

    }
}
