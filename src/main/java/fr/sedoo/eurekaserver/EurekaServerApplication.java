package fr.sedoo.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.github.lalyos.jfiglet.FigletFont;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServerApplication {
    public static void main(String[] args) {
    	log.info("\n"+FigletFont.convertOneLine("<<< Eureka >>>"));
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}