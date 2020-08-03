//7785. ȸ�翡 �ִ� ���
#include<iostream>
#include<map>
using namespace std;

int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	
	int num;
    map<string, int> staff;	//string�� cha[]r�� �ӵ�����?
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

	for (it = staff.rbegin(); it != staff.rend();it++) {	// ����� ���� Ŭ�����̸� ��ü ���� ����� Ȯ���� ��ΰ� ������ ��쿡�� ���� ������ ���� ���� ����.STL�� ���� X
		if (it->second == 0) {
			cout << it->first << '\n';
		}
	}

	return 0;
}