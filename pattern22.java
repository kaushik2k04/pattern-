public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                int ans=Math.min(Math.min(left,right),Math.min(top,bottom));
                System.out.print(n-ans);
            }
            System.out.println(" ");
        }
    }
}

4444444
4333334
4322234
4321234
4322234
4333334
4444444
