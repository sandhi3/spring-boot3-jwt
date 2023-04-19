package com.javatechie;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var b = new BCryptPasswordEncoder();
		System.out.println(b.encode("Raghu"));
	}

}
