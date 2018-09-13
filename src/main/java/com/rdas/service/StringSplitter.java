package com.rdas.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StringSplitter {

    public void sayHello() {
        log.info("Printing 'Hello World!'");
    }

    public String getHello() {
        return "Java service  : 'Hello World!'";
    }
}
