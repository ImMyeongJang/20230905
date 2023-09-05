package day05;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 2차원 배열: 1)선언  2)메모리 할당  3) 초기화
		
		//int [][]a; //1)선언
		//int []a[];
		int a[][];
		
		//2) 메모리할당  : 행의 크기, 열의 크기 지정
		a=new int[3][2]; //3행2열
		System.out.println(a[0][0]);
		
		//3) 초기화
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		
		System.out.println("행의 크기(a.length): "+a.length);
		System.out.println("열의 크기(a[i].length): "+a[0].length);
		
		//중첩 for루프 이용해서 a에 저장된 값을 출력
		for(int i=0;i<a.length;i++) {
			for(int k=0;k<a[i].length;k++) {
				System.out.print(a[i][k]+", ");
			}
			System.out.println();
		}
		
		System.out.println("****************");
		//for each 루프 이용해서 a에 저장된 값을 출력
		for(int[] b:a) {
			for(int x:b) {
				System.out.print(x+", ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//1)+2)+3)
		short[]s[]= { {-5, -7, -9},{10,11},{0}};
		System.out.println("s.length: "+s.length);//3
		System.out.println("s[0].length: "+s[0].length);
		System.out.println("s[1].length: "+s[1].length);
		System.out.println("s[2].length: "+s[2].length);
		
		//for each 이용해서 출력하기
		for(short[]y:s) {
			for(short z:y) {
				System.out.print(z+", ");
			}
			System.out.println();
		}
		System.out.println("##############");
		//행의 크기만 먼저 잡아놓고, 나중에 열의 크기를 할당하는 방법
		char[][]ch=new char[3][];
		System.out.println("행의 크기: "+ch.length);
		
		ch[0]=new char[2];//2열
		ch[1]=new char[4];//4열
		ch[2]=new char[3];//3열
		System.out.println("ch[0].length: "+ch[0].length);
		System.out.println("ch[1].length: "+ch[1].length);
		System.out.println("ch[2].length: "+ch[2].length);
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		//char의 디폴트값: '\u0000'
		
		for(int i=0;i<ch.length;i++) {
			char [] c=ch[i];
			for(int k=0;k<c.length;k++) {
				char v=ch[i][k];
				//System.out.print(ch[i][k]);
			}
			System.out.println();
		}
		System.out.println("******************");
		//for루프 이용해 출력하세요
		for(char[]c:ch) {
			for(char v:c) {
				System.out.print(v);
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
	}

}






















