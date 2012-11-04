
public class balon {

	public static void main(String[] args) {
		
		List linked =  new List();
		
		String[] renk = {"Kırmızı","Yeşil","Mavi","Sarı","Mor","Turuncu","Pembe","Gri","Siyah","Beyaz"};
		
		int i;
		for(i=0; i<10;i++)
		{
			linked.ekle(renk[i]);
		}
		
		linked.display();
		
	}
}
