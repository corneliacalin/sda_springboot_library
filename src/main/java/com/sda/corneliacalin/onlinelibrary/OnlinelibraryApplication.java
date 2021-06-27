package com.sda.corneliacalin.onlinelibrary;

import com.sda.corneliacalin.onlinelibrary.model.LibraryAccount;
import com.sda.corneliacalin.onlinelibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OnlinelibraryApplication implements CommandLineRunner {


    @Autowired
    private UserService userService;

    public static void main(String[] args) {


        SpringApplication.run(OnlinelibraryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();


        // put here our code
        LibraryAccount libraryAccount1 = new LibraryAccount();
        libraryAccount1.setId(1L);
        userService.addUser(libraryAccount1);

        userService.getUserLibraryAccounts().forEach(System.out::println);



    }
}
