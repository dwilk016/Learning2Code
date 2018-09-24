class Rental{
	public static void main(String[] args){
		Book a = new Book(543798234, "Alpha", "David Wilkinson", "Cluster House");

		Book[] shelf_1 = new Book[10];

		for(int i = 0; i < shelf_1.length; i++){
			shelf_1[i] = new Book(234*i, "book" + i, "David Masters", "Cluster House");
			shelf_1[i].printBook();
		}

		a.printBook();
	}

}