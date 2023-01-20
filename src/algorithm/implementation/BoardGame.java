package algorithm.implementation;

/*
N*N크기 보드판에서 게임 시작위치는 (0,0)이고, 보드판 범위에서 벗어나면 null 리턴
위치 이동은 한 번만 상하좌우로
보드 칸의 수는 1or0 1인 경우 점수 +1
모두 이동 후 최종 점수 구하기
 */
public class BoardGame {
    public Integer game(int[][] board, String operation) {
        int count = 0; // 최종 점수(결과)담을 변수

        // 상,하,좌,우 각각 움직일 좌표
        int[] mu = {-1,0}; // 상 -> y축은 고정, x축은 1칸 아래로 이동
        int[] md = {1,0}; // 하 -> y축은 고정, x축은 1칸 아래로 이동
        int[] ml = {0,-1}; // 좌 -> x축은 고정, y축은 1칸 왼쪽으로 이동
        int[] mr = {0,1}; // 우 -> x축은 고정, y축은 1칸 오른쪽으로 이동

        // 현재 위치(0,0)을 x축, y축으로 나눠서 표현
        int x = 0;
        int y = 0;

        // operation으로 들어오는 위치 이동 문자열의 길이만큼 반복
        for (int i = 0; i < operation.length(); i++) {
            if (operation.charAt(i) == 'U') { // 상
                // 위로 한 칸 이동 -> 그에 맞게 x,y축에 위치 이동한 결과를 계산
                x += mu[0];
                y += mu[1];
                if(x < 0 || y < 0 || x >= board.length || y >= board.length){ // 이동 후의 좌표가 보드판의 범위를 벗어나는 경우 null리턴
                    return null;
                }
                if(board[x][y] == 1) count++; // 현재 위치의 보드판 칸이 1인 경우 점수 +1
            }
            else if(operation.charAt(i) == 'D'){
                // 하-> 아래로 한 칸 이동
                x += md[0];
                y += md[1];
                if(x < 0 || y < 0 || x >= board.length || y >= board.length){ // 이동 후의 좌표가 보드판의 범위를 벗어나는 경우 null리턴
                    return null;
                }
                if(board[x][y] == 1) count++; // 현재 위치의 보드판 칸이 1인 경우 점수 +1
            }
            else if (operation.charAt(i) == 'L') {
                x += ml[0];
                y += ml[1];
                if(x < 0 || y < 0 || x >= board.length || y >= board.length){ // 이동 후의 좌표가 보드판의 범위를 벗어나는 경우 null리턴
                    return null;
                }
                if(board[x][y] == 1) count++; // 현재 위치의 보드판 칸이 1인 경우 점수 +1
            } else if (operation.charAt(i) == 'R') {
                x += mr[0];
                y += mr[1];
                if(x < 0 || y < 0 || x >= board.length || y >= board.length){ // 이동 후의 좌표가 보드판의 범위를 벗어나는 경우 null리턴
                    return null;
                }
                if(board[x][y] == 1) count++; // 현재 위치의 보드판 칸이 1인 경우 점수 +1
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BoardGame b = new BoardGame();
        int[][] board = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };

        System.out.println(b.game(board,"RRDLLD"));
    }
}
