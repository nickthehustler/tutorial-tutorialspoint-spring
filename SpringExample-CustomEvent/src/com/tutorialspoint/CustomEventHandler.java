package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

/**
 * Created by nick_x on 8/3/17.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
