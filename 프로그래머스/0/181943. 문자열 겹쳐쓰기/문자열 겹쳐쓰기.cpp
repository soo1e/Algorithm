#include<bits/stdc++.h>
using namespace std;

string solution(string my_string, string overwrite_string, int s) {
    string answer = my_string;

    for (int i = 0; i < overwrite_string.length(); ++i) {
        answer[s+i] = overwrite_string[i];
    }

    cout << answer << endl;

    return answer;
}