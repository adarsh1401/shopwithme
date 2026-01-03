package com.proj.microservices.product;

public class Test {
	
	public static void main(String args[]) {
		String  s = "10203004";
		int[][] queries = {{0,7},{1,3},{4,6}};
		sumAndMultiply(s,queries);
	}
	
	public static  int[] sumAndMultiply(String s, int[][] queries) {
        int row = queries.length;
        int[] res = new int[row];
        int temp = 0;
        for(int i=0;i<row;i++){
            String query = "";
            int sum = 0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if(s.charAt(j) != '0'){
                    query = query+s.charAt(j);
                    System.out.println(query + "," + j);
                    sum = sum+(s.charAt(j) - '0');
                    System.out.println("sum: "+sum);
                }
            }
            if(!query.isEmpty()){
                res[temp] = Integer.valueOf(query) * sum;
                temp++;
            }
        }
        return res;
    }
}
