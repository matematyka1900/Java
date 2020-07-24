package zadanie1;

import java.util.Iterator;

public class MojaLista<T> implements Iterable<T> {

private int obecny=0;
private int dlugosc;
private int ileElementow;
Object[] tab;


public MojaLista() {
tab = new Object[20];	
dlugosc = getDlugosc();
ileElementow = 0;
}	


	
	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>() {

			int biezacy = 0;
			
			@Override
			public boolean hasNext() {
				if(biezacy<getDlugosc()) {
					return true;
				} else {
					return false;
				}
			}

			@SuppressWarnings("unchecked")
			@Override
			public T next() {
				Object obj1 = tab[biezacy];
				biezacy++;
				return (T) obj1;
			}
			
			public void remove() {
				tab[biezacy] = null;
				biezacy++;
				ileElementow--;
			}
			
		};
	}

	
	public boolean add(int index, T element) {
		while (index > getDlugosc()-1) {
			rozszerzTablice(-1);
		}
		
		tab[index] = element;
		ileElementow++;
		//System.out.println("Zapisane---"+index);
		return true;
	}
	
	public boolean add(T element) {
		while (obecny > getDlugosc()-1) {
			rozszerzTablice(-1);
		}
		tab[obecny] = element;
		obecny = obecny +1;
		ileElementow++;
		//System.out.println("Zapisano!" + obecny);
		return true;
	}
	
	public void rozszerzTablice(int nowyrozmiar) {
		if(nowyrozmiar == -1) {
			nowyrozmiar = dlugosc * 2;
		}
		
		if(nowyrozmiar>getDlugosc()) {
		Object[] nowatablica = new Object[nowyrozmiar];
		Iterator<T> iter0 = iterator();
		int indeksnowy = 0;
		while(iter0.hasNext()) {
			nowatablica[indeksnowy++] = iter0.next();
		}
		tab = nowatablica;
		dlugosc = tab.length;
		}
		
	}
	
	public void clear() {
		Iterator<T> iter1 = iterator();
		
		while(iter1.hasNext()) {
			iter1.remove();
		}
		obecny = 0;
		ileElementow = 0;
		
	}
	
	public boolean contains(T o) {
		boolean czyZawiera = false;
		Iterator<T> iter1 = iterator();
		
		while(iter1.hasNext()) {
			T t1 = iter1.next();
			if(o.equals(t1)) {
				czyZawiera = true;
			}
		}
		
		
		return czyZawiera;
	}
	
	public void ensureCapacity(int minCapacity) {
		rozszerzTablice(minCapacity);
	}
	
	public Object get(int index) {
		return tab[index];
	}
	
	public int indexOf(T o) {
		int indeks1 = -1;
		int k = 0;
		Iterator<T> iter1 = iterator();
		
		while(iter1.hasNext()) {
			T t1 = iter1.next();
			if(t1.equals(o)) {
				indeks1 = k;
				break;
			}
			k++;
		}

		return indeks1;
	}
	
	public T set(int index, T element) {
		T staryelement = null;
		if(index<getDlugosc() && index>-1) {
		@SuppressWarnings("unchecked")
		T staryelement0 = (T) tab[index];
		staryelement = staryelement0;
		} else {
			ensureCapacity(index+2);
		}
		
		tab[index] = element;
		return staryelement;
	}
	
	public boolean remove(int index) {
		boolean czySkasowano = false;
		if(index<getDlugosc() && index>-1) {
			tab[index] = null;
			czySkasowano = true;
			ileElementow--;
		}
		return czySkasowano;
	}
	
	public int getDlugosc(){
		dlugosc = tab.length;
		return dlugosc;
	}
	
	public int size() {
		return ileElementow;
	}



	public int getObecny() {
		return obecny;
	}



	public void setObecny(int obecny) {
		this.obecny = obecny;
	}



	public int getIleElementow() {
		return ileElementow;
	}



	public void setIleElementow(int ileElementow) {
		this.ileElementow = ileElementow;
	}



	public Object[] getTab() {
		return tab;
	}



	public void setTab(Object[] tab) {
		this.tab = tab;
	}



	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
	}
	
	
	
}
