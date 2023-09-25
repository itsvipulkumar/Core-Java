import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentList {

    public static void main(String args[]) {
        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<Integer> list = new ArrayList<Integer>(); // works fine

        s1.add("Vipul");
        s1.add("Amana");
        s1.add("Nikhul");
        System.out.println(s1.size());

        for (int i = 0; i < s1.size(); i++) {
            if (s1.get(i) == "Vipul") {
                System.out.println("Hello vipul Chauhan");
            } else
                System.out.println("Hello " + s1.get(i));
            // System.out.println(s1.get(i));
        }

        System.out.println(s1);

        list.add(12);
        list.add(125);
        list.add(42);
        list.add(152);
        list.add(92);
        list.add(72);
        list.add(3);
        list.add(6);
        list.add(34);
        list.add(72);
        list.add(9);
        list.add(110);

        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(Integer.valueOf(110));
        System.out.println(list);

        // list.clear(); // remove all elements
        System.out.println(list);

        list.set(3, 555);
        System.out.println(list);

        System.out.println(list.contains(555));

        for (Integer i : list) {
            System.out.println(i);
        }

        ArrayList<Integer> newList = new ArrayList<>(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
