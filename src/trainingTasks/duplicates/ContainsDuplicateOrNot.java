package trainingTasks.duplicates;

public class ContainsDuplicateOrNot {

    public static boolean ifCoontainsDuplicate(int[] array) {

        boolean isDuplicate = false;

        for (int i = 0; i < array.length ; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }
        return isDuplicate;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,4};
        System.out.println(ifCoontainsDuplicate(array));
    }
}
