package com.serviceapp1.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MessageController {
    private AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public MessageModel getHelloWordObject() {
        MessageModel hello = new MessageModel();
        hello.setMessage("Hi there! you are number " + counter.incrementAndGet());
        return hello;
    }
}
