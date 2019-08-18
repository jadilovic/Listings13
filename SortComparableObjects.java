package Primjeri;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities = {"Bos. Novi", "Bos. Dubica", "Bos. Kostanjica", "Bos. Petrovac"};
		Arrays.sort(cities);
		for(String c: cities){
			System.out.print(c + "; ");
		}
		
		System.out.println();
		
		BigInteger[] bigInt = {new BigInteger("477758585858959"), new BigInteger("96784736636396"), new BigInteger("85764653536667")};
		Arrays.sort(bigInt);
		for(BigInteger b: bigInt){
			System.out.print(b + "; ");
		}
	}

}
