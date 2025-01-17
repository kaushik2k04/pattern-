    int breakdown=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=breakdown;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            breakdown=breakdown-2;
        }
        int bre=2;
        for(int i=1;i<=n-1;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            for(int j=1;j<=bre;j++){
                System.out.print(" ");
            }
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
            bre=bre+2;
        }

5
*        *
**      **
***    ***
****  ****
********** 
****  ****
***    ***
**      **
*        *
