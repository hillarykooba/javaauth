package com.demojpa.demojpa;

import com.demojpa.demojpa.auth.AuthenticationService;
import com.demojpa.demojpa.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.demojpa.demojpa.user.Role.ADMIN;
import static com.demojpa.demojpa.user.Role.MANAGER;

@SpringBootApplication
public class DemojpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemojpaApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(StudentRespository studentRespository) {
//        return args -> {
//            Student maria = new Student(
//                    "Maria",
//                    "Sam",
//                    "sma@sam.com",
//                    21
//            );
//            studentRespository.save(maria);
//
//
//        };
//    }

//    @Bean CommandLineRunner commandLineRunner(
//            AuthenticationService authenticationService
//    ) {
//        return args -> {
//            var admin = RegisterRequest.builder()
//                    .firstName("Admin")
//                    .lastName("Last Admin")
//                    .email("admin1@admin.com")
//                    .password("password")
//                    .role(ADMIN)
//                    .build();
//
//            System.out.println("Admin token: " + authenticationService.register(admin).getAccessToken());
//
//            var manager = RegisterRequest.builder()
//                    .firstName("Manager")
//                    .lastName("Last Manager")
//                    .email("manager1@admin.com")
//                    .password("password")
//                    .role(MANAGER)
//                    .build();
//
//            System.out.println("Manager token: " + authenticationService.register(admin).getAccessToken());
//
//        };
//    }

}
