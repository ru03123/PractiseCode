package PractiseCode;

import java.util.Scanner;

public class SellCommodity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		
		String item1 = "ī�G";
		String item2 = "���J�O";
		int appleNum = 40;
		int choclateNum = 50;
		
		System.out.print("�z�n�аݻݭn����A��?\n");
		System.out.println("�ثe����ӥ\��, ��J (1) �|�q�ܮw���X�f���C��J(2)�h�N�f���x�s�i�J���w");
		int choose = sc.nextInt();
		if(choose == 1 ) {
			System.out.printf("�ثe�ܮw�f���� %s: %d�� ,%s: %d���C\n",item1,appleNum,item2,choclateNum);
			System.out.printf("�Цb�H�U��J���f�ƶq�C\n");
			System.out.printf("%s: ",item1);
			int a = sc.nextInt();
			System.out.printf("%s: ",item2);
			int b = sc.nextInt();
			int sum1 = calc.getApple(appleNum,a);
			int sum2 = calc.getChocalate(choclateNum,b);
			System.out.printf("%s �Ѿl %d\n",item1,sum1);
			System.out.printf("%s �Ѿl %d\n",item2,sum2);
		}else if(choose == 2){
			System.out.printf("�ثe�ܮw�f���� %s: %d�� ,%s: %d���C\n",item1,appleNum,item2,choclateNum);
			System.out.printf("�Цb�H�U��J�s�f�ƶq�C\n");
			System.out.printf("%s: ",item1);
			int a = sc.nextInt();
			System.out.printf("%s: ",item2);
			int b = sc.nextInt();
			int sumApple = calc.depositApple(appleNum,a);
			int sumchocalate = calc.depositChocalate(choclateNum,b);
			System.out.printf("%s �Ѿl %d\n",item1,sumApple);
			System.out.printf("%s �Ѿl %d\n",item2,sumchocalate);
		}else {
			System.out.println("��J���~�Э��s��J");
		}
			
		
		

	}

}
