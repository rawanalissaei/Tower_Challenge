package com.challenge.Tower_Challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


/**
 * Main application class for the Tower Challenge project.
 * Excludes the data source and Hibernate JPA auto-configuration since we are not using a database.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class TowerChallengeApplication {

	/**
	 * Main method to start the application.
	 *
	 * @param args command line arguments
	 */

	public static void main(String[] args) {
		SpringApplication.run(TowerChallengeApplication.class, args);
	}
}
