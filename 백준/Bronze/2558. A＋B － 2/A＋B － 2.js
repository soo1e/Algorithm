/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 */

const [A, B] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
// const [A, B] = require('fs').readFileSync('input.txt').toString().trim().split('\n');

console.log(parseInt(A) + parseInt(B));