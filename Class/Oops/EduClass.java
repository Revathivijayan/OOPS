package Class.Oops;

public class EduClass {
	
	public void stuName() {
		System.out.println("stu name");
		
	}
	public void stuDob() {
		System.out.println("24/05/2010");
	}
	
	public void stuPercentage() {
		System.out.println("90%");
	}

	public void stuAdd() {
		System.out.println("1 st street chennai");
	}
    public static void main(String[] args) {
		EduClass stu=new EduClass();
		stu.stuName();
		stu.stuDob();
		stu.stuPercentage();
		stu.stuAdd();
	} 

}
