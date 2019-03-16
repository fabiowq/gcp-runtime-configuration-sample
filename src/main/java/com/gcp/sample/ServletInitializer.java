package com.gcp.sample;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * Servlet Initializer is needed because GAE standard environment requires a WAR packaging.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * Configure the application.
     *
     * @param application String Boot application
     * @return Spring Application Builder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
