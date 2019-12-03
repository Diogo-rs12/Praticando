import java.util.*;
public class Programa {
	public static void main(String args []) {
		Scanner dr = new Scanner(System.in);
		int qd = dr.nextInt();
		int s = dr.nextInt();
		int ms = s;
	for(int da = 1; da <= qd; da++) {
		int sd = dr.nextInt();
		s = s + sd;
		System.out.println(s);
	}
	if(s < ms) {
		ms = s;
	}
	System.out.println(ms);
	}

}
