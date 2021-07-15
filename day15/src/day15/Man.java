package day15;


class Man
{
	private String name;
	private int age;
	
	public Man(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString()
	{
		return "name:"+name+", age:"+age;
	}
}