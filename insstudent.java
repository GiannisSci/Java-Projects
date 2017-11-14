import java.*;
import java.util.Scanner;

public class insstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Type 1 if you are sudent or Type 2 if you are teacher??");
		Scanner lv = new Scanner(System.in);
		int lvl=lv.nextInt();		
		
		if(lvl==1) {
		
		
		int i=0;
		System.out.println("How many times??");
		Scanner loop = new Scanner(System.in);
		int lp=loop.nextInt();
		
		
		while (i<lp) {
		
		
		System.out.println("Give name");
		Scanner nm = new Scanner(System.in);
		String name1=nm.next();
		
		System.out.println("Give surname");
		Scanner ln = new Scanner(System.in);
		String last1 =ln.next();
		
		System.out.println("Give age");
		Scanner age = new Scanner(System.in);
		int ag=age.nextInt();
		
		SecClass st1 = new SecClass();
		st1.setName(name1);
		st1.setSurname(last1);
		st1.setAge(ag);
		
		i++;
		
		}
		}else
		{
			
			int i=0;
			System.out.println("How many times??");
			Scanner loop = new Scanner(System.in);
			int lp=loop.nextInt();
			
			
			while (i<lp) {
			
			
			System.out.println("Give name");
			Scanner nm = new Scanner(System.in);
			String name1=nm.next();
			
			System.out.println("Give surname");
			Scanner ln = new Scanner(System.in);
			String last1 =ln.next();
			
			System.out.println("Give age");
			Scanner age = new Scanner(System.in);
			int ag=age.nextInt();
			
			teacherClass st1 = new teacherClass();
			st1.setName(name1);
			st1.setSurname(last1);
			st1.setAge(ag);
			st1.setLevel(lvl);
			
			
			i++;
			
			
			
			
			
		}

		

	}

}
	
}
