package patterns;

public class AllPatterns {
	public static void main(String[] args) {

		// Right angle Triangle
		int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i>=j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// Reverse Right angle Triangle
		// int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i+j<=n){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// Reverse Right angle Triangle-2
		// int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(j>=i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// Left Right angle Triangle
		// int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i+j>=n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// Bike Stand Pattern
		// int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i+j<=n){
					System.out.print(" ");
				}
			}
			for(int k=1;k<n;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Bike stand homework pattern
		// int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i+j<=n){
					System.out.print(" ");
				}
			}
			for(int k=1;k<4;k++){
				System.out.print("*");
			}
			
			for(int a=1;a<n;a++){
				if(i+a>=n){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();


		// Pyramid Pattern
		// int n=6;
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
		System.out.println();


		// Reverse pyramid pattern
		// int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i>=j){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			for(int k=1;k<n;k++){
				if(i+k<=n){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();


		// Diamond Pattern
		// int n=6;
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
		for(int i=2;i<n;i++){
			for(int j=1;j<n;j++){
				if(i>=j){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			for(int k=1;k<n;k++){
				if(i+k<=n){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();


		// Ben10 Pattern 
		// int n =6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(i>=j){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			for(int k=1;k<n;k++){
				if(i+k<=n){
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for(int i=2;i<n;i++){
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
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();


		// Bokka padina konda Pattern
		// int n=6;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1) || i == n) {
					System.out.print("*"); 
				} else {
					System.out.print(" "); 
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
