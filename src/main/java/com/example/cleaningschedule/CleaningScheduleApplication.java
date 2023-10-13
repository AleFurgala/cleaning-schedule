package com.example.cleaningschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CleaningScheduleApplication {

	public static void main(String[] args) {

		SpringApplication.run(CleaningScheduleApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plan sprzątania. Wybierz dzień: ");
		int menu;

		System.out.println("1.Poniedziałe \n" +
				"2.Wtorek \n" +
				"3.Środa \n" +
				"4.Czwartek \n" +
				"5.Piątek\n" +
				"0.Zamknij program ");

		menu = scanner.nextInt();

		switch (menu){
			case 1:
				System.out.println("Poniedziałe");
				break;
			case 2:
				System.out.println("Wtorek");
				break;
			case 3:
				System.out.println("Środa");
				break;
			case 4:
				System.out.println("Czwartek");
				break;
			case 5:
				System.out.println("Piątek");
				break;
			default:
				System.out.println("Wprowadziłeś blędny numer");
		}

	}
	}

