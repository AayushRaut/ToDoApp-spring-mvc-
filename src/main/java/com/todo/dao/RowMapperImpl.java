package com.todo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.todo.model.Todo;


public class RowMapperImpl implements RowMapper<Todo> {
	
	@Override
	public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Todo todo = new Todo();
		todo.setId(rs.getInt(1));
		todo.setTodoTitle(rs.getString(2));
		todo.setTodoContent(rs.getString(3));

		return todo;

	}

}
