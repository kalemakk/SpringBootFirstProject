package com.arnoldkk.real;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
public class RealApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealApplication.class, args);
    }
    @RequestMapping(value = "/{firstName}/{lastName}",method = RequestMethod.GET)
    String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){

        return String.format("{\"message\":\"Hello %s %s how are you \"}",firstName,lastName);
    }
    @RequestMapping(value = "/phone/{phoneNumber}",method = RequestMethod.GET)
    String phoneNumber(@PathVariable("phoneNumber") String phoneNumber){
        return String.format("{\"My phone Number is %s}",phoneNumber);
    }
}
