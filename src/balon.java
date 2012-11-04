import java.io.*;
import java.util.*;


public class balon {

	public static void main(String[] args) {
		
		List linked =  new List();
		
		String[] renk = {"Kirmizi","Yesil","Mavi","Sari","Mor","Turuncu","Pembe","Gri","Siyah","Beyaz"};
		
		linked.ekle(renk);
		linked.display();
		System.out.println();
		
		
		Stack<araba> kat2=new Stack<araba>();
		Stack<araba> kat5=new Stack<araba>();
		Stack<araba> kat8=new Stack<araba>();
		add_stack(renk,kat2);
		stack_yazdir(kat2);
		System.out.println();
		add_stack(renk,kat5);
		stack_yazdir(kat2);
		System.out.println();
		add_stack(renk,kat8);
		stack_yazdir(kat2);
		System.out.println();
		
		Queue<araba> kat1=new LinkedList<araba>();
		Queue<araba> kat4=new LinkedList<araba>();
		Queue<araba> kat7=new LinkedList<araba>();
		add_queue(renk,kat1);
		queue_yazdir(kat1);
		System.out.println();
		add_queue(renk,kat7);
		queue_yazdir(kat1);
		System.out.println();
		queue_yazdir(kat4);
		System.out.println();
		queue_yazdir(kat7);
		
		
		
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
			eklenen.add(a1);
			
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
