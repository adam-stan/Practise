package TreeSet;

import java.util.TreeSet;

public class ChangeToArray {

    public static void main (String[] args) {

        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(2);
        s.add(3);
        s.add(9);
        s.add(5);

        int n = s.size();
        int arr[] = new int[n];

        int i = 0;

        for (int ele : s) {
            arr[i++] = ele;
        }

        for(int res : arr)
        {
            System.out.print(res+ " ");
        }
    }
}
