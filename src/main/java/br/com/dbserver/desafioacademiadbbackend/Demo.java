package br.com.dbserver.desafioacademiadbbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/")
    public String demo() {
        return "Hello World";
    }

}
