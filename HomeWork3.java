//˫ɫ��
package workTest1;
import java.util.Scanner;
public class HomeWork3 {
	public static int[] arr= new int[7];//��������7������
	public static int[] a= new int[6];//������ɵ�6���������
	public static int b = 0;//���ڽ���0��1��ѡ������
	public static int input= 0;//ѡ��˵�������
	public static int random=0;//��Ų�����1-16����ɫ��
	public static void main(String[] args) {
		stareGame() ;//��ʼ��Ϸ
		
	}
	public static void stareGame() {//��ʼ��Ϸ
		menu();
		if(input==1 || input ==2) {
			for (;input!=3 ;) {
				menu();
			}
		}
		else {
			System.out.println("ѡ�����");
		}
	}
	public static void buyLottery() {//�����Ʊ
		Scanner  sc =new Scanner(System.in);
		System.out.println("[˫ɫ���Ʊϵͳ> �����Ʊ");
		System.out.print("��������ע������");
		int numbers = sc.nextInt();
		System.out.print("������0��1��0-�ֶ����� 1-����ѡ����룩��");
		b = sc.nextInt();
		if(b==0) {
			System.out.println("��һ������"+numbers+"ע��Ʊ����Ҫ֧��"+(numbers*2)+"Ԫ ������7�����룺");
			for (int i =0 ;i<arr.length;i++) {
				arr[i]=sc.nextInt();//��������ִ��������
			}
			System.out.print("��ѡ��ĺ���Ϊ��");
			for (int i = 0 ; i< arr.length ;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else if(b==1) {
			redBall();
			blueBall();
		}
		else {
			System.out.println("�������");
		}
		
	}
	public static void checkLottery() {//�鿴����
		Scanner sc = new Scanner(System.in);
		System.out.println("[˫ɫ���Ʊϵͳ> �鿴����");
		System.out.println("��ѡ �ĺ���Ϊ��");
		if(b==1) {
			for (int i =0;i<a.length;i++) {//���ѡ��������ɵ� ����ʹ�ӡ���������
				System.out.print(a[i]+" ");	
			}
			System.out.print(random);	
		
			
		}
		else if(b==0) {
			for(int i= 0;i<arr.length;i++) {//���ѡ���ֶ����ɵ� ����ʹ�ӡ���������
				System.out.print(arr[i]+" ");	
			}
		}
		else {
			System.out.println("������� ");	
		}
		System.out.println();	
		System.out.println("���ڵ��н�����Ϊ��");	
		redBall();
		blueBall();
		
		
	}
	public static void redBall() {//����6������ĺ�ɫ��
		for(int i = 0;i<6;i++) {
			a[i]=(int)(Math.random()*33)+1;//�������1-33����
			
		}
		for (int i = 0 ; i<6;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static void blueBall() {//�������һ��1-16��ɫ��
		random = (int)(Math.random()*16)+1;//�������1-16����
		System.out.print(random);
		System.out.println();
		
		
	}
	public static void returnfrom() {//�˳�
		System.out.println("ллʹ��");
		return ;
		
	}
	public static void menu() {
		System.out.println("******************��ӭ����˫ɫ���Ʊϵͳ********************");
		System.out.println("\t 1.�����Ʊ\t");
		System.out.println("\t 2.�鿴����\t");
		System.out.println("\t 3.�˳�\t");
		System.out.println("******************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ѡ��˵���");
		input = sc.nextInt();
		switch(input) {
		case 1:
			buyLottery() ;
			break;
		case 2:
			checkLottery() ;
		case 3:
			returnfrom()  ;
			break;
			
		}
	}
	

}
