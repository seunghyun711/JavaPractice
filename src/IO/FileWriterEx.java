package IO;

import java.io.FileWriter;

public class FileWriterEx {
    public static void main(String[] args) {
        try {
            String fileName = "newFile.txt";
            FileWriter fw = new FileWriter(fileName);

            String str = "FileWriter practice"; // newFile.txt파일에 문자열 추가
            fw.write(str);// 문자열 str을 파일에 출력한다.
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
