package workTest3;
import java.util.Scanner;
public class Computer {
		String name;
		int score1,random,role;
		//ѡ����Խ�ɫ��
		public String computerName(){
	 	Scanner sc = new Scanner(System.in);
		System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣���");
		role=sc.nextInt();
		switch(role){
		case 1:
		 name="����";
		 break;
		case 2:
		 name="��Ȩ";
		 break;
		case 3:
		 name="�ܲ�";
		 break;
		}
		return name;
	}
		public String computerNames(){
		 	Scanner sc = new Scanner(System.in);
			//System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣���");
			//role=sc.nextInt();
			switch(role){
			case 1:
			 name="����";
			 break;
			case 2:
			 name="��Ȩ";
			 break;
			case 3:
			 name="�ܲ�";
			 break;
			}
			return name;
		}
	 public void guess(){
		  random=(int)(Math.random()*3)+1;
		  Computer cp = new Computer();
		  switch(random){
		  case 1:
			  System.out.println(computerNames()+"��ȭ��ʯͷ");
		  case 2:
		   System.out.println(computerNames()+"��ȭ������");
		   break;
		  case 3:
		   System.out.println(computerNames()+"��ȭ����");
		   break;
		  }
	 }
}

