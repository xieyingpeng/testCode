//ʵ��ʯͷ��������Ϸ
package workTest1;
import java.util.Scanner;
public class HomeWord2 {
	public static int count = 0;//��¼��ս�Ĵ���
	public static int meScore= 0;//��¼�ҵĵ÷�

	public static int computerScore= 0;//��¼���Եĵ÷�

	public static String userName = "";//��¼�û�������

	public static String computerName = "";//��¼���Ե�����

	public static int userNumber = 0;//��¼�û���ѡ������
	public static int computerNumber= 0;//��¼���Ե�ѡ������
	public static void main(String[] args) {
		stareGames();//��ʼ��Ϸ
		getScore();//����÷����
		showResult();//������
		System.out.println("��л������飡��ӭ�´����棡");
		
	}
	public static void getScore() {//�÷����
		System.out.println("---------------------------------");
		System.out.println(userName+" " +" VS" +" " +computerName);
		System.out.println("��ս����Ϊ��"+count);
		System.out.println("����" +"-----------"+"�÷�");
		System.out.println(userName+"----------"+meScore);
		System.out.println(computerName+"----------"+computerScore);
		
	}
	public static void computerRole() {//���Խ�ɫ
		Scanner sc = new Scanner(System.in);
		System.out.print("��ѡ���ɫ��1.����  2.��Ȩ 3.�ܲ٣���");
		userNumber= sc.nextInt();
		if(userNumber == 1) {
			computerName="����";
		}
		else if(userNumber == 2) {
			computerName="��Ȩ";
		}
		else if(userNumber == 3) {
			computerName="�ܲ�";
		}
		else {
			System.out.println("ѡ�����");
		}
		
	}
	public static void computerGuess() {//���Գ�ȭ
		computerNumber=(int)(Math.random()*3)+1;//����1-3�����
		switch(computerNumber) {
		case 1:
			System.out.println(computerName+"��ȭ��ʯͷ");
			break;
		case 2:
			System.out.println(computerName+"��ȭ������");
			break;
		case 3:
			System.out.println(computerName+"��ȭ����");
			break;
		}
		
	}
	public static void userGuess() {//�û���ȭ
		Scanner sc = new Scanner(System.in);
		System.out.print("���ȭ 1. ���� 2.ʯͷ 3.�� (������Ӧ������):");
		userNumber =sc.nextInt();
		switch(userNumber) {
		case 1:
			System.out.println(userName+"��ȭ��ʯͷ");
			break;
		case 2:
			System.out.println(userName+"��ȭ������");
			break;
		case 3:
			System.out.println(userName+"��ȭ����");
			break;
		}
		
	}
	public static void showPrint() {//�ж���Ӯ
		if((computerNumber==1&& userNumber==1)||(computerNumber==2&& userNumber==2)||(computerNumber==3&& userNumber==3)){
			System.out.println("ƽ��");
		}
			
		else if((computerNumber==1&& userNumber==2)||(computerNumber==2&& userNumber==3)||(computerNumber==3&& userNumber==1)){
			
			System.out.println(computerName+"Ӯ����");//���Ի�ʤ
			computerScore++;
	}
		else if((computerNumber==1&& userNumber==3)||(computerNumber==2&& userNumber==1)||(computerNumber==1&& userNumber==2)){
			
			System.out.println(userName+"Ӯ����");//�û���ʤ
			meScore++;
		}
		else {
			System.out.println("û�н����");
		}
	}
	public static void showResult() {//������
		if(meScore== computerScore) {
			System.out.println("��������ƽ�֣��´��ں���һ�ָ��£�");
		}
		else if(meScore > computerScore) {
			System.out.println("�������ϲ��ϲ��");
		}
		else if(meScore < computerScore) {
			System.out.println("����������������� �´μ��ͣ�");
		}
		else 
		{
			System.out.println("û�н����");
		}
		
	}
	public static void stareGames() {//��ʼ��Ϸ
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------��ӭ������Ϸ����---------------------------");
		System.out.println("*******************************************************");
		System.out.println("************************��ȭ ��ʼ********************");
		System.out.println("*******************************************************");
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		computerRole();//���õ��Խ�ɫѡ��
		System.out.print("������������֣�");
		userName = sc.next();
		System.out.println(userName+" "+"VS" +" " +computerName+"��ս");
		System.out.print("\nҪ��ʼ�𣿣�y/n):");
		String s = sc.next();
		if(s.equals("y")) {
			for (s="";!s.equals("n");) {
				userGuess();//�û���ȭ
				computerGuess();//���Գ�ȭ
				showPrint();//�ж���Ӯ
				count++;//��ս������һ
				System.out.print("�Ƿ������һ�֣���y/n):");
				s = sc.next();
				
			}
		}
			else {
				System.out.println("��л������飬 ��ӭ�´����棡");
			}
		}
		
	}
