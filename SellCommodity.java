package PractiseCode;

import java.util.Scanner;

public class SellCommodity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		
		String item1 = "蘋果";
		String item2 = "巧克力";
		int appleNum = 40;
		int choclateNum = 50;
		
		System.out.print("您好請問需要什麼服務?\n");
		System.out.println("目前有兩個功能, 輸入 (1) 會從倉庫取出貨物。輸入(2)則將貨物儲存進入艙庫");
		int choose = sc.nextInt();
		if(choose == 1 ) {
			System.out.printf("目前倉庫貨物有 %s: %d顆 ,%s: %d份。\n",item1,appleNum,item2,choclateNum);
			System.out.printf("請在以下輸入取貨數量。\n");
			System.out.printf("%s: ",item1);
			int a = sc.nextInt();
			System.out.printf("%s: ",item2);
			int b = sc.nextInt();
			int sum1 = calc.getApple(appleNum,a);
			int sum2 = calc.getChocalate(choclateNum,b);
			System.out.printf("%s 剩餘 %d\n",item1,sum1);
			System.out.printf("%s 剩餘 %d\n",item2,sum2);
		}else if(choose == 2){
			System.out.printf("目前倉庫貨物有 %s: %d顆 ,%s: %d份。\n",item1,appleNum,item2,choclateNum);
			System.out.printf("請在以下輸入存貨數量。\n");
			System.out.printf("%s: ",item1);
			int a = sc.nextInt();
			System.out.printf("%s: ",item2);
			int b = sc.nextInt();
			int sumApple = calc.depositApple(appleNum,a);
			int sumchocalate = calc.depositChocalate(choclateNum,b);
			System.out.printf("%s 剩餘 %d\n",item1,sumApple);
			System.out.printf("%s 剩餘 %d\n",item2,sumchocalate);
		}else {
			System.out.println("輸入錯誤請重新輸入");
		}
			
		
		

	}

}
