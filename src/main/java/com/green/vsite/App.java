package com.green.vsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:conf/application.porperties"})
public class App 
{
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }
    
    
	
}
