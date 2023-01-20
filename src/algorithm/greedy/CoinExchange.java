package algorithm.greedy;

/**
 * 금액을 받으면 1원,5원,10원,50원,100원,500원 동전들로 거스름돈을 줄때 필요한 동전의 최소 개수 구하기
 */
public class CoinExchange {
    public int coin(int money){
        // 매개변수로 받는 금액을 큰 수 부터 나눠는 방식으로 진행
        int count = 0; // 필요한 동전 개수
        int[] coins = {500,100,50,10,5,1}; // 동전 단위 큰 거 부터 내림차순 정렬

        // 동전 단위 배열을 순회하여 필요한 동전의 수를 구한다.
        for(int i = 0; i<coins.length; i++){
            count += money / coins[i]; // 입력받은 금액에서 동전 단위를 나눈 값이 해당 동전 단위의 동전이 필요한 개수다.
            money %= coins[i]; // 입력받은 금액을 나누고 나서 남은 나머지들로 계속 나눠줘야함
        }

        return count;
    }

    public static void main(String[] args) {
        CoinExchange c = new CoinExchange();
        System.out.println(c.coin(4972));
    }
}
