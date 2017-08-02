package com.tutorialspoint;

/**
 * Created by nick_x on 8/2/17.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}
