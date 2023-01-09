package Test.stream;

import java.util.Arrays;
import java.util.List;

/*
Member에서 Female요소의 수 리턴
 */
public class Test4 {
    public long FemaleMemberCount(List<Member> list) {
        return list.stream()
                .filter(e -> e.getGender().equals("Female"))
                .count();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Member a = new Member("a", "Female");
        Member b = new Member("b", "male");
        List<Member> list  = Arrays.asList(a,b);
        System.out.println(t.FemaleMemberCount(list));

    }
}
class Member {
    String name;
    String gender;

    public Member(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}