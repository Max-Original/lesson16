package javacore16practise;

import java.io.Serializable;

public class Person implements Serializable{
	
	public String name;
	public int age;
	private double weiht;
	private String lastName = "Cat";
	
	public Person() {
		super();
	}
	public Person(String name, int age, double weiht, String lastName) {
		super();
		this.name = name;
		this.age = age;
		this.weiht = weiht;
		this.lastName = lastName;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeiht() {
		return weiht;
	}
	public void setWeiht(double weiht) {
		this.weiht = weiht;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weiht);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weiht) != Double.doubleToLongBits(other.weiht))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weiht=" + weiht + ", lastName=" + lastName + "]";
	}
}
