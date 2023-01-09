package IO;

import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("newFile.txt");
            int i = 0;
            while ((i = fileInput.read()) != -1) { // 파일을 읽어옴 파일의 끝에 도달하면 -1이 반환됨 즉, 이 코드는 파일의 끝까지 읽는 것이다,
                System.out.print((char) i);
            }
            fileInput.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
