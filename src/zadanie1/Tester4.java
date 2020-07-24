package zadanie1;

import java.util.Iterator;

public class Tester4 {

	public static void main(String[] args) {
		
		
		//TWORZ� PRZYK�ADOWE ELEMENTY
		String s0 = "s0";
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s3";
		String s4 = "s4";
		String s5 = "s5";
		String s6 = "s6";
		String s7 = "s7";
		
		
		//TWORZ� LIST� I DODAJ� ELEMENTY
		MojaLista<String> ml = new MojaLista<String>();
		ml.add(s0);
		ml.add(s1);
		ml.add(s2);
		ml.add(s3);
		ml.add(s4);
		ml.add(s5);
		ml.add(s6);
		ml.add(30,s7);
		ml.add(31, s3);
		//ml.add(122,"setnynumer");
		//ml.add(123,"setnynumer");
		//ml.add(124,"setnynumer");
		
		//ITERACJA
		System.out.println("ITERACJA");
		Iterator<String> it0 = ml.iterator();
		
		while(it0.hasNext()) {
			System.out.println(it0.next());
		}
		
		
		// TEST METODY CONTAINS
		System.out.println("TEST METODY CONTAINS");
		System.out.println("czy zawiera " + ml.contains(s6)+"\n\n");
		System.out.println("nie zawiera " +ml.contains("tego tu nie ma")+"\n\n");
		
		// SPRAWDZAM LICZB� ELEMENT�W NA LI�CIE
		System.out.println("SPRAWDZAM LICZB� ELEMENT�W NA LI�CIE");
		System.out.println("Element�w: "+ml.size()+" d�ugo��: "+ ml.getDlugosc()+"\n\n" );
		
		//POWI�KSZAM LIST�
		System.out.println("POWI�KSZAM LIST�");
		ml.ensureCapacity(400);
		System.out.println("Element�w: "+ml.size()+" d�ugo��: "+ ml.getDlugosc() +"\n\n" );
		
		//DODAJ� ELEMENT
		System.out.println("DODAJ� ELEMENT"); 
		ml.add(s6);
		System.out.println("Element�w: "+ml.size()+" d�ugo��: "+ ml.getDlugosc()+"\n\n" );
		
		
		//DODAJ� ELEMENT POZA OBECN� D�UGO�� LISTY
		System.out.println("DODAJ� ELEMENT POZA OBECN� D�UGO�� LISTY");
		ml.add(4444, "nowy element");
		System.out.println("Element�w: "+ml.size()+" d�ugo��: "+ ml.getDlugosc()+"\n\n" );

		//POBIERAM ELEMENTY WG INDEKS�W
		System.out.println("POBIERAM ELEMENTY WG INDEKS�W");
		System.out.println(ml.get(1));
		System.out.println(ml.get(4));
		System.out.println(ml.get(4444)+"\n\n");
		
		//ZNAJDUJ� INDEKS ELEMENTU
		System.out.println("ZNAJDUJ� INDEKS ELEMENTU");
		System.out.println("indeks elementu s6 wynosi "+ml.indexOf(s6)+"\n\n");
		
		//KORZYSTAM Z METODY SET
		System.out.println("KORZYSTAM Z METODY SET");
		ml.set(4, "nowy obiekt na polu 4");
		System.out.println(ml.get(4)+"\n\n");
		
		//USUWAM OBIEKT Z LISTY
		System.out.println("USUWAM OBIEKT Z LISTY");
		ml.remove(4);
		System.out.println(ml.get(4)+"\n\n");

		//CZYSZCZ� LIST�
		System.out.println("CZYSZCZ� LIST�");
		ml.clear();
		System.out.println("Element�w: "+ml.size()+" d�ugo��: "+ ml.getDlugosc()+"\n\n" );

		
		
		
	}
	
	
}
