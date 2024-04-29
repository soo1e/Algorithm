class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;

        // 각 배열의 합을 계산
        for (int num : arr1) {
            sumArr1 += num;
        }
        for (int num : arr2) {
            sumArr2 += num;
        }

        // 배열의 길이에 따른 대소관계 판단
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else { // 배열의 길이가 같을 때, 합을 비교하여 대소관계 판단
            if (sumArr1 > sumArr2) {
                return 1;
            } else if (sumArr1 < sumArr2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
