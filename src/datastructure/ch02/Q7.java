package datastructure.ch02;

public class Q7 {

	static final int VMAX = 21;
	
	static class PhyscData{
		String name;	//이름
		int height;		//키
		double vision;	//시력
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		
	}
	
	//키평균
	static double avgHeight(PhyscData[] dat) {
		double sum=0;
		for(PhyscData p:dat) {
			sum+=p.height;
		}
		return sum/dat.length;
	}
	
	static void distVision(PhyscData[] dat, int[] dist) {
		for(PhyscData p : dat) {
			if(p.vision >= 0.0 && p.vision <= VMAX/10.0)
				dist[(int)(p.vision*10)]++;
		}
	}
	
	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("A", 162, .3),
				new PhyscData("B", 173, .7),
				new PhyscData("C", 175, 2.0),
				new PhyscData("D", 171, 1.5),
				new PhyscData("E", 168, .4),
				new PhyscData("F", 174, 1.2),
				new PhyscData("G", 169, .8),
				new PhyscData("G", 169, .8),
				new PhyscData("G", 169, .8),
				new PhyscData("G", 169, .8),
		};
		int[] vdist = new int[VMAX];
		
		System.out.println("이름\t키\t시력");
		for(PhyscData p : x) {
			System.out.printf("%-8s%3d%8.1f\n", p.name, p.height, p.vision);
		}
		System.out.printf("\navgHeight==%5.1f\n\n",avgHeight(x));

		distVision(x, vdist);
		for(int i=0; i<VMAX; i++) {
//			System.out.printf("%3.1f~: %2d명\n", i/10.0, vdist[i]);
			System.out.printf("%3.1f~: ", i/10.0);
			for(int j=0; j<vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
