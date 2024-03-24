package org.infnet.infnetapiwebrestful;

import org.infnet.infnetapiwebrestful.model.domain.Professor;
import org.infnet.infnetapiwebrestful.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class InfnetApiWebRestfulApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(InfnetApiWebRestfulApplication.class, args);
    }

}
