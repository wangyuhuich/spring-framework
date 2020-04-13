package org.springframework.beans;
/**
* @Description:    Person
* @Author:         王昱辉
* @CreateDate:     2020-04-13 21:40
* @Email:          wtchange@163.com
* @Version:        1.0
*/
public class Person {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}