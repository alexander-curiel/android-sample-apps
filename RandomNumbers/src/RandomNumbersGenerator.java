import java.util.Random;

public class RandomNumbersGenerator {

	public RandomNumbersGenerator() {

	}

	public int GenerateRandomNumber(Random r) {
		int Low = -3;
		int High = 3;
		return r.nextInt(High - (Low - 1)) + Low;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		RandomNumbersGenerator number = new RandomNumbersGenerator();
		for (int i = 0; i <= 50; i++) {
			System.out.println("Number is " + number.GenerateRandomNumber(r)
					+ "\n");
		}
	}

}
