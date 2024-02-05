package com.mk.jpa.example;

import com.mk.jpa.example.dao.UserRepo;
import com.mk.jpa.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaExampleSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpaExampleSpringBootApplication.class, args);
        UserRepo userRepo1 = context.getBean(com.mk.jpa.example.dao.UserRepo.class);
        System.out.println("Hello Jpa");

        User myUser = new User();
        myUser.setName("mk");
        myUser.setStatus("ok");
        myUser.setCity("pune");
        userRepo1.save(myUser);


    }

}
