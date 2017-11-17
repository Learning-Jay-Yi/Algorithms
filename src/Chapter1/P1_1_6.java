package Chapter1;

public class P1_1_6 {

	public static void main(String[] args) {
		int f = 0;
		int g =1;
		for(int i =0; i<=15;i++){
			System.out.print(f);
			f=f+g;
			System.out.print("\tf="+f);
			g=f-g;
			System.out.print("\tg="+g+"\n");
		}
	}
}
