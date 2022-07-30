package io.github.maenrico.msavaliadorcredito;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableRabbit
public class MsavaliadorcreditoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsavaliadorcreditoApplication.class, args);
    }

}
