package collectionFramwork;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableEx2 {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();

        map.put("hong", "0101");
        map.put("seung", "1234");

        System.out.println(map);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호 입력");
            System.out.println("아이디 : ");
            String id = sc.nextLine();

            System.out.println("비밀번호 : ");
            String pw = sc.nextLine();

            if(map.containsKey(id)){
                if(map.get(id).equals(pw)){ // 키-값은 같은 객체(Entry객체)에 있는지 확인
                    System.out.println("로그인 성공");
                    break;
                }else{
                    System.out.println("비밀번호가 일치하지 않음");
                }
            }
            else System.out.println("입력한 아이디는 존재하지 않음");
        }
    }
}
