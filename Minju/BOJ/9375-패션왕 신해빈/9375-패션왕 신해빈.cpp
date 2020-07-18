#include<iostream>
#include<unordered_map>
using namespace std;

int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);

	int testCase, num, combi;
	string name, sort;				//for문에 넣어 새로만드는것 vs 기존꺼 쓰는것 뭐가 빠르거나 메모리가 좋을까?
	unordered_map<string, int> costume;
	unordered_map<string, int>::iterator it;

	cin >> testCase;
	while (testCase--) {
		combi = 1;
		cin >> num;
		//input data
		for (; num > 0; num--) {	
			cin >> name >> sort;
			costume[sort]++;		//c++ initialize key to 0 
		}
		//calculate combination
		num = costume.size();
		for (it = costume.begin(); it != costume.end(); it++)
		{
			combi *= it->second + 1;
		}
		cout << combi - 1 << '\n';
		costume.clear();
	}
	return 0;
}