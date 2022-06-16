package com.muhammet;

public class Runner_Cast {

	public static void main(String[] args) {
		byte byte_sayi = 23;
		int int_sayi = 5000;
		System.out.println("byte sayı.....: "+ byte_sayi);
		System.out.println("int sayı.....: "+ int_sayi);
		int_sayi = byte_sayi; // int_sayi = 23
		System.out.println("byte sayı.....: "+ byte_sayi);
		System.out.println("int sayı.....: "+ int_sayi);
		
		int sayi1 = 500;
		byte byte_sayi1; //-128 ... 0  .. 127
		//short_sayi = sayi1; // atama olur mu????   bu şekilde direkt atama olmaz ancak
		byte_sayi1 = (byte)sayi1; // aynı tür deki değişkenleri cast edebilirsiniz.
		System.out.println("sayi1...: "+ sayi1);
		System.out.println("byte sayi...: "+ byte_sayi1);
	}

}
