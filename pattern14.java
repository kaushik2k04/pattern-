public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for( char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
}


A
A B
A B C 
A B C D
A B C D E
A B C D E F
A B C D E F G
