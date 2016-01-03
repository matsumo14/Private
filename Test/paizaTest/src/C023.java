import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C023 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1[] = line1.split(" ",0);


        String line2 = br.readLine();
        int n = Integer.parseInt(line2);

        ArrayList<Integer> result = new ArrayList<Integer>();


        for(int i=0;i<n;i++){
        	int hitsum = 0;
        	String line = br.readLine();
            String str[] = line.split(" ",0);
            for(int j=0;j<str.length;j++){
            	for(int k=0;k<str1.length;k++){
            		if(str[j].equals(str1[k])){
            			hitsum = hitsum+1;
            			break;
            		}
            	}
            }
        	result.add(hitsum);
        }

        Iterator<Integer> it = result.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }



	}


}






