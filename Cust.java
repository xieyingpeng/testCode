package workTest3;
import java.util.Scanner;
//�û���
public class Cust {
	String myGuess;
	int choice;
	static String name;
	public String  userName() {//�û���ɫ
		Scanner sc = new Scanner(System.in);
		System.out.print("������������֣�");
		name = sc.nextLine();
		return name;
	}
	//public String  userNames() {//�û���ɫ
		//System.out.println(name);
		//return name;
	//}
	//�ҵĳ�ȭ
	public void guess(){
		Scanner input=new Scanner(System.in);
		Cust cust = new Cust();
		System.out.print("���ȭ��1.���� 2.ʯͷ 3.����������Ӧ�����֣���");
		choice=input.nextInt();
		switch(choice){
		case 1:
		 myGuess=(" ���ȭ������");
		 break;
		case 2:
		 myGuess=(" ���ȭ��ʯͷ");
		 break;
		case 3:
		 myGuess=(" ���ȭ����");
		 break;
		 
		} 
	}
	
}

