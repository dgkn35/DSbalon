

public class List {
	public araba ilk;
	public araba temp;
	
	
	
	public List(String[] renk)
	{
		ilk=null;
		this.ekle(renk);
	}
	
	public Boolean bosmu()
	{
		return ilk==null;
	}
	
	public void ekle(String[] renk)
	{
		int i;
		
		for(i=0; i<10;i++)
		{
			araba node=new araba(renk[i]);
			node.next=this.ilk;
			this.ilk=node;
			
		}
		araba current = ilk ;
		
		while(current.sonrakiAl() != null)
		{
			current=current.sonrakiAl();
		}
		current.next = ilk;
		
	}
	
	public void display()
	{
		araba temp=ilk;
		do
		{
			temp.yazdir();
			temp=temp.sonrakiAl();
		}while(temp != ilk);
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
