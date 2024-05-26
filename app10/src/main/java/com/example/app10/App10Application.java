package com.example.app10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App10Application {

	public static void main(String[] args) {
		SpringApplication.run(App10Application.class, args);
	}

}
//http://localhost:1010/upload
/*Status COdes
 
 *
 *100-199
 *just request got initiated
 *
 *200-299 
 *Sucess
 *
 *300-399
 *redirecting to other resources
 *
 *
 **400 bad input from api
 *
 **401 Authourizaton failed
 *
 ** 404 client side mistakes
 *an explicit status code this happens while cient part there is a spellmistake 
 
 
 *500-599 all these errors codes are unhandeled exception 
 *serverside errors
 * */
 