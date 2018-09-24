class Test {
	public static void main(String[] args) {
		sayHello();
		Cat cat1 = new Cat("Frank", "Red", 5);
		Cat cat2 = new Cat("Bob", "Grey", 3);

		cat1.talk();
		cat2.talk();

		cat2.setName("Skeeter");
		cat2.introductions();
	}

	private static void sayHello() {
		System.out.print("Mike: Hello.\n");
	}
}