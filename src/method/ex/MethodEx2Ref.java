package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        infinite("hello", 4);
        infinite("hello", 5);
    }

    public static void infinite(String message, int num) {
        for(int i = 0; i < num; i ++){
            System.out.println(message);
        }
    }
}
