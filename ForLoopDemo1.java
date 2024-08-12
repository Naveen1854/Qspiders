class ForLoopDemo1 {
	public static void main(String[] args) {
		System.out.println("Alphabets:");
		for(char c = 'A'; c <= 'Z'; c+=1){
			System.out.print(c+ "  ");
		}
		System.out.println("\n=============================================================================");
			 for(int i=1;i<=20;i+=1){
				if(i%2 != 0){
					System.out.println(i+" is Odd");
					}else{
						System.out.println(i+ " is Even");
				}
		}
			System.out.println("\n==========");
			int a = 0;
			while(a<10){
				a++;
				System.out.println(a);
			}
		}
}

