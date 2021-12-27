/**
 * Created by abuzer.alaca on 27/12/2021
 **/


package com.spring.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver}
 * {@link com.coxautodev.graphql.tools.GraphQLMutationResolver}
 */
@SpringBootApplication
public class GraphQLApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }
}
