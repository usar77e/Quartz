package com.quartz.tareas;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TareasDiarias {

	@Scheduled(cron = "0/5 * * * * ?")
	public void everyFiveSeconds() {
		System.out.println("Tareas diarias: " + new Date());
	}
}
