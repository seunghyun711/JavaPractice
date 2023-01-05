package collectionFramwork;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();

        // key - 이름 value - 능력치
        map.put("손흥민", 91);
        map.put("메시", 102);
        map.put("음바페", 100);
        map.put("레반도프스키", 98);

        System.out.println(map);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======= 선수 능력치 정보 ======");
            System.out.println("확인하려는 선수의 이름을 입력하세요");
            String name = sc.nextLine();

            if (map.containsKey(name)) { // containsKey() : 주어진 키가 있으면 true 없으면 false반환
                System.out.println(name + " : " + map.get(name));
                break;
            }else{
                System.out.println("등록되지 않은 선수 입니다.");
            }

        }
    }
}
