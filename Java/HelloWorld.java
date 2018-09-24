class HelloWorld {
	public static void main(String[] args) {
		System.out.print("Hello, World!\n");
		sayHello("Tom");
		Methods.sayGoodBye();
	}

	public static void sayHello(String name) {
		System.out.printf("Hello, %s!\n", name);
	}
}