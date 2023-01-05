package collectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Hashmap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // Entry 객체 생성
        map.put("피카츄", 85);
        map.put("라이츄", 86);
        map.put("파이리",90);
        map.put("꼬부기", 84);

        // 저장된 총 Entry 수 얻기
        System.out.println("총 Entry 수 : " + map.size());

        // 객체 찾기
        System.out.println("파이리 : " + map.get("파이리"));

        // key를 요소로 가지는 Set 생성
        Set<String> keySet = map.keySet();

        // keySet을 사용하여 iterator()사용
        System.out.println("keySet() 사용");
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);

        }

        // 객체 삭제
        map.remove("라이츄");
        System.out.println("삭제 후 총 Entry 수 : " + map.size());

        // entrySet을 사용하여 iterator()사용
        System.out.println("entrySet() 사용");
        // Entry객체를 요소로 가지는 Set 생성
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        // entrySet을 순회하면서 value롤 읽어옴
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey(); // Map.Entry 인터페이스의 메서드
            Integer value = entry.getValue(); // Map.Entry 인터페이스의 메서드
            System.out.println(key + " : " + value);
        }
        // 전체 객체 삭제
        map.clear();
    }
}
