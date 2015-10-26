package com.spark.controller;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class GreetController extends Controller {
	public GreetController() {
	}

	public static ModelAndView greet(Request req, Response res) {
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("template", "templates/greet/greet.html");
		model.put("name", req.params("name"));
		return new ModelAndView(model, LAYOUT_FILE);
	}
}
