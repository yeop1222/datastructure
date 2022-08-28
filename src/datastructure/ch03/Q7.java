package datastructure.ch03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {

	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
						(d1.height < d2.height) ? -1 : 0;
			}
		}

		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? -1 : 
						(d1.vision < d2.vision) ? 1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		
		PhyscData[] x = {
				new PhyscData("A", 162, 0.3),
				new PhyscData("B", 168, 0.4),
				new PhyscData("C", 169, 0.8),
				new PhyscData("D", 171, 1.5),
				new PhyscData("E", 173, 0.7),
				new PhyscData("F", 174, 1.2),
				new PhyscData("G", 175, 2.0),
		};
		
		Arrays.sort(x, PhyscData.VISION_ORDER);
		
//		System.out.println(Arrays.toString(x));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시력 찾기> ");
		double key = sc.nextDouble();
		
		int idx = Arrays.binarySearch(
				x,
				new PhyscData("", 0,key),
				PhyscData.VISION_ORDER
				);
		
		if(idx < 0)
			System.out.println("없음");
		else {
			System.out.println("index=="+idx);
			System.out.println(x[idx]);
		}
	}
}
