package com.example.kursspring;

import com.example.component.TestComponent;
import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.kursspring", "com.example.component"})	paczki w ktorych znajduja sie komponenty springowe
// klasy ktore sa komponentami springowymi
@ComponentScan(basePackageClasses = {Starter.class, Castle.class, Knight.class, Quest.class, TestComponent.class})
public class KursspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursspringApplication.class, args);
	}
}
