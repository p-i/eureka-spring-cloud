package net.pi.components.crud;

import net.pi.components.crud.core.config.MongoConfigurationOverride;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
public class ServiceDiscoveryAnotherClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryAnotherClientApplication.class, args);
    }

}
