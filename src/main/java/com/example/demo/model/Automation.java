package com.example.demo.model;

import java.util.ArrayList;

public class Automation {

	private String id, version, name, url;
	private ArrayList<Suites> tests;
	private ArrayList<?> suites;
	private ArrayList<?> urls;
	private ArrayList<?> plugins;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ArrayList<Suites> getTests() {
		return tests;
	}

	public void setTests(ArrayList<Suites> tests) {
		this.tests = tests;
	}

	public ArrayList<?> getSuites() {
		return suites;
	}

	public void setSuites(ArrayList<?> suites) {
		this.suites = suites;
	}

	public ArrayList<?> getUrls() {
		return urls;
	}

	public void setUrls(ArrayList<?> urls) {
		this.urls = urls;
	}

	public ArrayList<?> getPlugins() {
		return plugins;
	}

	public void setPlugins(ArrayList<?> plugins) {
		this.plugins = plugins;
	}

}
