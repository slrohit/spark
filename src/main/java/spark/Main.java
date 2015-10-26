package spark;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;
import static spark.Spark.delete;
import spark.template.velocity.VelocityTemplateEngine;

import com.spark.controller.GreetController;
import com.spark.controller.IndexController;
import com.spark.controller.UserController;

public class Main {
	public static final VelocityTemplateEngine VELOCITY_ENGINE = new VelocityTemplateEngine();

	public static void main(String[] args) {
		setUpRoutes();
	}

	private static void setUpRoutes() {
		get("/", IndexController::index, VELOCITY_ENGINE);
		get("/greet/:name", GreetController::greet, VELOCITY_ENGINE);
		get("/users", UserController::getAllUsers);
		get("/users/:id", UserController::getUser);

		post("/user", UserController::createUser);
		put("/user/update/:id",UserController::updateUser);
		delete("user/delete/:id", UserController::deleteUser);
	}
}
