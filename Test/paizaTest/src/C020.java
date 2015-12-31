import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str[] = line1.split(" ",0);

        double m = Double.parseDouble(str[0]);
        double p = Double.parseDouble(str[1]);
        double q = Double.parseDouble(str[2]);

       System.out.println(m*p/100);
       System.out.println(m-(m*p/100));
       System.out.println((m-(m*p/100)*(q/100)));
        System.out.println(m-(m*p/100)-((m-p/100)*q/100));

        System.out.println(m*(1-(1-p/100)-(1-(1-p/100)*q/100)));

	}
}





