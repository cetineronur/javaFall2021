package javaPractise5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
	//Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların 
	//toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
	// ve yeni array’i ekrana yazdıran bir program yazınız  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
		
		
		int[][] array =	{ {1,2,3}, {4,5}, {6,7} };
		int[] neuArray = new int[3];
		
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				neuArray[i]+=array[i][j];
			}
		}System.out.println(Arrays.toString(neuArray));

	}
}
