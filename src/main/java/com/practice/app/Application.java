package com.practice.app;

import com.practice.controller.ArithmeticController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Application {

	public static void main(String[] args) {
		Javalin app = Javalin.create(config -> {
			//config.addStaticFiles("static", Location.CLASSPATH);
		    config.bundledPlugins.enableCors(cors -> {
		        cors.addRule(it -> {
		            it.allowHost("http://localhost:5500", "http://127.0.0.1:5500");
		            		            
		        });
		    });
		});
		
		ArithmeticController acon = new ArithmeticController();
		acon.mapEndpoints(app);
		
		app.start(8080);

	}

}
