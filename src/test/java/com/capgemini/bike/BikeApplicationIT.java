package com.capgemini.bike;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



class Person {

	public final String name;
	public final int age;

	public int andereAge;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}


	public Person() {
		this.name = "";
		this.age = 999;

	}

}

@RunWith(SpringRunner.class)
@SpringBootTest
public class BikeApplicationIT {




	public static void main(String[] args) {

		int f1;

		int f;



		int a;
		int $;

		int _$aap;

//		int -drie;

		final int AANTAL=5;

//		AANTAL++;

		System.out.println(AANTAL);



		final Person p = new Person("Richard", 16);

//		p.name = "Muriel";

//		p = new Person("Frank", 43);

	}

	@Test
	public void contextLoads() {
	}



}
