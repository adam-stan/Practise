package trainingTasks;

public class FindMissing2 {
    private static int naiveFindMissing(int... array) {

        boolean ifFound;
        int missing = 0;

        for (int i = 0; i < array.length; i++) {

            ifFound = false;

            for (int number: array) {
                if(i == number) {
                    ifFound = true;
                    break;
                }
            }

            if(!ifFound) {
                missing = i;
                break;
            }

        }
        System.out.println(missing);
        return missing;
    }

    public static void main(String[] args) {
        int[] table = {0, 2, 3, 4};
        naiveFindMissing(table);

    }
}
