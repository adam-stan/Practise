package trainingTasks;

import java.util.ArrayList;
import java.util.List;

public class FindMISSING {


    public static int findMissing(int[] tab) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= tab.length; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < tab.length; i++) {
            list.remove((Integer)tab[i]);
        }

        System.out.println(list.get(0));
        return 0;
    }

    public static void main(String[] args) {
        int[] table = {0, 2, 3, 4};
        findMissing(table);
    }
}
