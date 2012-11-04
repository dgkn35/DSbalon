import java.io.*;
import java.util.*;


public class balon {

	public static void main(String[] args) {
		
		List kat3 =  new List();
		List kat6 =  new List();
		List kat9 =  new List();
		
		String[] renk = {"Kirmizi","Yesil","Mavi","Sari","Mor","Turuncu","Pembe","Gri","Siyah","Beyaz"};
		
		kat3.ekle(renk);
		kat6.ekle(renk);
		kat9.ekle(renk);
		
		Stack<araba> kat2=new Stack<araba>();
		Stack<araba> kat5=new Stack<araba>();
		Stack<araba> kat8=new Stack<araba>();
		
		add_stack(renk,kat2);
		add_stack(renk,kat5);
        add_stack(renk,kat8);
		
	
		
		Queue<araba> kat1=new LinkedList<araba>();
		Queue<araba> kat4=new LinkedList<araba>();
		Queue<araba> kat7=new LinkedList<araba>();
		
		add_queue(renk,kat1);
		add_queue(renk,kat4);
		add_queue(renk,kat7);
		
		System.out.println("KAT 1");
        queue_yazdir(kat1);
		System.out.println();
		System.out.println("KAT 2");
		stack_yazdir(kat2);
		System.out.println();
		System.out.println("KAT 3");
		kat3.display();
		System.out.println();
		System.out.println();
		
		System.out.println("KAT 4");
		queue_yazdir(kat4);
		System.out.println();
		System.out.println("KAT 5");
		stack_yazdir(kat5);
		System.out.println();
		System.out.println("KAT 6");
		kat6.display();
		System.out.println();
		System.out.println();
		
		System.out.println("KAT 7");
		queue_yazdir(kat7);
		System.out.println();
		System.out.println("KAT 8");
		stack_yazdir(kat8);
		System.out.println();
		System.out.println("KAT 9");
		kat9.display();
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
}
