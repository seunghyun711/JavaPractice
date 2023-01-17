package queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueTest1_2 {
    public int Box(Integer[] boxes){
        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> list =  new ArrayList<>(Arrays.asList(boxes));

        while(list.size() > 0){
            for(int i = 0; i<list.size(); i++){
                if(list.get(i) > list.get(0)){ // 뒤의 요소가 앞 요소보다 큰 경우
                    result.add(i); // result에 i추가
                    list = list.subList(i,list.size());
                    break;
                }
                if(i == list.size()-1){
                    result.add(list.size());
                    list.clear();
                }
            }
        }
        return result.stream().max(Integer::compare).orElse(-1);
    }

    public static void main(String[] args) {
        QueueTest1_2 q = new QueueTest1_2();
        Integer[] boxes = new Integer[]{5, 1, 4, 6};
        System.out.println(q.Box(boxes));
    }
}
