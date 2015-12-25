	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Collections;



public class C006v2 {

	    public static void main(String[] args) throws Exception {
	    	// 自分の得意な言語で
	        // Let's チャレンジ！！
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line1 = br.readLine();
	        String str1[] = line1.split(" ",0);
	        int n = Integer.parseInt(str1[0]);
	        int m = Integer.parseInt(str1[1]);
	        int k = Integer.parseInt(str1[2]);

	        String line2 = br.readLine();
	        String str2[] = line2.split(" ",0);
	        double ci[] = new double[n];
	        for(int i=0;i<n;i++){
	            ci[i] = Double.parseDouble(str2[i]);
	        }

	        int x[] = new int[n];
	        ArrayList<Double> s = new ArrayList();
	        double tmp = 0;

	        for(int j=0;j<m;j++){
	            String line3 = br.readLine();
	            String str3[] = line3.split(" ",0);
	            s.add(j,0.0);
	            for(int h=0;h<n;h++){
	                x[h] = Integer.parseInt(str3[h]);
	                if(h == 0){
	                	s.set(j,ci[0]*x[0]);
	                }else{
	                	s.set(j,s.get(j)+ci[h]*x[h]);
	                }
	            }
	            tmp = Math.round(s.get(j));
	            s.set(j,tmp);
	        }

	        Collections.sort(s);

	        for(int d=m-1;k>0;k--){
	            System.out.println((int)Math.round(s.get(d)));
	            d--;
	        }

	    }
}



