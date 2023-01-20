package algorithm.dp;

/**
 * 화폐단위의 종류로 목적금액을 만들 수 있는 경우의 수 구하기
 * ex> 1원,2원,5원 가지고 5원을 만들 수 있는 경우의 수 구하기
 */
public class MakeMoney {
    public long money(int target, int[] type) {
        /*
        target금액을 목표금액으로 하여 type배열에 있는 요소를 통해 target을 만드는 경우의 수를 구한다.
        bag배열을 만든다 -> 여기에서 target+1로 하여 0번 인덱스에는 1을 대입한다 -> 0번은 최소 경우의 수인 1이다.
        예를 들어 목표금액이 5인데 화폐단위가 5면 5자기자신 으로 5를 만드는 경우의 수 1개가 있기 때문에 이를 적용한 것이다.
        나머지는 1번 인덱스는 1원을 만드는 경우의 수, 2번 인덱스는 2원을 만드는 경우의 수로 생각하여 문제를 푼다.
         */

        long[] bag = new long[target + 1];
        bag[0] = 1; // 최소 경우의 수 1을 0번 인덱스에 대입

        for (int i = 0; i < type.length; i++) { // 화폐 단위 개수 만큼 반복
            for (int j = 1; j <= target; j++) {
                if(type[i] <= j){ // 목표 금액 이하인 경우까지만 경우의 수를 구할 수 있음 ex) 목표금액 : 5인데, 화폐단위가 6이면 구할 수 없다.
                    bag[j] += bag[j-type[i]]; // 반북문을 순회하면서 화폐를 만들 수 있는 경우의 수를 누적하여 계산한다.
                }
            }
        }
        return bag[target];
    }

    public static void main(String[] args) {
        MakeMoney m = new MakeMoney();
        System.out.println(m.money(50, new int[]{10, 20, 50}));
    }

}
