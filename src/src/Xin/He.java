package Xin;

public class He {
public void A(String string) {
	int x=0;
	int y=7;
	int p=7;
	int q=14;
	int m;
	String a[]=new String[34];
	for(int i=0;i<34;i=i+2) {
		a[i]=string.substring(x,y);
		m=i+1;
		a[m]=string.substring(p,q);
		System.out.println(a[i]+","+a[m]+"。"+"\n");
		x=x+14;
		y=y+14;
		p=p+14;
		q=q+14;
	}
			
}
}
