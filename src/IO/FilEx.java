package IO;

import java.io.File;
import java.io.IOException;

public class FilEx {
    public static void main(String[] args) throws IOException {
        File file = new File("../newFile.txt"); // pathname을 매개변수로 받아 파일을 생성한다.

        System.out.println(file.getPath()); // file에 입력한경로 출력,인자로 전달한 경로가 상대경로라면 상대경로가 출력됨
        System.out.println(file.getParent()); // 파일의 조상 디렉토리를 반환
        System.out.println(file.getCanonicalPath()); // 파일의 절대 경로를 반환한다.
        System.out.println(file.canWrite()); // 쓰기가 가능한 파일인지 검사한다.

    }
}
