package com.todo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.model.Todo;
import com.todo.service.TodoService;


@Controller
public class HomeController {
	@Autowired
	private TodoService todoService;

	@RequestMapping("/home")
	public String home(Model m) {
		List<Todo> list = this.todoService.getUserAll();
		System.out.println(list);
		m.addAttribute("list", list);
		return "home";
	}

	@RequestMapping("/add")
	public String add(Model m) {

		return "add";
	}

	@RequestMapping(path = "/saveTodo", method = RequestMethod.POST)
	public String saveTodo(@ModelAttribute Todo todo, Model model) {
		this.todoService.createUser(todo);
		return "redirect:/home";
	}

	@RequestMapping(value = "/home/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		this.todoService.delete(id);

		return "redirect:/home";
	}

	@RequestMapping("/edit")
	public String edit(Model m) {

		return "edit";
	}

	@RequestMapping(value = "/editTodo", method = RequestMethod.POST)
	public String edit(@ModelAttribute Todo todo, Model model) {
		this.todoService.change(todo);

		return "redirect:/home";
	}

}
