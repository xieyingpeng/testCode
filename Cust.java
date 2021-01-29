package workTest3;
import java.util.Scanner;
//用户类
public class Cust {
	String myGuess;
	int choice;
	static String name;
	public String  userName() {//用户角色
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的名字：");
		name = sc.nextLine();
		return name;
	}
	//public String  userNames() {//用户角色
		//System.out.println(name);
		//return name;
	//}
	//我的出拳
	public void guess(){
		Scanner input=new Scanner(System.in);
		Cust cust = new Cust();
		System.out.print("请出拳：1.剪刀 2.石头 3.布（输入相应的数字）：");
		choice=input.nextInt();
		switch(choice){
		case 1:
		 myGuess=(" 你出拳：剪刀");
		 break;
		case 2:
		 myGuess=(" 你出拳：石头");
		 break;
		case 3:
		 myGuess=(" 你出拳：布");
		 break;
		 
		} 
	}
	
}

