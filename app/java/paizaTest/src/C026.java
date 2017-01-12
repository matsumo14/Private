import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class C026 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String str1[] = line1.split(" " ,0);

        int n = Integer.parseInt(str1[0]);
        int s = Integer.parseInt(str1[1]);
        int p = Integer.parseInt(str1[2]);

        ArrayList<Integer> carrot = new ArrayList<Integer>();
        ArrayList<Integer> cm = new ArrayList<Integer>();

        int max=0;
        int result = 0;

        for(int i=0;i<n;i++){
        	String line = br.readLine();
            String str[] = line.split(" " ,0);
            carrot.add(Integer.parseInt(str[0]));

            if(s-p<=Integer.parseInt(str[1])){
            	if(Integer.parseInt(str[1])<=s+p){
            		cm.add(Integer.parseInt(str[0]));
            	}
            }
        }
        try{
        	Collections.sort(cm);
        	max = cm.get(0);
        }catch(Exception e){
        	System.out.println("not found");
        }

        for(int j=0;j<carrot.size();j++){
        	if(carrot.get(j)==max){
        		result = j+1;
        		break;
        	}
        }

        if(result!=0){
        	System.out.println(result);
        }

	}
}

















