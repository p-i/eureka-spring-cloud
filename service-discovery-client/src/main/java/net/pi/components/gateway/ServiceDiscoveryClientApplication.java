package net.pi.components.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
/*@EnableDiscoveryClient*/
public class ServiceDiscoveryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryClientApplication.class, args);
    }
}
