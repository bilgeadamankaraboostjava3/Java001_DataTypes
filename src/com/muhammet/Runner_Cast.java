package com.muhammet;

public class Runner_Cast {

	public static void main(String[] args) {
		byte byte_sayi = 23;
		int int_sayi = 5000;
		System.out.println("byte say�.....: "+ byte_sayi);
		System.out.println("int say�.....: "+ int_sayi);
		int_sayi = byte_sayi; // int_sayi = 23
		System.out.println("byte say�.....: "+ byte_sayi);
		System.out.println("int say�.....: "+ int_sayi);
		
		int sayi1 = 500;
		byte byte_sayi1; //-128 ... 0  .. 127
		//short_sayi = sayi1; // atama olur mu????   bu �ekilde direkt atama olmaz ancak
		byte_sayi1 = (byte)sayi1; // ayn� t�r deki de�i�kenleri cast edebilirsiniz.
		System.out.println("sayi1...: "+ sayi1);
		System.out.println("byte sayi...: "+ byte_sayi1);
	}

}
