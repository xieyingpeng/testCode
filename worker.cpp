#include<iostream>
#include "worker.h"
using namespace std;
int main() {
	Worker* w;//����ָ��
	w = new AWorker((char*)"A Worker", (char*)"B address", 200);
	w->printInfo();//����ָ��ָ��Ƽ�����
	w = new BWorker((char*)"C Worker", (char*)"C address", 80, 30);
	w->printInfo();
	system("pause");
	return 0;

}