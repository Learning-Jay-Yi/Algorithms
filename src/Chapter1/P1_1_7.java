package Chapter1;

public class P1_1_7 {

	public static void main(String[] args) {
		//questionA();
		questionB();
				
	}


	private static void questionB() {
		int sum = 0;
		for (int i =0; i<1000; i++)
			for(int j=0;j<i;j++)
				sum++;
		System.out.println(sum);
//		System.out.println('b');
//		System.out.println('b'+'c');
//		System.out.println((char)'a'+4);
		
	}

	private static void questionA() {
		double t = 9.0;
		while(Math.abs(t-9.0/t)>0.001){
			t = (9.0/t+t)/2.0;
			System.out.printf("%.5f\n", t);
		}
		
	}

}
