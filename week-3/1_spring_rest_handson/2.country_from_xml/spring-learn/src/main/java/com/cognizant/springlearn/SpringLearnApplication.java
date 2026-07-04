package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void displayCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country1 =
                context.getBean("country1", Country.class);

        LOGGER.debug("{}", country1);

        Country country2 =
                context.getBean("country2", Country.class);

        LOGGER.debug("{}", country2);

        Country country3 =
                context.getBean("country3", Country.class);

        LOGGER.debug("{}", country3);

        Country country4 =
                context.getBean("country4", Country.class);

        LOGGER.debug("{}", country4);
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);

        displayCountry();
    }
}