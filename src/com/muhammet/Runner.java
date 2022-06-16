package com.muhammet;

public class Runner {

		
	public static void main(String[] args) {
		
		/**
		 * DE���KENLER
		 * 1- Primitive Data Type - �lkel veri tipleri
		 * 1.1 Say�sal
		 * 1.1.1 byte -> 8bit
		 */
		/**
		 * De�i�ken tan�mlama
		 * 1- Data Type + Name + ;
		 * 2- Data Type + Name + atama + de�er + ;
		 * De�i�ken Tan�mlama Kurallar�
		 * K1- �zel karakterleri kullanmay�n.(*;, v.s)
		 * K2- De�i�ken ad�nda bo�luk olmaz
		 * K3- Dei�kenler say� ile ba�lamaz
		 * K4- T�rk�e karakter kullanmamaya �zen g�sterin. Hem profesyonel g�r�nmez hemde
		 *     repolara kodlar�n�z� atarken sorunlar ya�ayabilirsiniz. ay�n �ekilde kodlar�n�
		 *     g�nderdi�iniz ki�iler �al��t�ramayabilir.
		 * K5- alt tire kullan�labilir.
		 * K6- k���k harfile ba�lay�p kullan�n
		 * �DEV -> De�i�ken ad� tan�mlama �ekillleri. (Pascal Notasyonu, CameCase .. v.s)    
		 */
		
		// k1. byte *onemlidegisken;
		// k2. byte yeni degisken;
		// k3. byte 1degiskeni;
		// k4. byte i�b���n�����;
		byte PI;
		byte DegiskenTanimlama;
		byte degiskenTanimlama;
		byte degiskentanimlama;
		
		byte byte_sayi;
		byte byte_sayi2 = 2;
		
		/**
		 * De�er Atamak
		 * De�i�ken + atama operat�r� + de�er + ;
		 */
		/**
		 * D�KKAT
		 * ��aret Bit' i denilen bir bit vard�r ve tutulan de�erin - ya da + oldu�unu i�aretler
		 * 128 adet 
		 */
		byte_sayi = 1;     // 0 0 0 0 0 0 0 1  = 256 adet karakter
		byte_sayi = 127;  // ????? Negatif say�
		byte_sayi = -128;
		
		/**
		 * 1.1.2 short -> 16bit
		 */
		short short_sayi;
		// NOT: ide ye ait k�sa yol �nerilerini g�r�nt�lemek i�in ctrl+bo�luk kullanabilirsiniz.
		short_sayi = 3520;
		short_sayi = -25544;
		
		/** 
		 * 1.1.3 int (Integer) -> 32bit
		 */
		int int_sayi = 534543535;
		int_sayi = -42342342;
		
		/**
		 * 1.1.4 long (Long) -> 64bit
		 */
		long long_sayi = 9223372036854775807L;
		long_sayi = 9223372036854775807l;
		
		/**
		 * 1.1.5. float -> (ondal�l� sy�lar� ifade ediyorz.) 32bit
		 * 1.402*2^-45 - 3.4*2^38
		 * Finansal i�lemler para i�lemleri ve bilimsel hesaplamalarda BigDecimal
		 * ondal�kl� say�larda default de�er double
		 */
		float float_sayi = 1;
		float_sayi = -121212.2121F;
		float_sayi = 34343443.3444f;
		
		/**
		 * 1.1.5 double -> 64bit
		 */
		double double_sayi = 123232323323323l;
		double_sayi = 32423432424.43243244;
		double_sayi = -343434344343.4343434344;
		
		// _ �izgi kullan�labilir.
		long iban = 60_5450_6565_6555_5443L;
		long uzunsayi = 1_765_554_433_000_000L;
		System.out.println("iban....: "+ iban);
		
		// e ile ifade etme 
		double dsayi = 123.45;
		System.out.println("dsayi....: "+ dsayi);
		dsayi = 1.2345e2;
		System.out.println("e ile dsayi...: "+ dsayi);
		// NOT: Dil i�in Default de�i�ken de�erleri vard�r.
		// tamsay�da -> default de�er int
		System.out.println(1); // byte, short, int, long ???
		System.out.println("selam");
		System.out.println('A');
		System.out.println(true);
		
		// NOT: �u �ekilde max ve min de�erlerini alabilirsibiz.
		// syso yaz�p, ctrl+bo�luk tu�u yaparsan�z ��kar
		System.out.println("byte max...: "+ Byte.MAX_VALUE); // max - min al�nabilir
		System.out.println("short max...: "+ Short.MAX_VALUE);
		System.out.println("int max...: "+ Integer.MAX_VALUE);
		System.out.println("long max...: "+ Long.MAX_VALUE);
		System.out.println("float max...: "+ Float.MAX_VALUE);
		System.out.println("double max...: "+ Double.MAX_VALUE);
		// K�sayollar -> kopayala -> crtl+c (copy) / ctrl+v
		// kopyalama-> cursor �n oldu�u yerde iken ctrl+alt+a�a�� ok tu�u
		
		/**
		 * 1.2 Karakter veri tipleri
		 * 1.2.1 char -> 8bit
		 * De�er olarak 0-255 aras� de�er al�r
		 * ya da karakter tek t�rnak('') kullan�larak atanabilir
		 */
		
		char karakter = 125;
		System.out.println("125. Katakter...: "+ karakter);
		karakter = 'Y';
		System.out.println("Y karakteri..... "+ karakter);
		/**
		 * 1.2.2 String -> (References Data Type -> )
		 */
		// {'a','l','i'}
		System.out.print('A');
		System.out.print('l');
		System.out.print('i');
		System.out.println("Ali");
		String ifade = "Bug�n kodlamaya ba�lad�k";
		System.out.println(ifade);
		
		
		/**
		 * 1.3. -> boolean -> 1bit -> 0-1
		 * a��k-kapal� / onay-red / do�ru/yanl��
		 */
		// NOT: bir kullan�c�n�n aktif olma durumu
		// ya da bir datan�n silinmi� olup olmad���
		boolean boolean_degisken = true;
		boolean_degisken = false;
		
	} // Method Sonu

}// Class Sonu
