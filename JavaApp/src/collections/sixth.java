package collections;

import java.util.*;

public class sixth {
    public static void main(String[] args) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        Map<Integer, Integer> position = new HashMap<Integer, Integer>();
        List<Integer> mylist = new ArrayList<>();
        int temp, size;
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("enter values within size");
        for (int i = 0; i < size; i++) {

            temp = sc.nextInt();
            mylist.add(temp);
            if (count.get(temp) == null) {
                count.put(temp, 1);
                position.put(temp, i);
            } else {
                count.put(temp, count.get(temp) + 1);
            }
        }

        Collections.sort(mylist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (count.get(o1) - count.get(o2) > 0) {
                    return -1;
                } else if (count.get(o1) - count.get(o2) < 0) {
                    return 1;
                } else {
                    if (position.get(o1) - position.get(o2) > 0) {
                        return 1;
                    } else return -1;
                }
            }
        });
        int si = mylist.size();
        System.out.println("Sorted list on basis of count and position is-");
        for (int i = 0; i < si; i++) {
            System.out.println(mylist.get(i));
        }
    }
}
