package com.nathandoe.streaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StreamingMetadataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamingMetadataServiceApplication.class, args);
	}

}
