import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        int N = Integer.parseInt(line1);

        int result = 0;

        for(int i = 0;i<N;i++){
        	String line = br.readLine();
        	String str[] = line.split(" ",0);
        	String day = str[0];
        	double point = Double.parseDouble(str[1]);

        	if(day.contains("3")){
        		result = result + (int)Math.floor(point*0.03);
        	}else if(day.contains("5")){
        		result = result +(int)Math.floor(point*0.05);
        	}else{
        		result = result + (int)Math.floor(point*0.01);
        	}
        }

        System.out.println(result);


	}
}





