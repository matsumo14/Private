import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str = line1;

        str = str.replaceAll("A","4");
        str = str.replaceAll("E","3");
        str = str.replaceAll("G","6");
        str = str.replaceAll("I","1");
        str = str.replaceAll("O","0");
        str = str.replaceAll("S","5");
        str = str.replaceAll("Z","2");

        System.out.println(str);


	}
}





