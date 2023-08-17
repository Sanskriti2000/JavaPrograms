package javaprogram;
import java.util.Scanner;

public class Employee {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name of the employee and basic salary");
		double basic,da,hra,pf,np,gp;
		String st;
		st=in.nextLine();
		basic=in.nextInt();
		da=basic*25/100;
		hra=basic*15/100;
		pf=basic*8.33/100;
		gp=basic+hra+da;
		np=gp-pf;
		System.out.println("Name of the Employee="+st);
		System.out.println("Gross Pay="+gp);
		System.out.println("Net Pay="+np);
	}
}
