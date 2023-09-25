package com.zoo.animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

	@Override
	@Primary
	public void nameOfAnimal() 
	{
		System.out.println("This is Tiger");

	}

}
