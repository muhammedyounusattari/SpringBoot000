package com.example.demo.model;

import java.util.List;

public class Suites {

	private String id,name;
	private List<Commands> commands;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Commands> getCommands() {
		return commands;
	}
	public void setCommands(List<Commands> commands) {
		this.commands = commands;
	}
	
	
}
