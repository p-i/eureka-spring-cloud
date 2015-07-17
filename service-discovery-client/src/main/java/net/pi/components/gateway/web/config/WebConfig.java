package net.pi.components.gateway.web.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import net.pi.services.common.interceptors.W3CExtendedLogFileRESTInterceptor;
import net.pi.services.common.spring.ExceptionsHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * Created by oleg on 17/07/15.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"net.pi.components.gateway.web.controllers"})
public class WebConfig {

    @Bean
    ExceptionsHandler exceptionsHandler() {
        return new ExceptionsHandler();
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);

        JSR310Module jsr310Module = new JSR310Module();
        mapper.registerModule(jsr310Module);
        return mapper;
    }

}
