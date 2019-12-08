package Xin;

public class Teacher extends Person {
	Course y;
	public Teacher(String name,String sex,int number) {
		this.name=name;
		this.sex=sex;
		this.number=number;
	}
	public Course getCourse() {
		return y;
		}
	public void setCourse(Course z) {
		y=z;
	}
	public String toString() {
		   return "  教师姓名：" + name +"  编号：" + number + "  性别：" + sex ;
		}	
}

