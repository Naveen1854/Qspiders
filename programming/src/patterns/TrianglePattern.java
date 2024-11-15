package patterns;

class TrianglePattern{
public static void main(String args[]){     


	int n=6;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(i+j<=n){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
                for(int k=1;k<n;k++){
                    if(i>=k){
                        System.out.print("*");
                    }
                }
            System.out.println();
        }
    }
}