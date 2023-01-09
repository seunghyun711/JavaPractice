package IO;

import java.io.File;

public class FileClassEx {
    public static void main(String[] args) {
        File parentDir = new File("./");
        File[] list = parentDir.listFiles(); // 디렉토리의 파일목록을 File배열로 반환한다.

        String prefix = "add"; // 현재디렉토리(.)에서 확장자가 .txt인 파일을 대상으로 "add"라는 문자열을 붙여준다.

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();
            if(fileName.endsWith("txt") && !fileName.startsWith("add")){ // 파일 끝에txt인 파일과 파일명 앞에 add로 시작하지 않는 파일을 대상으로
                list[i].renameTo(new File(parentDir, prefix + fileName)); // parentDir의 이름을 prefix + fileName으로 변경한다.
            }
        }
    }
}
