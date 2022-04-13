package trainingTasks.duplicates;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicates {

    public static Set<Integer> findDuplicates(int[] array) {

        Set<Integer> listOfDuplicates = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if(array[i] == array[j]) {
                    listOfDuplicates.add(array[i]);
                }
            }
        }

        return listOfDuplicates;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,2,4,2};
        System.out.println(findDuplicates(array));
    }
}
