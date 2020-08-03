#include<iostream>
#pragma warning (disable: 4996)
void hanoiTop(int n, int from, int to, int other) {
	if (n == 0) { return; }
	hanoiTop(n - 1, from, other, to);
	printf("%d %d\n", from, to);
	hanoiTop(n - 1, other, to, from);	
}

int main() {
	 
	int n, count = 1;
	scanf("%d", &n);
	count = (1 << n) - 1;
	printf("%d\n", count);
	hanoiTop(n, 1, 3, 2);
}
