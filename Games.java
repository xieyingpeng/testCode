package workTest3;
import java.util.Scanner;
//��Ϸ��
public class Games{
	Scanner input=new Scanner(System.in);
	int i;
	int count;//��ս����
	int meScore;//�ҵĵ÷�
	int computerScore;//���ֵ÷�
	Computer cp=new Computer();//�������Զ���
	Cust cust=new Cust();//�����û�����
	
	
	//�ж�ʤ��
public void calResult(){
	//����ʤ
	if(cust.choice==1&&cp.random==1||cust.choice==2&&cp.random==2||cust.choice==3&&cp.random==3){
		computerScore++;
		i=3;   
	}
	//�û�ʤ
	if(cust.choice==1&&cp.random==3||cust.choice==2&&cp.random==2||cust.choice==3&&cp.random==1){
		meScore++;
		i=2;   
	}
	//˫�����
	if(cust.choice==1&&cp.random==2||cust.choice==2&&cp.random==1||cust.choice==3&&cp.random==3){
		i=1;
	}

}
//��ս����
	public  void  VS(){
		System.out.println(cust.userName()+" VS "+cp.name+" ��ս");
		//System.out.println("��ս����Ϊ��"+count);
	}
	//�÷����
	public void score(){
		System.out.println("��ս����Ϊ��"+count);
		System.out.println("����"+"-------"+"�÷�");
		System.out.println(cust.name+"-------"+"�÷�: "+meScore);
		System.out.println(cp.name+"-----"+"�÷�: "+computerScore);
	}

//�ж������Ӯ
public void showResult(){
	if(meScore==computerScore){
		System.out.println("��������ƽ�֣��´��ٺ���һ�ָ��£�");
	}else if(meScore>computerScore){
		System.out.println("�������ϲ��ϲ��");
	}else if(meScore<computerScore){
		System.out.println("������������´μ��Ͱ���");
	}
 
}


public void startGame(){
	System.out.println("=================��ӭ������Ϸ����================");
	System.out.println("**********************\n");
	System.out.println("---------��ȭ����ʼ -------\n");
	System.out.println("**********************\n");
	System.out.println("��ȭ����1.����2.ʯͷ3.��");
	cp.computerName();//��ӡ���Խ�ɫ
	//cust.userName();//��ӡ�û���ɫ
	VS();//��ӡ����vs
	System.out.print("\nҪ��ʼ�𣿣�y/n����");
	String answer=input.next();
	if(answer.equals("y")){
		for(answer="";!answer.equals("n");){
		  cust.guess();
		  System.out.println(cust.myGuess);
		  cp.guess();
		  calResult();
		  switch(i){
			   case 1:
				   System.out.println("\n�����ƽ�� ��ս��������\n");
				   break;
			   case 2:
				   System.out.println("\n�������ϲ����Ӯ�ˣ�\n");
				   meScore++;
				   break;
			   case 3:
				   System.out.println("\n���:������,��ò�Ŷ ������\n");
				   computerScore++;
				   break;
		   
		  }
		  count++;
		
		  System.out.print("�Ƿ������һ�֣�y/n��:");
		  answer=input.next();
		  System.out.println("**********************");
		 }
		 
		}else{
		 System.out.println("��л������飬��ӭ�´����棡");
			}  
		}
}
	
	
