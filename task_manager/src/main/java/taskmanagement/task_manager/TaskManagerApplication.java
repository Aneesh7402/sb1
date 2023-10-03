package taskmanagement.task_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class TaskManagerApplication {
	@Bean
	public WebClient.Builder primarybean(){
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

}
