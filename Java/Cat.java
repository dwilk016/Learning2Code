class Cat {
	private String name;
	private String color;
	private int age;

	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public int getAge() {
		return this.age;
	}

	public void introductions() {
		System.out.format("%s: Hello, name name is %s. I am %d years old, and I am %s.", name, name, age, color);
	}

	public void talk() {
		System.out.println(name + ": meow!");
	}
}