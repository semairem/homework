package com.odev;

import java.util.Random;
import java.util.Scanner;

public class Program {
	static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) {
	
	uretec ureyenKelime =new uretec();
	ureyenKelime.uretme();
	
	OkulProgramBasligi programBasligiYazdirma=new OkulProgramBasligi();
	programBasligiYazdirma.okulAdi="Fatih Biliþim Okulu";
	programBasligiYazdirma.programAdi="Java Programlama";
	System.out.println("");
	System.out.println("*********************"+programBasligiYazdirma.okulAdi+"*********************");
	System.out.println("***********************"+programBasligiYazdirma.programAdi+"***********************");
	System.out.println("*******************************************************************"); 	
	
	programBasligiYazdir("Fatih Biliþim Okulu ");
	ayracYazdir();
	islemSonucuYazdir(7,5);
	
	String[] ogrenciler=new String [10];
	Random random=new Random();
	
	
	
	for(int i=0; i<10;i++) {
		
		int ogrenciNumarasi=random.nextInt(100);
		ogrenciler[i]=uretec.uretmek();
		System.out.println(i+1+" öðrencinin adý: "+ogrenciler[i]+" numarasý"+ogrenciNumarasi);
	}
	
	}
	
	
	
public static String kullanicidenAlinacakDeger() {
	
		System.out.println("Lütfen üretilmesini istediðiniz kadar harf sayýsý giriniz ");
	String sayi="";
	sayi=scanner.next();
	return sayi;
}
static void programBasligiYazdir(String baslik) {
	
	System.out.println("");
	System.out.println("****************************************************");
	System.out.println("*********************"+baslik+"*********************");
	System.out.println("****************************************************");
}
	
static void ayracYazdir() {
	System.out.println("");
	System.out.println("****************************************************");
}
static int islemSonucuYazdir(int s1,int s2) {
	int sonuc=s1+s2;
	System.out.println("");
	System.out.println("****************"+s1+"+"+s2+"="+sonuc+"***************");
	System.out.println("");
	return sonuc;
}
}
