package com.example.springbootbackend;

import com.example.springbootbackend.model.Student;
import com.example.springbootbackend.repository.StudentRepository;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class Main  {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(Main.class, args);
	}


}
