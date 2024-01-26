#include<bits/stdc++.h>
using namespace std;
string str;
int main() {
    cin >> str;
    string changedStr = str;

    for (int i = 0; i < str.length(); ++i) {
        if (isupper(str[i])) {
            changedStr[i] = tolower(str[i]);
        } else {
            changedStr[i] = toupper(str[i]);
        }
    }
    cout << changedStr << '\n';
}