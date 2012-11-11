import java.util.*;

public class balon {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		

		int secim;
		Scanner in = new Scanner(System.in); 
		System.out.println("Balon problemi icin gerekli n degerini giriniz:");
		int n= in.nextInt();

		ArrayList<Object> otopark = new ArrayList<Object>();
		
		do{
			secim=menu();
			switch (secim) {
				case 1:
				{
					
					otopark=ekleme();
					katlari_yazdir(otopark);
					break;
				}
				
				case 2:
				{
					cikar(n, otopark, true);
					break;
				}
				
				case 3:
				{
					islem_zaman(n);
					break;
				}
			}
			
		}while(secim!=4);
	}
	
	@SuppressWarnings("resource")
	public static int menu(){
		int secim;
		

		System.out.println("1) Tum katlarin listesi");
		System.out.println("2) Otopark problemi");
		System.out.println("3) 3 saniyede n adet ortalama otopark probleminin cozumu");
		System.out.println("4) Cikis:");
		System.out.println();
		System.out.println("Seciminizi giriniz:");
		Scanner in = new Scanner(System.in); 
		secim=in.nextInt();

		
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
	
	//Katları olustur.
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

	return katlar;

}

	@SuppressWarnings("unchecked")
	public static void cikar(int n,ArrayList<Object> otopark,Boolean print){
		int kat;
		int[] dolu = {1,1,1,1,1,1,1,1,1};
		Boolean flag = false;
		String cikan = null;
		Random rastgele = new Random();
		Queue<araba> queue;
		Stack<araba> stack;
		List liste;
		
		while(!flag)
		{
			kat=rastgele.nextInt(9);
			

			switch (kat%3) {
			case 0:
				queue = (Queue<araba>)otopark.get(kat);
				if(queue != null){

					if (queue.isEmpty())
						dolu[kat]=0;
					else {cikan = queue.peek().renk;
					queue.poll();
					if(print)
						cikani_yaz(cikan, otopark);
					}
				}
				break;
			case 1:
				stack = (Stack<araba>)otopark.get(kat);
				if(stack!= null){

					if (stack.isEmpty())
						dolu[kat]=0;
					else {					
						cikan = stack.peek().renk;
						stack.pop();
						if(print)
							cikani_yaz(cikan, otopark);
						
					}

				}
				break;
			case 2:
				liste = (List)otopark.get(kat);
				if(liste!= null){
					if(!liste.bosmu()){
						liste.dolas(n);
						cikan = liste.cikart();
						if(liste.bosmu()){
							dolu[kat]=0;
						}
						if(print)
							cikani_yaz(cikan, otopark);
					}
					break;
				}
			}
			int top=0;
			for(int i = 0; i < dolu.length;i++)
			{
				top += dolu[i];
			}
			if (top == 0)
				flag = true;
			
		}

	}
	
	public static void cikani_yaz(String cikan,ArrayList<Object> otopark){
		if (cikan !=null){
			System.out.println(cikan);
			katlari_yazdir(otopark);
		}
	}
 @SuppressWarnings("unchecked")
public static void katlari_yazdir(ArrayList<Object> yazdirilan){
	
	
    System.out.println("KAT 1");
	queue_yazdir((Queue<araba>)yazdirilan.get(0));
	System.out.println();
	System.out.println("KAT 2");
	stack_yazdir((Stack<araba>)yazdirilan.get(1));
	System.out.println();
	System.out.println("KAT 3");
	List yazici=(List)yazdirilan.get(2);
	yazici.display();
	System.out.println();
	System.out.println();
	
	System.out.println("KAT 4");
	queue_yazdir((Queue<araba>)yazdirilan.get(3));
	System.out.println();
	System.out.println("KAT 5");
	stack_yazdir((Stack<araba>)yazdirilan.get(4));
	System.out.println();
	System.out.println("KAT 6");
	List yazici1=(List)yazdirilan.get(5);
	yazici1.display();
	System.out.println();
	System.out.println();
	
	System.out.println("KAT 7");
	queue_yazdir((Queue<araba>)yazdirilan.get(6));
	System.out.println();
	System.out.println("KAT 8");
	stack_yazdir((Stack<araba>)yazdirilan.get(7));
	System.out.println();
	System.out.println("KAT 9");
	List yazici2=(List)yazdirilan.get(8);
	yazici2.display();
	System.out.println();
	System.out.println();
}

public static void islem_zaman(int n){
	
	ArrayList<Object> otopark = new ArrayList<Object>();
	long sayac=0;
	long start,stop, islemZamani;
	start = System.currentTimeMillis();
	do{
		otopark = ekleme();
		cikar(n, otopark, false);
		sayac++;
		stop = System.currentTimeMillis();
		islemZamani = stop - start;
	}while(islemZamani<=1);
	
	System.out.println(islemZamani);
	System.out.println(sayac);
	
	//if(islemZamani == 0)
	//	System.out.println("Islem 1 ms'den kısa sürede tamamlandı. " +
	//			"Kac islem yapılabilecegi hesaplanamıyor.");
	//else
	System.out.println("3 sn'de yapilabilecek islem sayisi :" + 3000/(float)(islemZamani/sayac));
	}
}


