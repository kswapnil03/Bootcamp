package collections;

import java.util.*;
import java.lang.*;


class Sortbyage implements Comparator<fifth> {

    public int compare(fifth a, fifth b) {
        if (a.score < b.score)

            return -1;


        else if (a.score > b.score)
            return 1;
        else {
            int aa = a.name.compareTo(b.name);
            if (aa> 0)
                return 1;
            else
                return -1;
        }
    }
}

class fifth {
    double age;
    double score;
    String name;


    public fifth(double age, String name,
                 double score) {
        this.age = age;
        this.name = name;
        this.score=score;
    }


    public String toString() {
        return this.age + " " + this.name +
                " " + this.score;
    }


    public static void main(String[] args) {
        ArrayList<fifth> ar = new ArrayList<fifth>();
        ar.add(new fifth(111, "bbbb", 6000));
        ar.add(new fifth(131, "aaaa", 1000));
        ar.add(new fifth(121, "cccc", 9999));
        ar.add(new fifth(101, "bbbb", 9999));


        Collections.sort(ar, new Sortbyage());

        System.out.println("\nSorted by score");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));


    }
}