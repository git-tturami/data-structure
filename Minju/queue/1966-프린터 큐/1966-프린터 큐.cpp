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
Q에 문서를 담는다
중요도를 담는다
문서와 중요도가 같이 담긴다
test case
문서의 수, 몇 번쨰로 인쇄되었는지 궁금한 문서가 현재 큐에서의 위치
큐는 0번 부터 시작
우선순위 별로 정리된 큐에서
0번째 위치에 있는 문서는 몇 번째로 인쇄되냐!
(문서 수 - 우선수위)
1.우선순위 검사(같은 숫자 있는지 확인)
a b c d e f g
c d e f g a b
*/