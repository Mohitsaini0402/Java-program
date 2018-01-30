package Methods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Demo1 {
public int getdata(int m1,int m2,int m3)
{
	int res=m1+m2+m3;
	return res;
}
void details(String name,int rollno)
{
	System.out.println("student name:"+name);
	System.out.println("rollno:"+rollno);
	
}
void persent(float res)
{
	float avg=res/300*100;
	System.out.println("pesentage is"+avg);
}
public static void main(String[] args) throws IOException {
	
	Demo1 obj=new Demo1();
	
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	
	System.out.println("enter name and rollno");
	String name=br.readLine();
	int rollno=Integer.parseInt(br.readLine());
	obj.details(name,rollno);
	System.out.println("enter markas in three subject");
	int m1=Integer.parseInt(br.readLine());
	int m2=Integer.parseInt(br.readLine());
	int m3=Integer.parseInt(br.readLine());
	int var=obj.getdata(m1, m2, m3);
	System.out.println("total number are:"+var);
	//int avg=Integer.parseInt(br.readLine());
	obj.persent(var);
}
}


