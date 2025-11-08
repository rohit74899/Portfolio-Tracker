package com.portfolio.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; 

@SpringBootApplication
public class PortfolioTrackerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PortfolioTrackerApplication.class, args);
		
		//Entity_Master obj=new Entity_Master();
		
		
		Entity_Master obj = context.getBean(Entity_Master.class);
		obj.Code();
		
		//System.out.println(obj);
	}

}
