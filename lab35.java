import java.util.Scanner;

class Student1 {
	String name;
	String stu_id;
	int score;
	public Student1() {
		this(" ", " ", 0);
	}
	public Student1(String initName, String initId, int initScore) {
		name = initName;
		stu_id = initId;
		score = initScore;
	}
}

public class lab35 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name, ID, Score:");
		Student1 stu = new Student1();
		
		Student1 min = new Student1(" ", " ", 100);
		for (int i = 0; i < n; i ++) {
			stu.name = in.next();
			stu.stu_id = in.next();
			stu.score = in.nextInt();
			
			if (min.score > stu.score) {
				min.name = stu.name;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
		}
		System.out.println("name, ID of the lowest score:");
		
		System.out.println(min.name + " " + min.stu_id);
		in.close();
	}
}
