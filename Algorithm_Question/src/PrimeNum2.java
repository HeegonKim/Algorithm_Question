import java.util.ArrayList;

/*
 * BestMethod
 * 
 * @소수는 n의 배수가 아니어야 한다.
 * @입력받은 수를 입력받은 수보다 작은 수 들로 나누어서 떨어지면 소수가 아니다.
 * @@@그러나 모두 나누어볼 필요없이, [루트 n]까지만 나누어서 떨어지면 소수가 아니다.
 */

public class PrimeNum2 {
	public static void getPrime(int num) {
		int[] arr = new int[num + 1];
		int count = 0;

		for (int i = 2; i <= num; i++) { // 배열 초기화
			arr[i] = i;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {	//루트 n
			if (arr[i] == 0) // 이미 체크된 수의 배수는 확인X
				continue;
			for (int j = i + i; j <= num; j += i) { // i를 제외한 i의 배수들은 0으로 체크
				arr[j] = 0;
			}
		}

		for (int i = 2; i <= num; i++) {	//출력
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
				count++;
				
				if (count % 20 == 0)	//소수 20개 출력 후 줄바꿈
					System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		getPrime(30000);
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time : " + (end - start));
	}

}
