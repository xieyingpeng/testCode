//实现一个猜数字大小的游戏
package workTest1;
import java.util.Scanner;
public class HomeWork1 {

	public static void main(String[] args) {
		boolean flag =dengLu(4);
		if(flag){
			caiShuZi(7) ;
			
		}
		
	}
	public static int caiShuZi(int n) {//猜数字
		int random = (int)(Math.random()*100)+1;//生成随机数1-100
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<n;i++) {
			System.out.print("请输入你要猜的数字：");
			int a = sc.nextInt();
			if(a<random) {
				System.out.println("大哥，你猜小了！");
				System.out.println("你还有"+(n-i)+"次机会");
			}
			else if (n>random) {
				System.out.println("大哥，你猜大了");
				System.out.println("你还有"+(n-i)+"次机会");
				
			}
			else {
				System.out.println("恭喜你答对了！");
				break;
			}
			if(i==(n-1)) {
				System.out.println("感谢你的体验，欢迎下次再玩！");
			}
		}
		return random;
	}
	public static boolean dengLu(int n) {//登录
		System.out.println("欢迎进入游戏！");
		System.out.println("------------------------------");
		Scanner  sc = new Scanner(System.in);
		String str="123456";//默认密码
		boolean flag = false;
		for (int i =0 ; i<n;i++) {
			System.out.print("请输入用户名：");
			String name = sc.nextLine();
			System.out.print("请输入你的 密码（默认密码为：123456）：");
			String password = sc.nextLine(); 
			if(password.equals(str)) {
				System.out.println("登录成功！");
				System.out.println("欢迎体验，开始游戏！");
				System.out.println("------------------------------");
				 flag = true;
				 break;
			
			}
			else if(password !=("123456")) {
				System.out.println("你还有"+(n-i)+"次机会");
				
			}
			if(i==(n-1)) {
				System.out.println("登录次数已经用完，已退出游戏！");
				
			}
		}
		return flag;
	}
	

}
