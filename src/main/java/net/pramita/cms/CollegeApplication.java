package net.pramita.cms;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollegeApplication implements CommandLineRunner {
	
	Logger logger= LoggerFactory.getLogger(CollegeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CollegeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Info Logger added");
	    logger.warn("Warn logger added");
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		logger.info("Info Logger added");
//		logger.debug("Debug Logger Added");
//	logger.warn("Warn logger added");
		
	}


