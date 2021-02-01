#include<iostream>
#include "worker.h"
using namespace std;
int main() {
	Worker* w;//基类指针
	w = new AWorker((char*)"A Worker", (char*)"B address", 200);
	w->printInfo();//基类指针指向计件工人
	w = new BWorker((char*)"C Worker", (char*)"C address", 80, 30);
	w->printInfo();
	system("pause");
	return 0;

}