package array;

public class ArrayRef1 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
