
public class Uygulama {

	public static void main(String[] args) {
		TekYonluListeYapisi tylist = new TekYonluListeYapisi();
		
		tylist.basaEkle(11);
		tylist.basaEkle(3);
		tylist.basaEkle(71);
		tylist.sonaEkle(68);
		tylist.sonaEkle(42);
		tylist.sonaEkle(95);
		
		tylist.yazdir();

	}

}
