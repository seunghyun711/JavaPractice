package IO;

import java.io.File;
import java.io.IOException;

public class FileEx2 {
    public static void main(String[] args) throws IOException {
        File file = new File(".", "createNewFIle.txt");
        file.createNewFile(); // 아무 내용 없는 새로운 파일 생성(이미 존재하는 파일이면 생성되지 않음)

    }
}
