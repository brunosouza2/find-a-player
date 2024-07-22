package br.com.findaplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FindaplayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindaplayerApplication.class, args);
	}

}
