public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int ans=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ans+" ");
                ans++;
            }
            System.out.println(" ");
        }
    }
}

1
2 3
4 5 6
