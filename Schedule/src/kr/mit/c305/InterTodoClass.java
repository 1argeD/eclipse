package kr.mit.c305;

import java.text.ParseException;

public interface InterTodoClass {
	public void todoList();
	public String todoInput();
	public int incompleteList();
	public void complete(int num);
	public void dateCal() throws ParseException;
}
