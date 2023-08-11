package p545;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//윈도우는 \, linux /
		File file = new File("C:/DEV/test.txt");
		
		Path path =file.toPath();
		
		if(Files.notExists(path)) {//파일이 존재하는지 확인
			Files.createFile(path);//파일 만들기
		}
		byte[] bytes = "안녕하세요, 반갑습니다.\t탭처리 \n엔터처리\n".getBytes();
										//\r\n은 위도우 \n은 리눅스
		Files.write(path, bytes, StandardOpenOption.APPEND);//APPEND 이어쓰기
		///////////////////////////파일 읽기///////////////////
		Charset cs = Charset.defaultCharset();
		System.out.println(cs.aliases());
		List<String> lines = Files.readAllLines(path, cs);
		lines.forEach(o->System.out.println(o));
	}
}
