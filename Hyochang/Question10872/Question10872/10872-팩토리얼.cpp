#include <iostream>

using namespace std;

int factorial(int);

int main()
{
	int N;

	cin >> N;

	cout << factorial(N);

}

int factorial(int n)
{
	if (n == 0)
	{
		return 1;
	}

	else
	{
		return n * factorial(n - 1);
	}
}