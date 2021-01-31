//双色球
package workTest1;
import java.util.Scanner;
public class HomeWork3 {
	public static int[] arr= new int[7];//存放输入的7个号码
	public static int[] a= new int[6];//存放生成的6个红球号码
	public static int b = 0;//用于接收0或1的选择数字
	public static int input= 0;//选择菜单的数字
	public static int random=0;//存放产生的1-16的蓝色球
	public static void main(String[] args) {
		stareGame() ;//开始游戏
		
	}
	public static void stareGame() {//开始游戏
		menu();
		if(input==1 || input ==2) {
			for (;input!=3 ;) {
				menu();
			}
		}
		else {
			System.out.println("选择错误！");
		}
	}
	public static void buyLottery() {//购买彩票
		Scanner  sc =new Scanner(System.in);
		System.out.println("[双色球彩票系统> 购买彩票");
		System.out.print("请输入下注数量：");
		int numbers = sc.nextInt();
		System.out.print("请输入0或1（0-手动输入 1-电脑选择号码）：");
		b = sc.nextInt();
		if(b==0) {
			System.out.println("你一共买了"+numbers+"注彩票共需要支付"+(numbers*2)+"元 请输入7个号码：");
			for (int i =0 ;i<arr.length;i++) {
				arr[i]=sc.nextInt();//输入的数字存放在数组
			}
			System.out.print("所选择的号码为：");
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
			System.out.println("输入错误！");
		}
		
	}
	public static void checkLottery() {//查看开奖
		Scanner sc = new Scanner(System.in);
		System.out.println("[双色球彩票系统> 查看开奖");
		System.out.println("所选 的号码为：");
		if(b==1) {
			for (int i =0;i<a.length;i++) {//如果选择随机生成的 号码就打印出随机号码
				System.out.print(a[i]+" ");	
			}
			System.out.print(random);	
		
			
		}
		else if(b==0) {
			for(int i= 0;i<arr.length;i++) {//如果选择手动生成的 号码就打印出随机号码
				System.out.print(arr[i]+" ");	
			}
		}
		else {
			System.out.println("输入错误！ ");	
		}
		System.out.println();	
		System.out.println("当期的中奖号码为：");	
		redBall();
		blueBall();
		
		
	}
	public static void redBall() {//生成6个随机的红色球
		for(int i = 0;i<6;i++) {
			a[i]=(int)(Math.random()*33)+1;//随机生成1-33号码
			
		}
		for (int i = 0 ; i<6;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static void blueBall() {//随机生成一个1-16蓝色球
		random = (int)(Math.random()*16)+1;//随机生成1-16号码
		System.out.print(random);
		System.out.println();
		
		
	}
	public static void returnfrom() {//退出
		System.out.println("谢谢使用");
		return ;
		
	}
	public static void menu() {
		System.out.println("******************欢迎进入双色球彩票系统********************");
		System.out.println("\t 1.购买彩票\t");
		System.out.println("\t 2.查看开奖\t");
		System.out.println("\t 3.退出\t");
		System.out.println("******************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.print("请选择菜单：");
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
