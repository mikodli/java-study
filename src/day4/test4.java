package day4;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student student1 = new Student();
			student1.name = "ÃªÁöÇÇÆ¼";
			student1.korean = 99;
			student1.english = 95;
			student1.math = 96;
			
			Student.studentCount++;
			
			Student student2 = new Student();
			student2.name = "Á¦¹Ì³ªÀÌ";
			student2.korean = 88;
			student2.english = 85;
			student2.math = 86;
			
			Student.studentCount++;
			
			System.out.println("ÀÌ¸§ : " + student1.name);
			System.out.println("ÃÑÁ¡ : " + student1.getTotal());
			System.out.println("Æò±Õ : " + student1.getAverage());
			
			System.out.println("ÀÌ¸§ : " + student2.name);
			System.out.println("ÃÑÁ¡ : " + student2.getTotal());
			System.out.println("Æò±Õ : " + student2.getAverage());
		
	}

}
