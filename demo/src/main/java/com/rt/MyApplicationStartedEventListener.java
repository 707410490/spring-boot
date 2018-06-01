package com.rt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by dell on 2018/5/31.
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{
    Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        SpringApplication app = applicationStartedEvent.getSpringApplication();
        logger.info("==MyApplicationStartedEventListener==");
    }
}
