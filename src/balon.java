import java.util.Stack;
import java.io.*;
import java.util.*;


public class balon {

	public static void main(String[] args) {
		
		List linked1 = new List();
		List linked2 = new List();
		List linked3 = new List();
		Stack<araba> stack1 = new Stack<araba>();
		Stack<araba> stack2 = new Stack<araba>();
		Stack<araba> stack3 = new Stack<araba>();
		Queue<araba> queue = new LinkedList<araba>();
		Queue<araba> queue2 = new LinkedList<araba>();
		Queue<araba> queue3= new LinkedList<araba>();
		
		String[] renk = {"Kýrmýzý","Yesil","Mavi","Sarý","Mor","Turuncu","Pembe","Gri","Siyah","Beyaz"};
		
		
		linked1.ekle(renk);
		
		stackEkle(stack1,renk);
		stackEkle(stack2,renk);
		stackEkle(stack3,renk);
		linked1.display();
		
	}
	
	static void stackEkle(Stack<araba> stack, String[] renk)
	{
		for(int i=0;i<10;i++)
		{
			araba a = new araba(renk[i]);
			stack.push(a);
		}
	}	
}
