package com.rays.comparable;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id = 0;
private String name = null;
private String addr = null;

public Student(int id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAddr() {
    return addr;
}

public void setAddr(String addr) {
    this.addr = addr;
}



public String toString() {
    return id + " , " + name + " , " + addr;
}

@Override
public int compareTo(Student o) {
    int i = this.id -  o.id;
    if(i==0) {
    	int j = this.name.compareTo(name);
    	return j;
    }
    	return i;
}

}
class OrderByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        
        	int j = o1.getName().compareTo(o2.getName());
        	return j;
        
    
}
}