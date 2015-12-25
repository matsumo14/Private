	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.math.BigDecimal;
	import java.util.*;


public class C006v3 {

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
	        ArrayList<sum> slist = new ArrayList<sum>();
	        double tmp = 0;

	        for(int j=0;j<m;j++){
	            String line3 = br.readLine();
	            String str3[] = line3.split(" ",0);
	            for(int h=0;h<n;h++){
	                x[h] = Integer.parseInt(str3[h]);
	    	        tmp =tmp+ci[h]*x[h];

	            }
	            sum s = new sum();
	            s.Setsum(Math.round(tmp));
	            slist.add(s);
	            //tmp = 0;
	            System.out.println(slist.get(0).getSum());
	        }

	        Collections.sort(slist,new sortComparator());

	        Iterator<sum> it = slist.iterator();
	        while(it.hasNext()){
	        	sum data = it.next();
	        	System.out.println((int)data.getSum());
	        }





	    }


	    public static class sum{

	    	private double sum;

	    	public void Setsum(double s){
	    		this.sum = sum;
	    	}

	    	public double getSum(){
	    		return this.sum;
	    	}
	    }


	    public static class sortComparator implements Comparator<sum>{
	    	public int compare(sum s1,sum s2){

	    		double sum1 =s1.getSum();
	    		double sum2 =s2.getSum();

	    		if(sum1 > sum2){
	    			return 1;
	    		}else if(sum1 == sum2){
	    			return 0;
	    		}else{
	    			return -1;
	    		}

	    	}

	    }

}






