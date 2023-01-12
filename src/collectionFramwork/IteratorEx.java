package collectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(20);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) { // 다음에 읽어올 객체가 있다면
            int num = iterator.next();
            System.out.println(num);
        }
    }
}
