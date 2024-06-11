package org.example.common;

public class BeansException extends Exception {
    public BeansException(String msg) {
        super(msg);
    }
    public BeansException() {
        super("msg");
    }
}