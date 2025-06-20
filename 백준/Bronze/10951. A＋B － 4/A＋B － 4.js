/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */

const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
// const input = require('fs').readFileSync('input.txt').toString().trim().split('\n');

for (let i = 0; i < input.length; i++) {
    const [A, B] = input[i].split(' ').map(Number);
    console.log(A + B);
}