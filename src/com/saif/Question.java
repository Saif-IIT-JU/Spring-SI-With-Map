package com.saif;

import java.util.*;
public class Question {

	private int id;
	private String name;
	private Map<String, String>answers;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAnswers(Map<String, String>answers)
	{
		this.answers = answers;
	}
	
	void display()
	{
		System.out.println("Question id : " + id);
		System.out.println("Question is : " + name);
		System.out.println("Answers are ...");
		Iterator itr = answers.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry e = (Map.Entry)itr.next();
			System.out.println(e.getKey() + " posted by " + e.getValue());
		}
	}
}
