
public class MagicSquare {
	public static final int MAXLINE = 7;		//7*7 마방진

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[MAXLINE][MAXLINE];
		int row = MAXLINE / 2;	//가로
		int col = 0;	//세로
		int num = 1;	//테이블에 찍히는 수

		while (num <= MAXLINE * MAXLINE) {
			table[col][row] = num;
			
			if (num % MAXLINE == 0) {
				col++;
			} else {
				col--;
				row++;
			}
			
			if (col < 0) {
				col = MAXLINE - 1;
			}
			
			if (row == MAXLINE) {
				row = 0;
			}
			num++;
		}

		for (int i = 0; i < MAXLINE; i++) {
			for (int j = 0; j < MAXLINE; j++) {
				System.out.printf("%4d", table[i][j]);
			}
			System.out.println();
		}
	}

}
