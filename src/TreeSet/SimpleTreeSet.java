package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class SimpleTreeSet {
    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("something");
        treeSet.add("nothing");
        treeSet.add("else");
        treeSet.add("something");

        System.out.println(treeSet.size());
        System.out.println(treeSet.contains("something"));

        for(String string: treeSet) {
            System.out.println(string);
        }





    }
}
