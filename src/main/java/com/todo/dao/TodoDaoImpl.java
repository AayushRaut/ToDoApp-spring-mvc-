package com.todo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.todo.model.Todo;

@Repository
public class TodoDaoImpl implements TodoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	@Transactional
	public int insert(Todo todo) {
		String query = "insert into todoData(todoTitle,todoContent) values(?,?)";
		int r = this.jdbcTemplate.update(query, todo.getTodoTitle(), todo.getTodoContent());
		return r;
	}

	@Override
	@Transactional
	public int change(Todo todo) {
		// TODO Auto-generated method stub

		String query = "update todoData set todoTitle=? , todoContent=? where id=?  ";
		int r = this.jdbcTemplate.update(query, todo.getTodoTitle(), todo.getTodoContent(), todo.getId());
		return r;

	}

	@Override
	public int delete(int Id) {
		// TODO Auto-generated method stub
		String query = "delete from todoData where id=" + Id + "  ";
		System.out.println("update query");
		int r = this.jdbcTemplate.update(query);
		return r;

	}

	@Override
	public Todo getUser(int studentId) {
		String query = "select *from student where id=?";
		RowMapper<Todo> rowMapper = new RowMapperImpl();
		Todo todo = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return todo;
	}

	@Override
	public List<Todo> getUserAll() {
		String query = "select *from todoData";

		List<Todo> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
}
