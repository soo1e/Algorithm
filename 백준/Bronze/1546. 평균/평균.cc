#include <iostream>
using namespace std;

int N;
int A[1000];


int main() {
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }

    long MAX = 0;
    long sum = 0;
    for (int i = 0; i < N; i++) {
        if (MAX < A[i]) {
            MAX = A[i];
        }
        sum = sum + A[i];
    }

    double avg =  (double)sum * 100.0 / (double)MAX / N;
    cout << avg << "\n";
}