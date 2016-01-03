import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C022 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        int n = Integer.parseInt(line1);

        ArrayList<Integer> start = new ArrayList<Integer>();
        ArrayList<Integer> end = new ArrayList<Integer>();
        ArrayList<Integer> max = new ArrayList<Integer>();
        ArrayList<Integer> min = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
        	String line = br.readLine();
        	String str[] = line.split(" ",0);

        	start.add(i,Integer.parseInt(str[0]));
        	end.add(i,Integer.parseInt(str[1]));
        	max.add(i,Integer.parseInt(str[2]));
        	min.add(i,Integer.parseInt(str[3]));
        }

        Collections.sort(max);
        Collections.sort(min);

        System.out.println(start.get(0)+" "+end.get(n-1)+" "+max.get(n-1)+" "+min.get(0));


	}


}






