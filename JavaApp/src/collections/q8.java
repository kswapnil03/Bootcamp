package collections;

import java.util.*;
import java.text.*;

public class q8 {

    public static void main(String args[]) {
        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E dd-MMM-yyyy 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));
    }
}
