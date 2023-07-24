package com.rays.comparable;


import java.util.*;

public class TestStudent { public static void main(String[] args) {

    List<Student> list = new ArrayList<>();
    list.add(new Student(10, "naman", "indore"));
    list.add(new Student(80, "sachin", "chandigarh"));
    list.add(new Student(70, "sourabh", "chennai"));
    list.add(new Student(40, "kapil", "Pune"));

    list.add(new Student(50, "Aashu", "Harda"));
    list.add(new Student(50, "adarsh", "Jammu"));
    list.add(new Student(30, "Vishal", "bhopal"));
    list.add(new Student(20, "anirudha", "jabalpur"));

    
    
       Collections.sort(list, new OrderByName());

    Iterator<Student> it = list.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
}
}