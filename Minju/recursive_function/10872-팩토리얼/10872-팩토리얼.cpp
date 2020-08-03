#include<iostream>
using namespace std;
int factorial(int num) {
	int result=1;
	if (num > 1) {
		result = num * factorial(num - 1);
	}
	return result;
}

int main() {
	int num;
	scanf("%d", &num);
	printf("%d", factorial(num));
}