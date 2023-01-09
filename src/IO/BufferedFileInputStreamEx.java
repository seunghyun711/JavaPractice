package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedFileInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("newFile.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); // 보조 스트림 사용

            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
