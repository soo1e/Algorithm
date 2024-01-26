#include<bits/stdc++.h>
using namespace std;
string str;
int n;

int main() {
    string fullstr;
    cin >> str >> n;

    for (int i = 0; i < n; ++i) {
        fullstr = fullstr + str;
    }

    cout << fullstr << '\n';
}