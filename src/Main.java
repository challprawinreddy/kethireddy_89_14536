import java.lang.*;
import java.util.Date;

public class Main{



	public static void main(String[] args) {

        Student a = new Student(36, "Rakesh Reddy", new Date(), 70);
        Student b = new Student(55, "Pandian Tevar", new Date(), 50);
        Student c = new Student(13, "Umakanth Reddy", new Date(), 60);

	    StudentGroup test = new StudentGroup(3);

        test.setStudent(a,0);
        test.setStudent(b,1);
        test.setStudent(c,2);


        System.out.println("OK");

        ShowUser(test.getStudent(0));
        ShowUser(test.getStudent(1));
        ShowUser(test.getStudent(2));









		//You may test that your code works find here
		//Please check that sfdfsdfsdfyour code works and has no
		//compilation problems before to submit
	}


	public static void ShowUser(Student foo){

	System.out.println("\n\n--------------");
	System.out.println("ID: " + foo.getId());
	System.out.println("Name: " + foo.getFullName());
	System.out.println("Birth Date: " + foo.getBirthDate().toString());
	System.out.println("Avg Mark: " + foo.getAvgMark());
	System.out.println("\n\n--------------");
	}


}
