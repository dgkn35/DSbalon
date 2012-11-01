
public class List {
	public araba ilk;
	
	public List()
	{
		ilk=null;
	}
	
	public Boolean bosmu()
	{
		return ilk==null;
	}
	
	public void ekle(String renk)
	{
		araba node=new araba(renk);
		node.next=this.ilk;
		this.ilk=node;
		if(node.next==null)
		{
			node.next=ilk;
		}
		
	}
	
	public void display()
	{
		araba temp=ilk;
		while(temp.sonrakiAl() != ilk)
		{
			temp.yazdir();
			temp=temp.sonrakiAl();
		}
	}
	
	
}
