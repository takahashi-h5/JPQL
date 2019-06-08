package jp.co.confrage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jp.co.confrage.controller.AccountController;

@SpringBootApplication
public class JpqlTestApplication implements CommandLineRunner {

	@Autowired
	AccountController controller;
	public static void main(String[] args) {
		SpringApplication.run(JpqlTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controller.select();
	}

}
