package queue;

import java.util.ArrayList;

public class QueueImpl {
    private ArrayList<Integer> q = new ArrayList<>();

    // 큐에 요소 삽입
    public void add(Integer data) {
        q.add(data);
    }

    // 큐 요소 제거 -> 큐는 선입선출이므로 가장 먼저 들어온 요소 제거
    public Integer poll() {
        if(q.isEmpty()){
            return null; // 큐가 비어있는 경우 null return
        }else{
            return q.remove(0); // 가장 먼저 들어온 요소 제거
        }
    }

    // 큐의 크기
    public int size(){
        return q.size();
    }

    // 큐의 요소를 제거하지 않고 읽어오기
    public Integer peek(){
        if(q.isEmpty()){
            return null;
        }else{
            return q.get(0); // 가장 먼저 들어온 요소 읽어오기
        }
    }

    // 큐 출력
    public String printQueue(){
        return q.toString();
    }

    // 큐의 전체 값 제거
    public void clear(){
        q.clear();
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();

        for(int i = 0; i<5; i++){
            q.add(i);
        }

        System.out.println("q : " + q.printQueue());
        System.out.println("q.poll() : " + q.poll());
        System.out.println("q.poll() : " + q.poll());
        q.add(10);
        System.out.println("q.size() : " + q.size());
        System.out.println("q : " + q.printQueue());

    }
}
