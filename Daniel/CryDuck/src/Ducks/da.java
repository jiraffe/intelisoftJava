package Ducks;

public class da {

	public static void main(String[] args) {

		int[][] df = new int[10][8];
		for (int i = 0; i < df.length; i++) {
			for (int p = 0; p < df[i].length; p++) {
				df[i][p] = (int) (Math.random() * 44);
			}
		}
		start(df);
	}

	public static void start(int[][] x) {

		for (int[] qwe : x) {
			System.out.println();
			for (int h : qwe){
				System.out.print(h+" ");
				
			}
			}
			
		}

	}
