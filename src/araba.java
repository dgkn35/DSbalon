
public class araba {
	public String renk;
	public araba next;
	
	
	public araba(String renk)
	{
		this.renk=renk;
	}
	
	public void yazdir()
	{
		System.out.println(renk);
	}
	
	public araba sonrakiAl()
	{	
		return this.next;
	}
	
	
	
}
