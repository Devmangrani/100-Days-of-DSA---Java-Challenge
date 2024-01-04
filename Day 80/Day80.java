public class Day80 {
    class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return hel(n-1 , colors , neededTime , dp , 'A' , neededTime[n-1]);
    }
    public int hel(int i , String col, int time[] , int dp[] , char pc , int pt){
      if(i<0){
        return 0;
      }
      if(dp[i] != -1){
        return dp[i];
      }
      //Main Content
      if(col.charAt(i) == pc){
        System.out.println( Math.max(time[i],pt));
        System.out.println("Min "+ Math.min(time[i],pt));
        return dp[i] = hel(i-1, col , time, dp, col.charAt(i) , Math.max(time[i],pt)) + Math.min(time[i], pt);
      }else{
          return dp[i] = hel(i-1, col , time, dp, col.charAt(i) , time[i]);
      }
    } 
}
}
