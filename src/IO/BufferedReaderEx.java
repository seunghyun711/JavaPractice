package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
    public static void main(String[] args) {
        try {
            String fileName = "outputFile.txt";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            int data = 0;

            while ((data = br.read()) != -1) {
                System.out.println((char)data);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
