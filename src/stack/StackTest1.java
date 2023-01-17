package stack;

import java.util.ArrayList;
import java.util.Stack;

/*
문제 상황
웹 브라우저 현재 페이지에서 -1은 뒤로가기, 1은 앞으로가기, 다른 문자는 새 페이지 열기임
<조건>
1. 새 페이지 접속하면 이전 스택에 현재 페이지 넣고, 다음 스택을 비운다.
2. 뒤로 가기(-1)시 현재 페이지를 다음 스택에 넣고, 이전 스택의 최상위 요소를 현재 페이지로 지정 후 이전 스택의 값 pop()
3. 앞으로 가기(1)시 현재 페이지를 이전 스택에 넣고, 다음 스택의 최상위 요소를 현재 페이지로 지정 후 다음 스택의 값 pop()
4. 뒤로가기와 앞으로 가기 모두 비활성화인 경우 아무 동작도 하지 않음
 */
public class StackTest1 {
    public ArrayList<Stack> mainStack(String[] function, String start){ // function은 뒤로가기, 앞으로 가기 등의 기능, start는 현재 페이지
        Stack<String> prevStack = new Stack<>(); // 이전 스택
        Stack<String> nextStack = new Stack<>(); // 다음 스택
        Stack<String> current = new Stack<>(); // 현재 페이지
        ArrayList<Stack> result = new ArrayList<>(); // 결과

        // 먼저 현재 보고 있는 페이지를 current에 넣는다.
        current.add(start);

        // function의 요소에 따라 기능을 구현한다.
        for(int i = 0; i<function.length; i++){
            // 뒤로가기(-1)인 경우, 현재 페이지를 nextStack, prevStack의 top을 pop하여 current로,
            if(function[i].equals("-1") && !prevStack.empty()){ // 이전 스택이 비워진 경우 뒤로가기가 안되므로 제한한다.
                // 현재 페이지를 다음 스택으로
                nextStack.push(current.pop());
                // 이전 페이지의 top은 현재 페이지로
                current.push(prevStack.pop());
            }
            // 앞으로 가기(1)인 경우, nextStack이 비워진 경우 앞으로 가기 기능이 안되므로 제한한다.
            else if(function[i].equals("1") && !nextStack.empty()){
                // 현재 페이지는 이전 스택으로
                prevStack.push(current.pop());
                // 다음 페이지의 top이 현재 페이지로
                current.push(nextStack.pop());
            }
            else if(function[i].equals("-1") || function[i].equals("1")){
                // 앞으로 가기와 뒤로가기 모두 비활성화가 된 경우 아무일도 일어나지 않는다.
            }
            else{ // 1,-1이외 다른 페이지가 들어온 경우
                // 새 페이지가 들어오기 전까지 보고 있던 현재페이지는 이전 스택으로 이동
                prevStack.push(current.pop());
                // 새로 들어온 페이지가 현재 페이지가 된다.
                current.push(function[i]);
                // 새로운 페이지가 들어온 경우 nextStack은 비워진다.
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }

    public static void main(String[] args) {
        StackTest1 s = new StackTest1();
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";

        System.out.println(s.mainStack(actions,start));
    }
}
