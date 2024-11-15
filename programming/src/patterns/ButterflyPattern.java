package patterns;

class ButterflyPattern{
public static void main(String args[]){

        int n =3;
        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i>=j){
                System.out.print("*");
                }
                if(i<=j){
                    System.out.print(" ");
                }
            }
                for(int k=2;k<2*n;k++){
                    if(i+k<=2*n){
                        System.out.print(" ");
                    }
                }
                for(int a=1;a<2*n;a++){
                    if(i+a>=2*n){
                        System.out.print("*");
                    }
                }
            
            System.out.println();
        }
         for(int i=2;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i+j<=2*n){
                System.out.print("*");
                }
                if(i+j>=2*n){
                    System.out.print(" ");
                }
            }
                for(int b=2;b<=2*n;b++){
                    if(i>=b){
                    System.out.print(" ");
                }
            }
            for(int c=1;c<2*n;c++){
                    if(i<=c){
                        System.out.print("*");
                    }
                }
            
            System.out.println();
        }
    }
}