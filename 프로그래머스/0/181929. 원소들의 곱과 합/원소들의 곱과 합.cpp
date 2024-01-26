#include<bits/stdc++.h>
using namespace std;

int solution(vector<int> num_list) {
    int sum = 0;
    int gob = 1;
    for (int i = 0; i < num_list.size(); ++i) {
        sum = sum + num_list[i];
        gob = gob * num_list[i];
    }
    int square = sum * sum;
    if (gob < square) {
        return 1;
    } else {
        return 0;
    }
}