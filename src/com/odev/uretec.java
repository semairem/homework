package com.odev;

import java.util.Random;
import java.util.Scanner;

public class uretec {
	

	public static void main(String[] args) {
		uretme();
		}
	
	
	public static String uretme() {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen üretilmesini istediðiniz kadar harf sayýsý giriniz ");
		
		String olusanKelime="";
		int istenilenKelimeSayisi=scanner.nextInt();
		for(int i=0;i<istenilenKelimeSayisi;i++) {
			Random random=new Random();
			int rastgeleUretilecekSayi=random.nextInt(26);
			char olusanHarf=(char) (rastgeleUretilecekSayi+65);
			olusanKelime=olusanKelime+olusanHarf;
	}
		return olusanKelime;
}
	public static String uretmek() {
		
		
		
		String olusanKelime="";
		int istenilenKelimeSayisi=Integer.parseInt(Program.kullanicidenAlinacakDeger());
		for(int i=0;i<istenilenKelimeSayisi;i++) {
			Random random=new Random();
			int rastgeleUretilecekSayi=random.nextInt(26);
			char olusanHarf=(char) (rastgeleUretilecekSayi+65);
			olusanKelime=olusanKelime+olusanHarf;
	}
		return olusanKelime;
}}
