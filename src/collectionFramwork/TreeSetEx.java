package collectionFramwork;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
// TreeSet 생성
        TreeSet<String> player = new TreeSet<>();

        // TreeSet에 요소 추가
        player.add("Messi");
        player.add("Son");
        player.add("Ronaldo");

        System.out.println(player);
        System.out.println("player.first() : " + player.first()); // 정렬된 순서에서 첫번째 객체 반환
        System.out.println("player.last() : " + player.last()); // 정렬된 순서에서 마지막 객체 반환
        System.out.println("player.high(Son) : " + player.higher("Son")); // 지정된 객체에서 큰 값중 가장 가까운 값 반환, 없으면 null리턴
        System.out.println("player.subSet(\"Messi\",\"Ronaldo\") : " + player.subSet("Messi","Ronaldo")); // Messi부터 Ronaldo까지의 객체 반환, Ronaldo는 포함되지 않음
    }
}
