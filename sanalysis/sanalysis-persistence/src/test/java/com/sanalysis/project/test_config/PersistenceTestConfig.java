package com.sanalysis.project.test_config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class. Add Spring Beans here.
 */
@Configuration
@ComponentScan({"com.sanalysis.project.persistence",})
public class PersistenceTestConfig {

    // Add your Spring Beans here...
}