#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int>arr[200000];
bool visit[200000];
int order[200000];
int n, m;
int a = 0;

void dfs(int x)
{
	if (visit[x])
		return;

	visit[x] = true;
	order[x] = a++;
	for (int i = 0; i < arr[x].size(); i++)
	{
		if (!visit[arr[x][i]]) {
			dfs(arr[x][i]);

		}
	}
}

struct compare {
	bool operator()(int const& i, int const& j) const {
		return i > j;
	}
};

int main() {

	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	cout.tie(nullptr);

	int r;
	cin >> n >> m >> r;

	for (int i = 1; i <= n; i++) {
		visit[i] = false;
		order[i] = -1;
	}

	int u, v;

	for (int i = 1; i <= m; i++) {
		cin >> u >> v;
		arr[u].push_back(v);
		arr[v].push_back(u);
	}

	for (int i = 1; i <= n; i++) {
		sort(arr[i].begin(), arr[i].end());
	}

	dfs(r);

	for (int i = 1; i <= n; i++) {
		cout << order[i]+1 << '\n';
	}
}
