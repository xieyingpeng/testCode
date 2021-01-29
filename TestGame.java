package workTest3;
public class TestGame {
	 /**
	  * 开始游戏
	  */
	 public static void main(String[] args) {
	  Games test=new Games();
	  	test.startGame();//开始游戏
	  	test.VS();//显示对战次数
		test.score();//显示得分
		test.showResult();//显示结果
	  System.out.println("\n感谢你的体验，游戏结束！欢迎再来挑战！");
	 }

	
}
