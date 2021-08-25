package Generics;

import java.util.Random;

public class randomGeneric {
	
	public int  randomnum()
	{
		Random ran=new Random();
		int number=ran.nextInt(100);
		return number;
		
				
	}

}
