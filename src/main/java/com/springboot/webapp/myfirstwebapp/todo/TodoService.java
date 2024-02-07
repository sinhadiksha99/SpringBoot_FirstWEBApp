package com.springboot.webapp.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static int todoCount=1;
	private static List<Todo> todos=new ArrayList<>();
	static{
		todos.add(new Todo(todoCount++,"Diksha","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(todoCount++,"Aditya","Learn Azure",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(todoCount++,"Jaishika","Learn Spring",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(todoCount++,"Sushi","Learn MySQL",LocalDate.now().plusYears(1),false));	
	}
	
	public List<Todo> findByUsername(String username){
		Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String name,String description,LocalDate date,boolean done)
	{
	   todos.add(new Todo(todoCount++,name,description,date,done));
	}

	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getUserId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int userId) {
		Predicate<? super Todo> predicate = todo -> todo.getUserId() == userId;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getUserId());
		todos.add(todo);
		// TODO Auto-generated method stub
		
	}

}
