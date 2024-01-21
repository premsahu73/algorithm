package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class DeleteObjectList {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();
		userList.add(new User(1, "Prem"));
		userList.add(new User(2, "Raju"));
		userList.add(new User(3, "Amar"));
		userList.add(new User(4, "Hira"));
		DeleteObjectList.firstWay(userList);
		DeleteObjectList.secondWay(userList);
		DeleteObjectList.thirdWay(userList);
		userList.forEach(user -> {
			System.out.println(user.getId() + "   " + user.getName());
		});

	}

	private static void firstWay(List<User> userlist) {
		List<User> myList = new CopyOnWriteArrayList<User>();
		myList.addAll(userlist);
		for (User user : myList) {
			if (user.getName().startsWith("P")) {
				userlist.remove(user);
			}
		}
	}

	private static void secondWay(List<User> userlist) {
		for (int i = 0; i < userlist.size(); i++) {
			if (Objects.equals(true, userlist.get(i).getName().startsWith("R"))) {
				userlist.remove(i);
			}
		}
	}
	private static void thirdWay(List<User> userlist) {

		for (User user : userlist) {
			if (user.getName().startsWith("A")) {
				userlist.remove(user);
			}
		}
	}
}

class User {

	int id;
	String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}