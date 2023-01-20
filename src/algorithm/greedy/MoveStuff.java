package algorithm.greedy;

import java.util.Arrays;

/**
 * 짐 옮기기
 * 하나의 박스에는 최대 2개의 짐이 들어갈 수 있고, 박스에 담을 수 있는 짐의 무게 제한이 있다.
 * 적재하려는 짐의 무게가 박스의 제한 무게를 넘어서면 새 박스에 넣는다.
 * 이때 필요한 박스의 최소 개수
 * ex) 짐의 무게 : [70,80,50,50], 무게 제한 : 100인 경우 필요한 박스 개수 구해라
 */
public class MoveStuff {
    public int moving(int[] stuff, int limit) {
        // stuff는 짐의 무게 배열이다. 이걸 오름차순으로 정렬한다.
        Arrays.sort(stuff); // 오름차순 정렬

        int box = 0; // 박스의 수

        // 가벼운 무게의 짐이 있는 배열의 인덱스
        int lightIdx = 0;
        // 가장 무거운 무게의 짐이 있는 배열의 인덱스
        int heavyIdx = stuff.length-1;

        // 양 쪽 끝 인덱스에서 시작하여 서로 겹치는 순간까지 반복하여 박스의 수를 계산한다.
        while (lightIdx <= heavyIdx) {
            if((stuff[lightIdx] + stuff[heavyIdx] <= limit) && lightIdx != heavyIdx){ // 가벼운 무게 + 무거운 무게 <= limit인 경우,
                lightIdx++;
                heavyIdx--;
                box++; // 박스 개수 증가 -> 박스에 2개가 다 들어갔기 때문에 박스의 수를 증가시킨다.
            }else{
                heavyIdx--; // heavyIdx를 줄이고, 새 박스가 필요하므로 box의 수를 증가시킨다.
                box++;
            }
        }
        return  box;
    }

    public static void main(String[] args) {
        MoveStuff m = new MoveStuff();
        System.out.println(m.moving(new int[]{70, 50, 80, 50}, 100));
    }

}
