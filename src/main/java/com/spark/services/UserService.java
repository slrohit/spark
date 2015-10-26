package com.spark.services;

import java.util.Collection;
import java.util.HashMap;

import com.spark.model.User;

public class UserService {
	
	// using in memory cache as database this needs to be replaced by database
	public static HashMap<Integer, User> users = new HashMap<Integer, User>();

	public void creatUser(String name, int age) {
		User user = new User();
		user.setAge(age);
		user.setName(name);
		user.setId(users.size());
		users.put(user.getId(), user);
	}

	public User getUser(int id) {
		return users.get(id);
	}

	public Collection<User> getAllUser() {
		return users.values();
	}

	public void deleteUser(int id) {
		users.remove(id);
	}

	public void updateUser(int id, String name, int age) {
		User user = users.get(id);
		user.setAge(age);
		user.setName(name);
	}
}
