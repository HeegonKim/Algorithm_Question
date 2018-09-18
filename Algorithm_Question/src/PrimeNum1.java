import java.util.ArrayList;

/*
 * 방법 1
 * 
 * @소수는 n의 배수가 아니어야 한다.
 * @입력받은 수를 입력받은 수보다 작은 수 들로 나누어서 떨어지면 소수가 아니다.
 */

public class PrimeNum1 {
	public static void getPrime(int num, ArrayList<Integer> prime) {
		prime.add(2);
		for (int i = 2; i <= num; i++) {
			for (int j = 0; prime.size() > j; j++) {
				if (i % prime.get(j) == 0)
					break; // 소수가 아닌 경우 pass
				if (j + 1 == prime.size()) // 소수일 때
					prime.add(i);
			}
		}

		for (Integer result : prime) {
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> prime = new ArrayList<Integer>();
		long start = System.currentTimeMillis();
		getPrime(30000, prime);
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : " + (end - start));
	}
}
