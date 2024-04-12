class Solution {
    public String solution(int a, int b) {
        // 각 월의 일 수를 배열에 저장합니다.
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 각 요일을 배열에 저장합니다.
        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        // 주어진 날짜까지의 전체 일 수를 계산합니다.
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysOfMonth[i];
        }
        totalDays += b - 1; // 해당 월의 일 수를 더합니다.
        
        // 2016년 1월 1일이 금요일이므로 금요일부터 시작하여 날짜를 계산합니다.
        int indexOfDay = (totalDays % 7 + 5) % 7; // 5는 금요일의 인덱스입니다.
        
        // 해당하는 요일을 반환합니다.
        return daysOfWeek[indexOfDay];
    }
}

