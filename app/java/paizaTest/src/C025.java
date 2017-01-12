import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C025 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        int n = Integer.parseInt(line1);
        String line2 = br.readLine();
        int m = Integer.parseInt(line2);

 /*      String line3 = br.readLine();
 	   String str3[] = line3.split(" " ,0);
 	   String h =str3[0];
*/

      ArrayList<Integer> pcount = new ArrayList<Integer>();
      for(int a=0;a<=23;a++){
    	  pcount.add(0);
      }
       ArrayList<Integer> result = new ArrayList<Integer>();
       for(int b=0;b<=23;b++){
     	  result.add(0);
       }



       for(int i=0;i<m;i++){
    	   String line = br.readLine();
    	   String str[] = line.split(" " ,0);
    	   for(int j=0;j<=23;j++){
    		   if(j==Integer.parseInt(str[0])){
    			   int tmp =   pcount.get(j);
    			   pcount.set(j, Integer.parseInt(str[2])+tmp);
    		   }
    	   }
       }

       for(int k =0;k<=23;k++){
    	  int  tmp = pcount.get(k);
    	  result.set(k,( tmp+n-1)/n);
       }

       int sum =0;

       Iterator<Integer> it = result.iterator();
       while(it.hasNext()){
    	   sum =sum +it.next();
       }

        System.out.println(sum);

	}
}

















