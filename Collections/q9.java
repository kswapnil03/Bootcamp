import java.text.DateFormat;
import java.util.*;

public class q9 {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale loc = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, loc);
        System.out.println("italian" + df.format(d1));
    }
}