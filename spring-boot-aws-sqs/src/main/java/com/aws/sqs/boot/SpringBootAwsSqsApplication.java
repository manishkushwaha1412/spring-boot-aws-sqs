package com.aws.sqs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication (exclude = {ContextStackAutoConfiguration.class, ContextInstanceDataAutoConfiguration.class, ContextRegionProviderAutoConfiguration.class})
public class SpringBootAwsSqsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsSqsApplication.class, args);
    }

}
