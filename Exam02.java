package day05;
import java.util.*;
public class Exam02 {

	public static void main(String[] args) {
		
		int[] jumsu=new int[10000];
		Random ran=new Random(10);
		int cnt1=0;
		int cnt2=0;
		long sum=0;
		String str="";
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i]=ran.nextInt(451);
			if(jumsu[i]==450) {
				cnt1++;
				str+=i+"번";
				
			}else if(jumsu[i]==0){
				cnt2++;
			}
			
			sum+=jumsu[i];
		}
		
		double avg=(double)sum/jumsu.length;
		System.out.println("만점자"+cnt1+"명");
		System.out.println("0점"+cnt2+"명");
		System.out.println("번호"+str+"번");
		System.out.println("평균점수"+String.format("%d2f", avg)+"점");
		
		
		
		
		
		
		
		
		
		
		
	}

}
