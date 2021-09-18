package ro.go.bogdanenache;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SrGen1Application {

	public static void main(String[] args) {
		SpringApplication.run(SrGen1Application.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
