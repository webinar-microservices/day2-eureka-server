package in.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Day2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day2EurekaServerApplication.class, args);
	}

}
