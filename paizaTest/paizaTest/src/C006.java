	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.math.BigDecimal;


public class C006 {

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
	        double s[] = new double[m];

	        for(int j=0;j<m;j++){
	            String line3 = br.readLine();
	            String str3[] = line3.split(" ",0);
	            s[j] = 0;
	            for(int h=0;h<n;h++){
	                x[h] = Integer.parseInt(str3[h]);
	    	        s[j] = s[j]+ci[h]*x[h];
	            }
	            s[j] = Math.round(s[j]);
	        }
	        for(int f=m;f>0;f--){
	            for(int g =0;g<f-1;g++){
	                if(s[g]>s[g+1]){
	                    double tmp = s[g];
	                    s[g] = s[g+1];
	                    s[g+1] = tmp;
	                }
	            }
	        }

	        for(int d=0;d<k;d++){
	            System.out.println((int)s[m-1-d]);
	        }

	    }
	}



