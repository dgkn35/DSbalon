import java.io.*;
import java.util.*;
import java.util.Scanner;

public class balon {

	public static void main(String[] args) {
		
		ArrayList<Object> otopark = new ArrayList<Object>();
		otopark=ekleme();
		katlari_yazdir(otopark);
		
		
	}
	
	public static int menu(){
		int secim;
		
		do{
			System.out.println("1) Tum katlarýn listesi");
			System.out.println("2) Otopark problemi");
			System.out.println("3) 3 saniyede n adet ortalama otopark probleminin cozumu");
			System.out.println("4) Cikis:");
			System.out.println();
			System.out.println("Seciminizi giriniz:");
			Scanner in = new Scanner(System.in); 
			secim=in.nextInt();
		}while(secim!=4);
		
		return secim;

	}
	
	public static void add_queue(String[] r,Queue<araba> kat){
		
		for(int i=0;i<10;i++){
			araba a1=new araba(r[i]);
			kat.add(a1);
			
		}
	}
public static void add_stack(String[] r,Stack<araba> eklenen){
		
		for(int i=0;i<10;i++){
			araba a1=new araba(r[i]);
			eklenen.push(a1);
			
		}
	}
	
	public static void queue_yazdir(Queue<araba> yazilan){
		
		for(Iterator<araba> itr=yazilan.iterator();itr.hasNext();){
		
		araba yaz=itr.next();
		yaz.yazdir();
		}
		
	}
public static void stack_yazdir(Stack<araba> yazilan){
		
		for(Iterator<araba> itr=yazilan.iterator();itr.hasNext();){
		
		araba yaz=itr.next();
		yaz.yazdir();
		}
		
	}

public static ArrayList<Object> ekleme(){
	
	String[] renk = {"Kirmizi","Yesil","Mavi","Sari","Mor","Turuncu","Pembe","Gri","Siyah","Beyaz"};
	
	System.out.println();
	
	ArrayList<Object> katlar = new ArrayList<Object>();//kat container'i olustur
	
	//KatlarÄ± olustur.
	Queue<araba> kat1=new LinkedList<araba>();//Queue
	Queue<araba> kat4=new LinkedList<araba>();
	Queue<araba> kat7=new LinkedList<araba>();
	add_queue(renk, kat1);
	add_queue(renk, kat4);
	add_queue(renk, kat7);
	Stack<araba> kat2=new Stack<araba>();//Stack
	Stack<araba> kat5=new Stack<araba>();
	Stack<araba> kat8=new Stack<araba>();
	add_stack(renk, kat2);
	add_stack(renk, kat5);
	add_stack(renk, kat8);
	List kat3 =  new List(renk);//LinkedList
	List kat6 =  new List(renk);
	List kat9 =  new List(renk);
	
	
	//Katlar container'a ekleniyor.
	katlar.add(kat1);
	katlar.add(kat2);
	katlar.add(kat3);
	katlar.add(kat4);
	katlar.add(kat5);
	katlar.add(kat6);
	katlar.add(kat7);
	katlar.add(kat8);
	katlar.add(kat9);
	
	
	
	//Katlar yazdÄ±rÄ±lÄ±yor.
	//System.out.println("KAT 1");
    //queue_yazdir(kat1);
	//System.out.println();
	//System.out.println("KAT 2");
	//stack_yazdir(kat2);
	//System.out.println();
	//System.out.println("KAT 3");
	//kat3.display();
	//System.out.println();
	//System.out.println();
	
	//System.out.println("KAT 4");
	//queue_yazdir(kat4);
	//System.out.println();
	//System.out.println("KAT 5");
	//stack_yazdir(kat5);
	//System.out.println();
	//System.out.println("KAT 6");
	//kat6.display();
	//System.out.println();
	//System.out.println();
	
	//System.out.println("KAT 7");
	//queue_yazdir(kat7);
	//System.out.println();
	//System.out.println("KAT 8");
	//stack_yazdir(kat8);
	//System.out.println();
	//System.out.println("KAT 9");
	//kat9.display();

	return katlar;
	
	
}


public static void katlari_yazdir(ArrayList<Object> yazdýrýlan){
	
	
    System.out.println("KAT 1");
	queue_yazdir((Queue<araba>)yazdýrýlan.get(0));
	System.out.println();
	System.out.println("KAT 2");
	stack_yazdir((Stack<araba>)yazdýrýlan.get(1));
	System.out.println();
	System.out.println("KAT 3");
	List yazýcý=(List)yazdýrýlan.get(2);
	yazýcý.display();
	System.out.println();
	System.out.println();
	
	System.out.println("KAT 4");
	queue_yazdir((Queue<araba>)yazdýrýlan.get(3));
	System.out.println();
	System.out.println("KAT 5");
	stack_yazdir((Stack<araba>)yazdýrýlan.get(4));
	System.out.println();
	System.out.println("KAT 6");
	List yazýcý1=(List)yazdýrýlan.get(5);
	yazýcý1.display();
	System.out.println();
	System.out.println();
	
	System.out.println("KAT 7");
	queue_yazdir((Queue<araba>)yazdýrýlan.get(6));
	System.out.println();
	System.out.println("KAT 8");
	stack_yazdir((Stack<araba>)yazdýrýlan.get(7));
	System.out.println();
	System.out.println("KAT 9");
	List yazýcý2=(List)yazdýrýlan.get(8);
	yazýcý2.display();
	System.out.println();
	System.out.println();
}
}


