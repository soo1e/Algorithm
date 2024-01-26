#include<bits/stdc++.h>
using namespace std;

int solution(vector<int> array) {
    sort(array.begin(), array.end());
    int n = array.size();

    if (n % 2 == 0) {
        // 짝수 길이 배열의 경우, 중앙에 위치하는 두 수의 평균 반환
        return (array[(n / 2) - 1] + array[n / 2]) / 2;
    } else {
        // 홀수 길이 배열의 경우, 중앙 값 반환
        return array[n / 2];
    }
}