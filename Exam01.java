package day05;
import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] lotto=new int[1000];
		Random ran=new Random(42);//seed값
		
		for(int i=0;i<lotto.length;i++) {
			int num=ran.nextInt(45)+1; //1<= num < 46
			lotto[i]=num;
			System.out.print(lotto[i]+", ");
		}
		//로또 번호가 30이상 하는 번호는 몇 개있는지 세어 출력하세요
		int cnt=0;
		for(int num:lotto) {
			if(num>=30) {
				cnt++;
			}
		}
		System.out.println("\n30이상 로또 번호 갯수: "+cnt+"개");
		

	}

}
