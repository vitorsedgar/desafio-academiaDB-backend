package br.com.dbserver.desafioacademiadbbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DesafioAcademiadbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioAcademiadbApplication.class, args);
    }

}
