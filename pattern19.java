for(int i=0;i<n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("* ");
            }
            for(int j=0;j<(2*i);j++){
                System.out.print("  ");
            }


            for(int j=1;j<=(n-i);j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        int border=2*(n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }

            for(int j=0;j<border;j++){
                System.out.print("  ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
            border=border-2;

        }

5
* * * * * * * * * *  
* * * *     * * * *  
* * *         * * *  
* *             * *  
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
