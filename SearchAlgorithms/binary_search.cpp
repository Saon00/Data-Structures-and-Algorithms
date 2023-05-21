#include <bits/stdc++.h>
using namespace std;

#define fast ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0)
#define ll long long
#define endl "\n"
#define pf first
#define ps second
#define loop(i, a, b) for(int i = a; i < b; i++)
#define rev_loop(i, a, b) for(int i = a-1; i >= 0; i--)


ll binary_search() {
	int n, key, result; cin >> n;
	vector<int>v(n);
	for(int &i : v) cin >> i;
	sort(v.begin(), v.end());
	cin >> key;
	int l = 0 , h  = n-1 ;
	while (h - l > 1) {
		int m = ( h + l ) / 2;
		if( v[m] < key )  l = m + 1;
		else h = m;
	}

	if(v[l] == key) result = l + 1;
	else if(v[h] == key) result = h + 1;
	else result = -1; // when value not found return -1

	return result;
	
}

void solve(){
	cout << binary_search() << endl ;
}

signed main() {

	fast;
	ll tc = 1;
	//cin >> tc; // when test case needed 
	while (tc--){
		 solve();
		
	}

	return 0;
}
