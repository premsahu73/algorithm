package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {

		Student st1 = new Student(1,"Prem");
		Student st2 = new Student(2,"Shyam");
		Student st3 = new Student(3,"Raj");
		Student st4 = new Student(4,"Priya");
		Student st5 = new Student(5,"Suman");
		Student st6 = new Student(6,"kumkum");

		/*List<Student> list = new ArrayList<>();
		list.add(st1);list.add(st2);list.add(st3);list.add(st4);list.add(st5);list.add(st6);
		list.stream().forEach(p ->{if(p.getId()%2==0) System.out.println(p.getId() +" student "+p.getName());});*/
		listStudent();
	}

	
	public static String listStudent(){

		String[] num = {"Prem","Rahul","Rohit"};
		//String ll = ('Prem','Rahul','Rohit');
		List<String> alist = Arrays.asList(num);
		String ll = alist.stream().map(a->"'"+a+"'").collect(Collectors.toList()).toString()
				.replaceAll("\\[", "(").replaceAll("\\]", ")");
		System.out.println(ll);
		return null;
	}

	/*public static String listStudent(){

		String[] num = {"Prem","Rahul","Rohit"};
		//String ll = ('Prem','Rahul','Rohit');
		String where="(";
        for (int i=0;i<num.length;i++) {
            if(i==0){
                where +="'"+num[i]+"'";
            }
            if(i>1 && i<num.length)
                where+=", '"+num[i]+"'";
        }
        where+=")";
        System.out.println(where); 
		return null;
	}

	 */
}
