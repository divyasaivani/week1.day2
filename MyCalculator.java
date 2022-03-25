package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		int ans1 = obj.add(2, 8, 3);
		int ans2 = obj.sub(42, 4);
		double ans3 = obj.mul(119d , 2d);
		float ans4= obj.divide(71.1f,13.3f);
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
	}

}
