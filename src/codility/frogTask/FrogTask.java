package codility.frogTask;

public class FrogTask {

    public static void main(String[] args) {

    solution(10, 101, 30);
    }

    public static int solution(int X, int Y, int D) {

        int number = Y - X;

        if(number % D == 0) {
            number = number / D;
        } else {
            number = number / D + 1;
        }
        System.out.println(number);
        return number;
    }
}
