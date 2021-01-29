package workTest3;
import java.util.Scanner;
//游戏类
public class Games{
	Scanner input=new Scanner(System.in);
	int i;
	int count;//对战次数
	int meScore;//我的得分
	int computerScore;//对手得分
	Computer cp=new Computer();//创建电脑对象
	Cust cust=new Cust();//创建用户对象
	
	
	//判定胜负
public void calResult(){
	//电脑胜
	if(cust.choice==1&&cp.random==1||cust.choice==2&&cp.random==2||cust.choice==3&&cp.random==3){
		computerScore++;
		i=3;   
	}
	//用户胜
	if(cust.choice==1&&cp.random==3||cust.choice==2&&cp.random==2||cust.choice==3&&cp.random==1){
		meScore++;
		i=2;   
	}
	//双方打和
	if(cust.choice==1&&cp.random==2||cust.choice==2&&cp.random==1||cust.choice==3&&cp.random==3){
		i=1;
	}

}
//对战次数
	public  void  VS(){
		System.out.println(cust.userName()+" VS "+cp.name+" 对战");
		//System.out.println("对战次数为："+count);
	}
	//得分情况
	public void score(){
		System.out.println("对战次数为："+count);
		System.out.println("名字"+"-------"+"得分");
		System.out.println(cust.name+"-------"+"得分: "+meScore);
		System.out.println(cp.name+"-----"+"得分: "+computerScore);
	}

//判定最后输赢
public void showResult(){
	if(meScore==computerScore){
		System.out.println("结果：打成平手，下次再和你一分高下！");
	}else if(meScore>computerScore){
		System.out.println("结果：恭喜恭喜！");
	}else if(meScore<computerScore){
		System.out.println("结果：哈哈，下次加油啊！");
	}
 
}


public void startGame(){
	System.out.println("=================欢迎进入游戏世界================");
	System.out.println("**********************\n");
	System.out.println("---------猜拳，开始 -------\n");
	System.out.println("**********************\n");
	System.out.println("出拳规则：1.剪刀2.石头3.布");
	cp.computerName();//打印电脑角色
	//cust.userName();//打印用户角色
	VS();//打印对手vs
	System.out.print("\n要开始吗？（y/n）：");
	String answer=input.next();
	if(answer.equals("y")){
		for(answer="";!answer.equals("n");){
		  cust.guess();
		  System.out.println(cust.myGuess);
		  cp.guess();
		  calResult();
		  switch(i){
			   case 1:
				   System.out.println("\n结果：平局 决战到天亮！\n");
				   break;
			   case 2:
				   System.out.println("\n结果：恭喜，你赢了！\n");
				   meScore++;
				   break;
			   case 3:
				   System.out.println("\n结果:你输了,你好菜哦 哈哈！\n");
				   computerScore++;
				   break;
		   
		  }
		  count++;
		
		  System.out.print("是否继续下一轮（y/n）:");
		  answer=input.next();
		  System.out.println("**********************");
		 }
		 
		}else{
		 System.out.println("感谢你的体验，欢迎下次再玩！");
			}  
		}
}
	
	
