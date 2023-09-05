package day05;

public class ArrayTest3 {

	public static void main(String[] args) {
		// ppt 55
		String[] place= {"제주도","울릉도","거제도","여수","부산"};
		char colors[]= {'r','b','y','g','w'};
		float height[]= {182.1f,173.8f,165.5f,150,177.56f};
		
		for(int i=0;i<place.length;i++) {
			System.out.println(place[i]+"\t"+colors[i]+"\t"+height[i]);
		}

	}

}
