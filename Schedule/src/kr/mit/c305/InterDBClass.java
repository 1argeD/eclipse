package kr.mit.c305;

import java.util.List;

public interface InterDBClass {
	//��� ��������
	List<TodoClass> list();
	//�� �� �Է�
	void input(TodoClass todo);
	//3-1 �̿Ϸ� ������Ʈ(�̿Ϸ� ��� ��������)
	List<TodoClass> incompleteList();
	//3-2 �̿ϷḦ �Ϸ�� �����
	void complete(int no);//num�� no Ű ��

}
