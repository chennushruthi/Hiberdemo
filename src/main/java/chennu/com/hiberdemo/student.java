package chennu.com.hiberdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class student {
     @Id
     private int Id;
     private String name;
     private int marks;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [Id=" + Id + ", name=" + name + ", marks=" + marks + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getMarks()=" + getMarks() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
