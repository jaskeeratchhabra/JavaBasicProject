package Unit_02;
import java.util.Scanner;
class p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner obj=new Scanner(System.in);
     Students arr[]=new Students[6];
     for(int i=0;i<6;i++)
     {
    	 String s=obj.next();
    	 int a1=obj.nextInt();
    	 char sec=obj.next().charAt(0);
    	 float f=obj.nextFloat();
    	 arr[i]=new Students(s,a1,sec,f);
     }
     float avg=arr[0].percentage+arr[1].percentage+arr[2].percentage+arr[3].percentage+arr[4].percentage+arr[5].percentage;
     avg/=6;
     System.out.println("avg percentage is "+avg);
	}

}
class Students
{
	String name;
	int age;
	char section;
	float percentage;
	Students(String s,int a,char sec,float p)
	{
		name=s;
		age=a;
		section=sec;
		percentage=p;
	}
	
}
