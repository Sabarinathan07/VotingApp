package com.sabari.demo;

public class EventName {
	private String name;
	private int likes;
	public EventName(String names,int likes){
		this.name=names;
		this.likes=likes;
	}
	
	public String getNames(){
		return name;
	}
	public int getLikes(){
		return this.likes;
	}
	
	public void setLikes(int likes){
		this.likes=likes;
	}

}
