package bmi;

public class BmiEx {

	public static void main(String[] args) {
		// 키 1.6m 몸무게 55kg
		// 몸무게/(키*키)
		double height = 1.6;
		int weight = 55;
		
		//새로운 추가1
		//새로운 추가2
		double bmi = weight / (height * height);

		System.out.println("환영합니다.");
		System.out.println("당신의 BMI는 " + bmi + "입니다.");
		System.out.printf("당신의 BMI는 %.2f입니다.", bmi);
		
		System.out.println("집에서 수정");
		System.out.println("학원에서 수정");
		System.out.println("학원충돌");


	}

}
