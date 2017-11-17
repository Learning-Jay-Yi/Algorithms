package Chapter1;

import java.util.Scanner;

public class P1_1_14 {

	public static void main(String[] args) {
//		lg(149); //1.1.14
//		System.out.println(exR1(6)); //1.1.16
//		System.out.println(exR2(6)); //1.1.17
//		System.out.println(mystery(2,25)); // 1.1.18a
//		System.out.println(mystery(3,11)); // 1.1.18b
//		for (int N = 0; N<100; N++) System.out.println(N+" "+F(N)); // the result is the pre-num+current bum
//		long[] a = new long[100]; A(a); //1.1.19 solution
//		System.out.println(in(factorial(5))); // 1.1.20 solution
//		test1(); // 1.1.22 solution
//		System.out.println(divisor(1111111,1234567)); // 1.1.24 solution
		
		
	}
	
	private static int divisor(int a, int b){
		if(a>b){
			if(a%b == 0){
				return b;
			}else{
				int c = a%b;
				System.out.println(a+" "+b+" "+c);
				return divisor(b,c);
			}
		}else if(a<b){
			if(b%a == 0){
				return a;
			}else{
				int c = b%a;
				System.out.println(a+" "+b+" "+c);
				return divisor(a,c);
			}	
		}else{
			return a;
		}
	}
	
	private static void test1() {
		int[] a = {1,2,4,6,7,8,9,11,15,17,18,21,25,27,29,31,35,37,41,46,58};
		int target = 6;
		if(rank(a,target) < 0)
			System.out.println("Did'n find "+target+" in list.");
		else
			System.out.println("find the target number: " + target);
	}

	private static int rank(int[] array, int target){
		int count = 0;
		int lo = 0;
		int hi = array.length-1;
		return rank(array,target,lo,hi,count);
	}

	private static int rank(int[] array, int target, int lo, int hi, int count) {
		if (lo <= hi){
			count++;
				int mid = lo+(hi-lo)/2;
				if(target < array[mid]){
					System.out.println("this is "+count+" time in less, the hight number is "+ array[hi]
							+ ", the low number is "+array[lo]+", the mid number is "+array[mid]);
					hi = mid - 1;
					return rank(array,target,lo,hi,count);
				}
				else if (target > array[mid]){
					System.out.println("this is "+count+" time in great, the hight number is "+ array[hi]
							+ ", the low number is "+array[lo]+", the mid number is "+array[mid]);
					lo = mid + 1;
					return rank(array,target,lo,hi,count);
				}
				else{
					System.out.println("this is "+count+" time, the hight number is "+ array[hi]
							+ ", the low number is "+array[lo]+", the mid number is "+array[mid]);
					return mid;	
					}
			}
		return -1;
	}

	private static int rank(int[] array, int target, int count) {
		if (array[count] == target)
			return count;
		return rank(array,target,count++);
	}

	private static int in(int n) {
		int a = 0;
		while(n>=10){
			n=n/10;
			a++;
		}
		return a;
	}

	private static int factorial(int i) {
		if (i >1 ) 
			return i*factorial(i-1);
		else
			return 1;
	}

	private static void A(long[] a) {
		a[0] = 0;
		a[1] = 1;
		for (int N = 2; N<100; N++){
			a[N] = a[N-1] + a[N-2];
			System.out.println(N +" "+ a[N]);
		}
	}

	private static long F(int N) {
		if (N==0) return 0;
		if (N==1) return 1;
		return F(N-1) +F(N-2);
	}

	private static int mystery(int a, int b) {
		if(b == 0) {
			return 0;
		}
		if(b%2 == 0) {
			System.out.println((a+a) +"/"+ (b/2));
			return mystery(a+a,b/2);
		}
		
		System.out.println((a+a) +"/"+ (b/2) +"/"+a);
		
		return mystery(a+a,b/2) + a;
	}

	private static String exR2(int n) {
//		String s = exR2(n-3)+" "+n+" "+exR2(n-2)+" "+n;
		if (n<=0) return "/";
		String s = exR2(n-3)+" "+n+" "+exR2(n-2)+" "+n; // change to here
		return s;
	}

	private static String exR1(int n) {
		if (n<=0) return "/";
		return exR1(n-3)+" "+n+" "+exR1(n-2)+" "+n;
	}

	private static void lg(int num) {
		int a = 0;
		System.out.print("number "+num);
		while(num>=2){
			num = num/2;
			a++;
		}
		System.out.println(" base-2 logarithms max value is: "+a);
	}
	
}
