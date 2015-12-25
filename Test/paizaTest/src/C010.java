import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1 [] = new String[3];
        str1 = line1.split(" " ,0);
        int a =Integer.parseInt(str1[0]);
        int b =Integer.parseInt(str1[1]);
        int c =Integer.parseInt(str1[2]);
        int S =c*c;

        //System.out.println(S);

        String line2 = br.readLine();
         int N = Integer.parseInt(line2);
        int x ;
        int y;

        //System.out.println(N);

         String str[] = new String[2];
         ArrayList<String>  list = new ArrayList();
        for(int  i =  0;i<N;i++){
        	String line = br.readLine();
        	str = line.split(" ",0);
        	x = Integer.parseInt(str[0]);
        	y = Integer.parseInt(str[1]);
        	//System.out.println((x-a)*(x-a)+(y-b)*(y-b));
        	if((x-a)*(x-a)+(y-b)*(y-b)>=S){
        		list.add(i,"silent");
        	}else{
        		list.add(i,"noisy");
        	}
        }
//        int count =1;
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
  //      	System.out.println(count);
        	System.out.println(it.next());
 //       	count++;
        }
    }
}





