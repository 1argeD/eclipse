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
		//������� \, linux /
		File file = new File("C:/DEV/test.txt");
		
		Path path =file.toPath();
		
		if(Files.notExists(path)) {//������ �����ϴ��� Ȯ��
			Files.createFile(path);//���� �����
		}
		byte[] bytes = "�ȳ��ϼ���, �ݰ����ϴ�.\t��ó�� \n����ó��\n".getBytes();
										//\r\n�� ������ \n�� ������
		Files.write(path, bytes, StandardOpenOption.APPEND);//APPEND �̾��
		///////////////////////////���� �б�///////////////////
		Charset cs = Charset.defaultCharset();
		System.out.println(cs.aliases());
		List<String> lines = Files.readAllLines(path, cs);
		lines.forEach(o->System.out.println(o));
	}
}
