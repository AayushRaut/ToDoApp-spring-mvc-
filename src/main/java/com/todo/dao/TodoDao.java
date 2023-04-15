package com.todo.dao;

import java.util.List;

import com.todo.model.Todo;

public interface TodoDao {
	public int insert(Todo todo);

	public int change(Todo todo);

	public int delete(int Id);

	public Todo getUser(int Id);

	public List<Todo> getUserAll();
}
