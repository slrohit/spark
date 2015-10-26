package com.spark.controller;

import org.eclipse.jetty.http.HttpStatus;

import spark.QueryParamsMap;
import spark.Request;
import spark.Response;

import com.spark.services.UserService;

public class UserController extends Controller {
	public static String getAllUsers(Request req, Response res) {
		UserService userService = new UserService();
		return gson.toJson(userService.getAllUser());
	}

	public static int createUser(Request req, Response res) {
		UserService userService = new UserService();
		QueryParamsMap queryParam = req.queryMap();
		userService.creatUser(queryParam.get("name").value(),
				Integer.parseInt(queryParam.get("age").value()));
		return HttpStatus.CREATED_201;
	}

	public static String getUser(Request req, Response res) {
		UserService userService = new UserService();
		return gson.toJson(userService.getUser(Integer.parseInt(req
				.params("id"))));
	}

	public static int deleteUser(Request req, Response res) {
		UserService userService = new UserService();
		userService.deleteUser(Integer.parseInt(req.params("id")));
		return HttpStatus.OK_200;
	}

	public static int updateUser(Request req, Response res) {
		UserService userService = new UserService();
		QueryParamsMap queryParam = req.queryMap();
		userService.updateUser(Integer.parseInt(req.params("id")), queryParam
				.get("name").value(), Integer.parseInt(queryParam.get("age")
				.value()));
		return HttpStatus.OK_200;
	}
}
