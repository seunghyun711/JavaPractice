package stack;

import java.util.ArrayList;

public class StackImpl {
    private ArrayList<Integer> list = new ArrayList<>();

    // 스택에 삽입
    public void push(Integer data) {
        list.add(data);
    }

    // 스택에서 제거 -> 스택은 후입 선출이므로 스택에 가장 최근에 추가한 요소가 제거됨
    public Integer pop(){
        if (list.isEmpty()) { // 스택이 비어있는 경우
            return null;
        }else{
            return list.remove(list.size()-1); // 스택의 가장 마지막 인덱스 제거
        }
    }

    // 스택의 크기
    public int size() {
        return list.size();
    }

    // peek()은 pop()과 다르게 요소를 제거하지않고 그 요소를 읽기만 한다.
    public Integer peek() {
        if (list.isEmpty()) {
            return null; // 스택이 비어있는 경우 null리턴
        }else{
            return list.get(list.size()-1);
        }
    }

    // 스택 출력
    public String printStack() {
        return list.toString();
    }

    // 스택의 값 모두 삭제
    public void clear(){
        list.clear();
    }

    public static void main(String[] args) {
        StackImpl s = new StackImpl();

        s.size();
        for (int i = 0; i < 5; i++) {
            s.push(i); // 스택에 요소 추가(5개)
        }

        System.out.println("s.pop() : " + s.pop());
        System.out.println("s.pop() : " + s.pop());
        System.out.println("s.printStack() : " + s.printStack());
        s.push(10);
        System.out.println("s.printStack() : " + s.printStack());
        System.out.println("s.size() : " + s.size());

    }

}
