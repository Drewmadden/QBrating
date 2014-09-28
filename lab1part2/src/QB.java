
import java.util.Scanner;


	public class QB {

		private static Scanner stats;

		public static void main(String[] args) {
			
			
			
			double ATT;
			double COMP;
			double YDS;
			int TD;
			int INT;
			
			stats = new Scanner(System.in);
			
			System.out.print("How many passes did the QB throw? ");
			ATT = stats.nextInt();
			
			System.out.print("How many of the passes were completions? ");
			COMP = stats.nextInt();
			
			System.out.print("How many yards did the QB throw for? ");
			YDS = stats.nextDouble();
			
			System.out.print("How many touchdowns did he throw? ");
			TD = stats.nextInt();
			
			System.out.print("How many interceptions did he throw? ");
			INT = stats.nextInt();
			
			
			float a;
			a = (float) ((((COMP/ATT) * 100) - 30) * 0.05);
			System.out.println(a);
			
			float b;
			b = (float) (((YDS/ATT) - 3) * .25);
			System.out.println(b);
			
			float c;
			c = (float) (((TD/ATT) * 100) * 0.2);
			System.out.println(c);
			
			float d;
			d = (float) (2.375 - (((INT/ATT) * 100) * 0.25));
			System.out.println(d);
			
			double QBrating;
			
			QBrating = ((a + b + c + d) / 6) * 100;
			System.out.println("Part 1 :");
			System.out.println(a+b+c+d);
			System.out.println("Part 2 :");
			System.out.println((a + b + c + d) / 6);
		
			System.out.println("The passer rating for the QB is : " + QBrating);
}
	}