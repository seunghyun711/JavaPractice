package IO;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("outputFile.txt");
            String word = "output file";

            byte b[] = word.getBytes();
            fileOutputStream.write(b); // write() : b배열에 있는 자료를 출력한다.
            fileOutputStream.close(); // close()는 출력 스트림과 연결된 대상 리소스를 닫는다. 출력 버퍼가 비워진다.
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
