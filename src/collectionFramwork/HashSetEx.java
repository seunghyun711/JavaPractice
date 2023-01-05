package collectionFramwork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // 객체 추가
        hashSet.add("안녕하세요");
        hashSet.add("감사해요");
        hashSet.add("잘있어요");
        hashSet.add("다시 만나요");
        hashSet.add("안녕하세요"); // 중복

        // 반복자(Iterator) 생성하여 it에 할당
        Iterator it = hashSet.iterator();

        // 반복자로 HashSet을 순회하여 각 요소 출력
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
