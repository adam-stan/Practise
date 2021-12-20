package codility.rotationsTask;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {

        int[] A = {2, 3, 4, 5, 6};
        Rotation rotation = new Rotation();
        rotation.solution(A, 2);

    }

    public int[] solution(int[] A, int K) {

        for (int j = 0; j < K ; j++) {
            int lastEl = A[A.length - 1];

            for (int i = A.length - 1; i > 0 ; i--) {
                A[i] = A[i - 1];
            }
            A[0] = lastEl;
            System.out.println(Arrays.toString(A));
        }
        return A;
    }
}
