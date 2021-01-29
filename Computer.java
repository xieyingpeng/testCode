package workTest3;
import java.util.Scanner;
public class Computer {
		String name;
		int score1,random,role;
		//选择电脑角色名
		public String computerName(){
	 	Scanner sc = new Scanner(System.in);
		System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）：");
		role=sc.nextInt();
		switch(role){
		case 1:
		 name="刘备";
		 break;
		case 2:
		 name="孙权";
		 break;
		case 3:
		 name="曹操";
		 break;
		}
		return name;
	}
		public String computerNames(){
		 	Scanner sc = new Scanner(System.in);
			//System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）：");
			//role=sc.nextInt();
			switch(role){
			case 1:
			 name="刘备";
			 break;
			case 2:
			 name="孙权";
			 break;
			case 3:
			 name="曹操";
			 break;
			}
			return name;
		}
	 public void guess(){
		  random=(int)(Math.random()*3)+1;
		  Computer cp = new Computer();
		  switch(random){
		  case 1:
			  System.out.println(computerNames()+"出拳：石头");
		  case 2:
		   System.out.println(computerNames()+"出拳：剪刀");
		   break;
		  case 3:
		   System.out.println(computerNames()+"出拳：布");
		   break;
		  }
	 }
}

