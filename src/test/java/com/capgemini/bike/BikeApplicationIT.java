package com.capgemini.bike;

import com.capgemini.bike.util.ICalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
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
@ActiveProfiles("test")
public class BikeApplicationIT {

	@Autowired
	private ICalculator iCalculator;

	@Test
	public void contextLoads() {

		Assert.assertNotNull(this.iCalculator);

		System.err.println(this.iCalculator.getClass());
	}



}
