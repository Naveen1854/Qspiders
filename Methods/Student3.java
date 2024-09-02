class  Student3
{
	int tel = 90;
	int hin = 91;
	int eng = 92;
	int mat = 93;
	int sci = 94;
	int soc = 95;

	class ObjectDemo
	{
		int sum;
		public static void main(String args[]){
			Student3 s1 = new Student3();
			ObjectDemo od = new ObjectDemo();
			int total = od.display(s1);
			System.out.println(total);
		}
		int display(Student3 s2){
			sum =  s2.tel + s2.hin + s2.eng + s2.mat + s2.sci + s2.soc;
			return sum;
			//System.out.println("Marks Scored: " + sum);
		}
	}
}
