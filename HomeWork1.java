//ʵ��һ�������ִ�С����Ϸ
package workTest1;
import java.util.Scanner;
public class HomeWork1 {

	public static void main(String[] args) {
		boolean flag =dengLu(4);
		if(flag){
			caiShuZi(7) ;
			
		}
		
	}
	public static int caiShuZi(int n) {//������
		int random = (int)(Math.random()*100)+1;//���������1-100
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<n;i++) {
			System.out.print("��������Ҫ�µ����֣�");
			int a = sc.nextInt();
			if(a<random) {
				System.out.println("��磬���С�ˣ�");
				System.out.println("�㻹��"+(n-i)+"�λ���");
			}
			else if (n>random) {
				System.out.println("��磬��´���");
				System.out.println("�㻹��"+(n-i)+"�λ���");
				
			}
			else {
				System.out.println("��ϲ�����ˣ�");
				break;
			}
			if(i==(n-1)) {
				System.out.println("��л������飬��ӭ�´����棡");
			}
		}
		return random;
	}
	public static boolean dengLu(int n) {//��¼
		System.out.println("��ӭ������Ϸ��");
		System.out.println("------------------------------");
		Scanner  sc = new Scanner(System.in);
		String str="123456";//Ĭ������
		boolean flag = false;
		for (int i =0 ; i<n;i++) {
			System.out.print("�������û�����");
			String name = sc.nextLine();
			System.out.print("��������� ���루Ĭ������Ϊ��123456����");
			String password = sc.nextLine(); 
			if(password.equals(str)) {
				System.out.println("��¼�ɹ���");
				System.out.println("��ӭ���飬��ʼ��Ϸ��");
				System.out.println("------------------------------");
				 flag = true;
				 break;
			
			}
			else if(password !=("123456")) {
				System.out.println("�㻹��"+(n-i)+"�λ���");
				
			}
			if(i==(n-1)) {
				System.out.println("��¼�����Ѿ����꣬���˳���Ϸ��");
				
			}
		}
		return flag;
	}
	

}
