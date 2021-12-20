package codility.binaryGap;


import java.util.ArrayList;
import java.util.List;

public class Binary {
    public static void main(String[] args) {

        int number = 1562;
        System.out.println(returnLongestZero(number));
    }

        public static int returnLongestZero(int n) {


            List<Integer> list = new ArrayList<>();

            String binary = Integer.toBinaryString(n);
            System.out.println(binary);

            int modifier = 0;
            if(binary.endsWith("0")) {
                modifier = 1;
            }

            String[] split = binary.split("1");
            int max = 0;

            for (int i = 0; i < split.length - modifier; i++) {
                int length = split[i].length();
                if(length > max) {
                    max = length;
                }
            }
            return max;
    }
}

