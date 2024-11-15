package patterns;

class Pattern7 {
    public static void main(String[] args) {
        // int r =10;
        // int c = 3;
        // for(int i=0;i<r;i++){
        //     for(int j=-0;j<c;j++){
                
        //         System.out.print("*");
        //         if(j!=c-1){
        //             System.out.print("-");
        //         }
        //     }
        //     System.out.println();
        // }
        int n = 5;
        // int c= 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||  j==0  || i==n-1 || j==n-1 || i==j || i+j== n-1){     
                    System.out.print("* ");
                }else{
                   System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}