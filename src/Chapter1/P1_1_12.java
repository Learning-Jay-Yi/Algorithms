package Chapter1;

public class P1_1_12 {

	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println("code fragment 1:");
		for (int i=0; i<10;i++){
			a[i] = 9-1;
			System.out.println(a[i]);
		}
		System.out.println("code fragment 2:");
		for (int i=0; i<10; i++){
			a[i] = a[a[i]];
			System.out.println(a[i]);
		}
		System.out.println("code fragment 3:");
		for (int i=0; i<10; i++){
			System.out.println(i);
		}
	}

}
