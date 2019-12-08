package Xin;

public class TestPerson{
	public static void main(String[] args) {
		Teacher a,b;
		Course c,d;
		Student x;
		System.out.println("学生选课系统");
		System.out.println("选课成功");
		x = new Student(111111,"小明","男");
		System.out.println(x);
		a = new Teacher("张老师","男",333);
		a.setCourse(new Course("物理","111","8：00am--10:00am",123456,80));
		b= new Teacher("王老师","男",123);
		b.setCourse(new Course("近代史","122","13:00pm--15:00pm",222223,80));
		c=a.getCourse();
		d=b.getCourse();
		System.out.println("成功添加课程");
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		System.out.println(d);
		System.out.println("学生选课系统");
		System.out.println("选课成功!");
		System.out.println(x);
		System.out.println(b);
		System.out.println(d);
	}
}
	