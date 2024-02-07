package com.springboot.webapp.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {
	private int userId;

	@Size(min = 10, message = "Enter at least 10 characters")
	private String description;
	private String userName;
	private LocalDate date;
	private boolean done;

	public Todo(int userId, String userName, String description, LocalDate date, boolean done) {
		super();
		this.userId = userId;
		this.description = description;
		this.userName = userName;
		this.date = date;
		this.done = done;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", description=" + description + ", userName=" + userName + ", date="
				+ date + ", done=" + done + "]";
	}
}
