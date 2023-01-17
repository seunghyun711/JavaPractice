package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
박스가 큐를 통해 들어오는 순서대로 나가는데 뒤의 요소가 작업이 모두 끝나도 앞의 요소가 작업이 끝나지 않으면 나갈 수 없다.
이 때 한 번에 나갈 수 있는 박스의 최대 양을 구한다.
ex) 5,1,4,6이 있을 때 각 숫자는 작업하는 데 걸리는 시간이다. 이 상황에서 가장 앞의 5는 1,4보다 오랜 시간이 걸리므로 5의 작업이 끝나면
한 번에 1,4,도 모두 작업이 끝나기 때문에 한 번에 3개가 나갈 수 있다.

 */
public class QueueTest1 {
    public int Box(Integer[] boxes) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(boxes));

        // 첫 번째 요소를 받을 변수
        int first = q.poll(); // 큐의 첫 번째 요소 -> 비교의 기준
        int count = 1; // 한 번에 나가는 박스의 수를 저장할 변수, 최소로 나가는 박스의 수가 1이므로 1로 초기화
        int result = 1; // 최종 결과

        // 큐의 첫 번째 요소와 이후 요소들과 비교를 반복하여 count값을 갱신하여 최종 result값을 리턴할 것이다.

        while (q.peek() != null) { // q의 요소를 끝까지 읽어옴
            int other = q.poll(); // first와 비교하기 위한 first의 다음 요소 -> 비교의 대상
            // 비교의 기준과 비교의 대상을 비교하여 박스의 수를 계산한다.

            if (first >= other) { // 비교의 기준이 큰 경우(앞 요소가 더 큰 경우)
                count++;
                result = Math.max(result, count); // result와 count 중 큰 값을 result에 대입
            } else { // 비교의 대상이 비교의 기준보다 큰 경우(앞 요소보다 뒤의 요소가 더 큰 경우)
                result = Math.max(result, count);
                count = 1; // count를 초기화한다. 더 이상 박스를 연속으로 내보낼 수 없기 때문.
                first = other; // 비교의 기준을 바꾼다. -> 다음 큰 요소를 비교의 기준으로 잡고 위의 반복문 구졸를 반복한다.
            }
        }
        return result;
    }

    public static void main(String[] args) {
        QueueTest1 q = new QueueTest1();
        Integer[] boxes = new Integer[]{5, 1, 4, 6};
        System.out.println(q.Box(boxes));
    }
}
