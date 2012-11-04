
public class List {
	public araba ilk;
	public araba temp;
	
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
	
	public void dolas(int n)
	{
		int count=1;
		while(ilk.next!=ilk && count!=n)
		{
			count++;
			temp=temp.next;
		}
	}
	
	public void cikart()
	{
		if(!bosmu())
		{
			if(temp.next!=ilk)
				ilk=ilk.next;
			
			temp.yazdir();
			temp.next=temp.next.next;
		}
	}
	
}
