package collectionFramwork;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList생성하여 list에 할당
        ArrayList<String> list = new ArrayList<>();

        // String타입의 데이터를 ArrayList에 추가
        list.add("Java");
        list.add("Spring");
        list.add("BE");

        // 저장된 총 객체 수 확인
        int size = list.size();

        // 0번의 인덱스 객체 얻기
        String skill = list.get(0);

        // 저장된 총 객체 수 만큼 조회
        for(int i = 0; i< list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }

        // for-each문으로 순회
        for(String str : list){
            System.out.println(str);
        }
        // 0번 인덱스 객체 삭제
        list.remove(0);

        // 0번 인덱스 삭제 후 결과
        for(int i = 0; i< list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
    }
}
