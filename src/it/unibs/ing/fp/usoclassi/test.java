package it.unibs.ing.fp.usoclassi;

//importazione della classe Random
import java.util.Random;

public class test {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println (r.nextInt());
		
		//esempio classe istanziabile
		String saluto = new String("Ciao coglione");
		System.out.println (saluto);
		
		//esempio non istanziabile
		System.out.println(Math.max(12.0, 23.0));
	}

}
