package com.spark.controller;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class IndexController extends Controller {
	public IndexController(){
		
	}
	public static ModelAndView index(Request req, Response res) {
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("template", "templates/index/index.html");
		model.put("name", "Rohit Verma");
		return new ModelAndView(model, LAYOUT_FILE);
	}
}
