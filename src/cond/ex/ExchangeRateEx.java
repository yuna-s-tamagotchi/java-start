package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 5;

        System.out.println("dollar: " + dollar);

        if (dollar < 0) {
            System.out.println("잘못된 금액임");
        }
        else if (dollar == 0) {
            System.out.println("환전할 금액이 없어요");
        }
        else {
            int result = dollar * 1300;
            System.out.println("환전 금액은 " + result + "원입니다.");
        }
    }
}
