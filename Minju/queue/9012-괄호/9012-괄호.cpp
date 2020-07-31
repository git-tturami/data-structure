#include<iostream>
#include<stack>
#include<string>
using namespace std;

void isVps(char pString[51], int size) {
	stack<char>parenthesis;
	for (int j = 0; j < size; j++) {
		if (pString[j] == '(')
			parenthesis.push(pString[j]);
		else {
			if (parenthesis.empty()) {
				cout << "NO" << '\n';
				return;
			}
			parenthesis.pop();
		}

	}
	if (parenthesis.empty()) 
		cout << "YES" << '\n';	//대문자 소문자...기억1.1.....
	else
		cout << "NO" << '\n';
	return;
}

int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);

	int num, size;
	cin >> num;
	
	for (int i = 0; i < num; i++) {
		char pString[51];
		cin >> pString;
		size = strlen(pString);
		isVps(pString, size);
	}
	return 0;
}