package kr.mit.c305;

import java.util.List;

public interface InterDBClass {
	//목록 가져오기
	List<TodoClass> list();
	//할 일 입력
	void input(TodoClass todo);
	//3-1 미완료 업데이트(미완료 목록 가져오기)
	List<TodoClass> incompleteList();
	//3-2 미완료를 완료로 만들기
	void complete(int no);//num은 no 키 값

}
