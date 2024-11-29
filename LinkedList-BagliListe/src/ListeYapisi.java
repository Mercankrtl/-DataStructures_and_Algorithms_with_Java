import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class ListeYapisi {

	Node head= null; //Node head: Bağlı listenin başlangıcını işaret eder.
	Node tail= null;  //Node tail: Bağlı listenin sonunu işaret eder.
	
	void ekle(int x )
	{
		Node eleman = new Node(); //eklenecek olan dugum
		eleman.data =x;
		eleman.next=null;
		
		if( head == null)
		{
			head =eleman ;
			tail =eleman;
			//Başlangıçta hem head hem de tail null olarak ayarlanır çünkü liste boştur.

			System.out.println("Liste olusturuldu ve ilk dugum (obje )eklendi.");
		}
		else {
			tail.next=eleman;
			tail=eleman;       //tail (son dugumu ) guncelledim
			System.out.println("Listenin sonuna yeni bir eleman eklendi");
		}
	}
	
	void yazdir() {
		if(head == null)
		{
			System.out.println("Liste yapisi bos!!!");
		}
		else {
			Node temp=head;
			System.out.println("bas -> ");
			while(temp !=null) {
				System.out.println(temp.data + "-> ");
				
				temp =temp.next;
			}
			System.out.println(" son .");
		}
		
	}
	
}
