package problems;

import java.util.*;

public class StringSortByLength {

    public static void main(String[] args) {

        Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        List<String> list = new ArrayList<>();

        list.add("goldmann");
        list.add("sachs");
        list.add("interview");

//        Collections.sort(list, comparator);
//
//        System.out.println(list);

        Collections.sort(list, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);

    }


}
