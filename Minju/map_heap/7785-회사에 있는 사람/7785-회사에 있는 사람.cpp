//7785. 회사에 있는 사람
#include<iostream>
#include<map>
using namespace std;

int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	
	int num;
    map<string, int> staff;	//string과 cha[]r의 속도차이?
	map<string, int>::reverse_iterator it;
	
	cin >> num;
	for (int i = num; i > 0; i--) {
		string name, record;
		cin >> name >> record;
		if (!record.compare("enter"))
			staff[name] = 0;
		else if (!record.compare("leave"))
			staff[name] = 1;
	}

	for (it = staff.rbegin(); it != staff.rend();it++) {	// 사용자 정의 클래스이며 객체 복사 비용이 확연히 비싸고 복잡한 경우에는 전위 증감을 쓰는 편이 낫다.STL은 차이 X
		if (it->second == 0) {
			cout << it->first << '\n';
		}
	}

	return 0;
}