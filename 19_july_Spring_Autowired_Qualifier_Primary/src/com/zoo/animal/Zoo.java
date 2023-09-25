package com.zoo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Zoo
{
	@Qualifier("lion")
	@Autowired
	Animal animal;

	public Zoo() {
		System.out.println("This is Zoo");
		
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	

}
