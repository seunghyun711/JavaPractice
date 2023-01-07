package stream.terminaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Player{
    public enum Position {FW,MF,DF};
    private String name;
    private int number;
    private Position position;

    public Player(String name, int number, Position position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Position getPosition() {
        return position;
    }
}
public class Collect {
    public static void main(String[] args) {
        // Player 객체로 구성된 배열 리스트 생성
        List<Player> totalList = Arrays.asList(
                new Player("Park",13, Player.Position.MF),
                new Player("Carrick",16, Player.Position.MF),
                new Player("Rooney",10, Player.Position.FW),
                new Player("Evra",3, Player.Position.DF)
        );
        // 스트림 연산 결과를 Map으로 반환
        Map<String,Integer> map = totalList.stream()
                .filter(s->s.getPosition() == Player.Position.MF) // 포지션이 MF인 요소만 추출
                .collect(Collectors.toMap( // 요소를 Map으로 반환
                        player -> player.getName(), // key
                        player -> player.getNumber()  // value
                ));

        // 출력
        System.out.println(map);
    }
}
