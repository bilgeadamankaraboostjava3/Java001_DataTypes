package com.muhammet;

public class Runner {

		
	public static void main(String[] args) {
		
		/**
		 * DEÐÝÞKENLER
		 * 1- Primitive Data Type - Ýlkel veri tipleri
		 * 1.1 Sayýsal
		 * 1.1.1 byte -> 8bit
		 */
		/**
		 * Deðiþken tanýmlama
		 * 1- Data Type + Name + ;
		 * 2- Data Type + Name + atama + deðer + ;
		 * Deðiþken Tanýmlama Kurallarý
		 * K1- Özel karakterleri kullanmayýn.(*;, v.s)
		 * K2- Deðiþken adýnda boþluk olmaz
		 * K3- Deiþkenler sayý ile baþlamaz
		 * K4- Türkçe karakter kullanmamaya özen gösterin. Hem profesyonel görünmez hemde
		 *     repolara kodlarýnýzý atarken sorunlar yaþayabilirsiniz. ayýn þekilde kodlarýný
		 *     gönderdiðiniz kiþiler çalýþtýramayabilir.
		 * K5- alt tire kullanýlabilir.
		 * K6- küçük harfile baþlayýp kullanýn
		 * ÖDEV -> Deðiþken adý tanýmlama þekillleri. (Pascal Notasyonu, CameCase .. v.s)    
		 */
		
		// k1. byte *onemlidegisken;
		// k2. byte yeni degisken;
		// k3. byte 1degiskeni;
		// k4. byte iþbüðünçççþþ;
		byte PI;
		byte DegiskenTanimlama;
		byte degiskenTanimlama;
		byte degiskentanimlama;
		
		byte byte_sayi;
		byte byte_sayi2 = 2;
		
		/**
		 * Deðer Atamak
		 * Deðiþken + atama operatörü + deðer + ;
		 */
		/**
		 * DÝKKAT
		 * Ýþaret Bit' i denilen bir bit vardýr ve tutulan deðerin - ya da + olduðunu iþaretler
		 * 128 adet 
		 */
		byte_sayi = 1;     // 0 0 0 0 0 0 0 1  = 256 adet karakter
		byte_sayi = 127;  // ????? Negatif sayý
		byte_sayi = -128;
		
		/**
		 * 1.1.2 short -> 16bit
		 */
		short short_sayi;
		// NOT: ide ye ait kýsa yol önerilerini görüntülemek için ctrl+boþluk kullanabilirsiniz.
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
		 * 1.1.5. float -> (ondalýlý syýlarý ifade ediyorz.) 32bit
		 * 1.402*2^-45 - 3.4*2^38
		 * Finansal iþlemler para iþlemleri ve bilimsel hesaplamalarda BigDecimal
		 * ondalýklý sayýlarda default deðer double
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
		
		// _ çizgi kullanýlabilir.
		long iban = 60_5450_6565_6555_5443L;
		long uzunsayi = 1_765_554_433_000_000L;
		System.out.println("iban....: "+ iban);
		
		// e ile ifade etme 
		double dsayi = 123.45;
		System.out.println("dsayi....: "+ dsayi);
		dsayi = 1.2345e2;
		System.out.println("e ile dsayi...: "+ dsayi);
		// NOT: Dil için Default deðiþken deðerleri vardýr.
		// tamsayýda -> default deðer int
		System.out.println(1); // byte, short, int, long ???
		System.out.println("selam");
		System.out.println('A');
		System.out.println(true);
		
		// NOT: þu þekilde max ve min deðerlerini alabilirsibiz.
		// syso yazýp, ctrl+boþluk tuþu yaparsanýz çýkar
		System.out.println("byte max...: "+ Byte.MAX_VALUE); // max - min alýnabilir
		System.out.println("short max...: "+ Short.MAX_VALUE);
		System.out.println("int max...: "+ Integer.MAX_VALUE);
		System.out.println("long max...: "+ Long.MAX_VALUE);
		System.out.println("float max...: "+ Float.MAX_VALUE);
		System.out.println("double max...: "+ Double.MAX_VALUE);
		// Kýsayollar -> kopayala -> crtl+c (copy) / ctrl+v
		// kopyalama-> cursor ün olduðu yerde iken ctrl+alt+aþaðý ok tuþu
		
		/**
		 * 1.2 Karakter veri tipleri
		 * 1.2.1 char -> 8bit
		 * Deðer olarak 0-255 arasý deðer alýr
		 * ya da karakter tek týrnak('') kullanýlarak atanabilir
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
		String ifade = "Bugün kodlamaya baþladýk";
		System.out.println(ifade);
		
		
		/**
		 * 1.3. -> boolean -> 1bit -> 0-1
		 * açýk-kapalý / onay-red / doðru/yanlýþ
		 */
		// NOT: bir kullanýcýnýn aktif olma durumu
		// ya da bir datanýn silinmiþ olup olmadýðý
		boolean boolean_degisken = true;
		boolean_degisken = false;
		
	} // Method Sonu

}// Class Sonu
