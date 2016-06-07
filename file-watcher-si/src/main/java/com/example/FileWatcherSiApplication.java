package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:/spring/file-watcher-si-config.xml")
public class FileWatcherSiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileWatcherSiApplication.class, args);
	}
}
