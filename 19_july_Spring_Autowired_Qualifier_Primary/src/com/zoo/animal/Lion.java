package com.zoo.animal;

import org.springframework.stereotype.Component;

@Component("lion")
public class Lion implements Animal
{
	public void nameOfAnimal()
	{
		System.out.println("This is lion");
	}

}
