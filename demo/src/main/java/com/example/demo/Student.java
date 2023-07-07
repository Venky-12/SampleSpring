package com.example.demo;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  
  private String name;
  private int age;
  private String address;
  
  public Student() {}
  public Student(String name, int age,String address) {
	   this.name = name;
	   this.age = age;
	   this.address = address;
  }
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getAddress() {
	return address;
}

}
