package learn.LLD;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Client {
    public static void main(String[] args){
        // client requires enumeration
        List<Integer> arr = new ArrayList<>(List.of(1));
        Enumeration<Integer> enmr = new IteratorEnumeration<>(arr.iterator());
        System.out.println(enmr.hasMoreElements());
        System.out.println(enmr.nextElement());
    }
}
