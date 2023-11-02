function isPrime(num) {
    if (num <= 1) {
        return false;
    }
    for (let i = 2; i * i <= num; i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

function solution(nums) {
    let count = 0;
    const n = nums.length;

    // 3개의 숫자로 만들 수 있는 모든 조합을 확인
    for (let i = 0; i < n - 2; i++) {
        for (let j = i + 1; j < n - 1; j++) {
            for (let k = j + 1; k < n; k++) {
                const sum = nums[i] + nums[j] + nums[k];
                // 합이 소수인지 판별하여 count 증가
                if (isPrime(sum)) {
                    count++;
                }
            }
        }
    }

    return count;
}