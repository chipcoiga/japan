package click.botay.japan.config;

import java.util.*;

public class CuongNguyen {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MINUTE, 30);
        calendar1.add(Calendar.MINUTE, 15);


        System.out.println(calendar.getTime());


    }
}
