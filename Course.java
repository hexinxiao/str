package Xin;

public class Course {
	String coursename;
	String address;
	String time;
	int xuehao;
	int score;
	public Course(String coursename,String address,String time,int xuehao,int score) {
		this.coursename=coursename;
		this.address=address;
		this.time=time;
		this.xuehao=xuehao;
		this.score=score;	
	}
	String getcoursename() {
		return coursename;
	}
	String getaddress() {
		return address;
	}
	String gettime() {
		return time;
	}
	int getscore() {
		return score;
	}
	int xuehao() {
		return xuehao;
	}
	public String toString() {
		   return  "课程名称："+coursename+"  地址："+address+"  时间："+time+"  学号："+xuehao+"  成绩："+score;
		}	
}
