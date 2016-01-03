import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C024 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        int n = Integer.parseInt(line1);

        int a = 0;
        int b = 0;

        for(int i=0;i<n;i++){
        	String line = br.readLine();
        	String str[] = line.split(" ",0);

        	if(str[0].equals("SET")){
        		if(str[1].equals("1")){
        			a = Integer.parseInt(str[2]);
        		}else{
        			b = Integer.parseInt(str[2]);
        		}
        	}else if(str[0].equals("ADD")){
        		b = a + Integer.parseInt(str[1]);
        	}else if(str[0].equals("SUB")){
        		b = a - Integer.parseInt(str[1]);
        	}
        }

        System.out.println(a+" "+b);



	}


}






