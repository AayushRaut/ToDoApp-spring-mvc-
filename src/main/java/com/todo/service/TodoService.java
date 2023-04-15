package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.dao.TodoDaoImpl;
import com.todo.model.Todo;


@Service
public class TodoService {

	@Autowired
	private TodoDaoImpl todoDaoImpl;

	public int createUser(Todo todo) {
		
	return this.todoDaoImpl.insert(todo);
		
	}

	public List<Todo> getUserAll() {
		return this.todoDaoImpl.getUserAll();
	}

	public int delete(int studentId) {
		return this.todoDaoImpl.delete(studentId);
	}

	public int change(Todo todo) {
		return this.todoDaoImpl.change(todo);
	}

}
