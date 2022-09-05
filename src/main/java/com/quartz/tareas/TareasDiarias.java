package com.quartz.tareas;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TareasDiarias {

	//original - sin instruccion en application.properties
	//@Scheduled(cron = "0/5 * * * * ?")
	@Scheduled(cron = "${cron-string}")
	public void everyFiveSeconds() {
		System.out.println("Tareas diarias: " + new Date());
	}
}
