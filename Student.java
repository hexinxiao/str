package Xin;

public class Student extends Person{
	public Student(int number,String name,String sex) {
		this.number = number;
		this.name = name;
		this.sex = sex;
	}	
   public String toString() {
	   return "学生信息：" +"  姓名：" + name + "  学号：" + number + "  性别：" + sex ;
	}	
}
