package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import peaksoft.Person;
import peaksoft.animal.Horse;
import peaksoft.animal.Rabbit;

@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:application.properties")
public class MyConfig {
}