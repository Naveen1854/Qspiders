class  Marks
{
	int tel = 90;
	int hin = 91;
	int eng = 92;
	int mat = 93;
	int sci = 94;
	int soc = 95;
}
	class SumOfMarks
	{
		int sum;
		public static void main(String args[]){
			Marks m1 = new Marks();
			SumOfMarks sm = new SumOfMarks();
			int total = sm.display(m1);
			System.out.println("Marks Scored: " + total);
		}
		int display(Marks m2){
			sum =  m2.tel + m2.hin + m2.eng + m2.mat + m2.sci + m2.soc;
			return sum;
			//System.out.println("Marks Scored: " + sum);
		}
}
