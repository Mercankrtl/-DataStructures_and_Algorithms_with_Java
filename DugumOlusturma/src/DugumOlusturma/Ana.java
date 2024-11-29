package DugumOlusturma;

public class Ana {

	public static void main(String[] args) {
		
		Sinif A =new Sinif(); //Bellekte dugum olusturduk
		Sinif B =new Sinif();
		Sinif C =new Sinif();

		A.sayi=11; //Dugumlere degerlerini atiyoruz
		B.sayi=22;
		C.sayi=33;

		A.next =B;  //Dugumleri birbirine bagladik
		B.next=C;
		C.next=null;
		
		Sinif temp=A;
		
		while (temp != null )  //dugumlerin uzerinde dolastik
		{
			System.out.println(temp.sayi);
			temp= temp.next;
		
		}
		
		
	}

}
