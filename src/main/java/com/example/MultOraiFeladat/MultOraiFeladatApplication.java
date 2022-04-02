package com.example.MultOraiFeladat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class MultOraiFeladatApplication {

	public static void main(String[] args) {
		Eloleny eloleny = new Eloleny(-3);
		eloleny.ehsegmutato();
	}

}
