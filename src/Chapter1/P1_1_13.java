package Chapter1;

public class P1_1_13 {
	public static void main(String[] args) {
		int m=5,n=5;
		int[][] a = new int[m][n];
		int[][] b = new int[n][m];
		System.out.println("b is:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				b[i][j]=j;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("a is:");
		for(int i=0;i<a.length;i++){
			for(int j = m-1;j >= 0; j--){
				a[i][j]=j;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("new a is:");
		transposition(a,b);
	}

	private static void transposition(int[][] a, int[][] b) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j] = b[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
