//实现石头剪刀布游戏
package workTest1;
import java.util.Scanner;
public class HomeWord2 {
	public static int count = 0;//记录决战的次数
	public static int meScore= 0;//记录我的得分

	public static int computerScore= 0;//记录电脑的得分

	public static String userName = "";//记录用户的姓名

	public static String computerName = "";//记录电脑的姓名

	public static int userNumber = 0;//记录用户的选择数字
	public static int computerNumber= 0;//记录电脑的选择数字
	public static void main(String[] args) {
		stareGames();//开始游戏
		getScore();//输出得分情况
		showResult();//输出结果
		System.out.println("感谢你的体验！欢迎下次再玩！");
		
	}
	public static void getScore() {//得分情况
		System.out.println("---------------------------------");
		System.out.println(userName+" " +" VS" +" " +computerName);
		System.out.println("对战次数为："+count);
		System.out.println("名字" +"-----------"+"得分");
		System.out.println(userName+"----------"+meScore);
		System.out.println(computerName+"----------"+computerScore);
		
	}
	public static void computerRole() {//电脑角色
		Scanner sc = new Scanner(System.in);
		System.out.print("请选择角色（1.刘备  2.孙权 3.曹操）：");
		userNumber= sc.nextInt();
		if(userNumber == 1) {
			computerName="刘备";
		}
		else if(userNumber == 2) {
			computerName="孙权";
		}
		else if(userNumber == 3) {
			computerName="曹操";
		}
		else {
			System.out.println("选择错误！");
		}
		
	}
	public static void computerGuess() {//电脑出拳
		computerNumber=(int)(Math.random()*3)+1;//生成1-3随机数
		switch(computerNumber) {
		case 1:
			System.out.println(computerName+"出拳：石头");
			break;
		case 2:
			System.out.println(computerName+"出拳：剪刀");
			break;
		case 3:
			System.out.println(computerName+"出拳：布");
			break;
		}
		
	}
	public static void userGuess() {//用户出拳
		Scanner sc = new Scanner(System.in);
		System.out.print("请出拳 1. 剪刀 2.石头 3.布 (输入相应的数字):");
		userNumber =sc.nextInt();
		switch(userNumber) {
		case 1:
			System.out.println(userName+"出拳：石头");
			break;
		case 2:
			System.out.println(userName+"出拳：剪刀");
			break;
		case 3:
			System.out.println(userName+"出拳：布");
			break;
		}
		
	}
	public static void showPrint() {//判断输赢
		if((computerNumber==1&& userNumber==1)||(computerNumber==2&& userNumber==2)||(computerNumber==3&& userNumber==3)){
			System.out.println("平局");
		}
			
		else if((computerNumber==1&& userNumber==2)||(computerNumber==2&& userNumber==3)||(computerNumber==3&& userNumber==1)){
			
			System.out.println(computerName+"赢啦！");//电脑获胜
			computerScore++;
	}
		else if((computerNumber==1&& userNumber==3)||(computerNumber==2&& userNumber==1)||(computerNumber==1&& userNumber==2)){
			
			System.out.println(userName+"赢啦！");//用户获胜
			meScore++;
		}
		else {
			System.out.println("没有结果！");
		}
	}
	public static void showResult() {//输出结果
		if(meScore== computerScore) {
			System.out.println("结果：打成平手，下次在和你一分高下！");
		}
		else if(meScore > computerScore) {
			System.out.println("结果：恭喜恭喜！");
		}
		else if(meScore < computerScore) {
			System.out.println("结果：哈哈，你输了 下次加油！");
		}
		else 
		{
			System.out.println("没有结果！");
		}
		
	}
	public static void stareGames() {//开始游戏
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------欢迎进入游戏世界---------------------------");
		System.out.println("*******************************************************");
		System.out.println("************************猜拳 开始********************");
		System.out.println("*******************************************************");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		computerRole();//调用电脑角色选择
		System.out.print("请输入你的名字：");
		userName = sc.next();
		System.out.println(userName+" "+"VS" +" " +computerName+"对战");
		System.out.print("\n要开始吗？（y/n):");
		String s = sc.next();
		if(s.equals("y")) {
			for (s="";!s.equals("n");) {
				userGuess();//用户出拳
				computerGuess();//电脑出拳
				showPrint();//判断输赢
				count++;//对战次数加一
				System.out.print("是否继续下一轮？（y/n):");
				s = sc.next();
				
			}
		}
			else {
				System.out.println("感谢你的体验， 欢迎下次再玩！");
			}
		}
		
	}
