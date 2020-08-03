#include<iostream>
#include<queue>
#include<list>
using namespace std;

int numberth(int n, int m) {
	queue<pair<int, int>> papers;
	list<int> priority;
	int input, count=0;
	pair<int, int> target, curr;
	for (int j = 0; j < n; j++) {
		cin >> input;
		priority.push_back(input);
		papers.push(pair<int, int>(input, j));
		if (j == m) {
			target.first = input;
			target.second = j;
		}
	}
	priority.sort();
	priority.reverse();
	while (1) {
		curr = papers.front();
		if (curr.first < priority.front()) {
			papers.pop();
			papers.push(curr);
		}
		else {
			++count;
			if (curr.second == target.second)
				break;
			papers.pop();
			priority.pop_front();
		}
	}
	return count;
}

int main() {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	int testCase, n, m;
	cin >> testCase;
	for (int i = 0; i < testCase; i++) {
		cin >> n >> m;
		cout << numberth(n, m) << '\n';
	}
}

/*
Q�� ������ ��´�
�߿䵵�� ��´�
������ �߿䵵�� ���� ����
test case
������ ��, �� ������ �μ�Ǿ����� �ñ��� ������ ���� ť������ ��ġ
ť�� 0�� ���� ����
�켱���� ���� ������ ť����
0��° ��ġ�� �ִ� ������ �� ��°�� �μ�ǳ�!
(���� �� - �켱����)
1.�켱���� �˻�(���� ���� �ִ��� Ȯ��)
a b c d e f g
c d e f g a b
*/