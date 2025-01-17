public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i)/2;
            for(int j=1;j<2*i;j++){
                 System.out.print(ch+" ");
                if(j<breakpoint){
           
                ch++;
                }
                
                else{
                    ch--;
                   
                }
            }
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}


   A
  A B A
A B C B A
