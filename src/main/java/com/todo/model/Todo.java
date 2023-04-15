package com.todo.model;

import java.util.Date;


public class Todo {

	private int id;
	private String todoTitle;
	private String todoContent;


	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(int id, String todoTitle, String todoContent, Date todoDate) {
		super();
		this.id = id;
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodoContent() {
		return todoContent;
	}

	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}



	@Override
	public String toString() {
		return "Todo [id=" + id + ", todoTitle=" + todoTitle + ", todoContent=" + todoContent
				+ "]";
	}
}
