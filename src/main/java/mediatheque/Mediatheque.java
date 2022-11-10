package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private List<Item> items = new LinkedList<Item>();

	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		
		mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
		mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
		mediatheque.addItem( new CD(12, "Sergeant Peppers"));
		mediatheque.printCatalog();
		mediatheque.printOnlyBooks();
		mediatheque.printOnlyCDs();		
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			System.out.println(i);
	}
	
	public void printOnlyBooks() {
		BookPrinter bP = new BookPrinter();
                System.out.println("on affiche les livres");
                for (Item i : items){
                    i.accept(bP);
                }
	}

	public void printOnlyCDs() {
		CDPrinter cdP = new CDPrinter();
                System.out.println("on affiche les CD");
                for (Item i : items){
                    i.accept(cdP);
                }
	}

}
