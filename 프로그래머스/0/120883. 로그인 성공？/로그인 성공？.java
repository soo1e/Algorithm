class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (String[] member : db) {
            String id = member[0];
            String pw = member[1];

            // 아이디와 비밀번호가 모두 일치하는 회원이 있는지 확인
            if (id.equals(id_pw[0]) && pw.equals(id_pw[1])) {
                return "login";
            }
        }

        // 아이디는 일치하지만 비밀번호가 일치하는 회원이 없는 경우
        for (String[] member : db) {
            String id = member[0];
            String pw = member[1];

            if (id.equals(id_pw[0]) && !pw.equals(id_pw[1])) {
                return "wrong pw";
            }
        }

        // 아이디가 일치하는 회원이 없는 경우
        return "fail";
    }
}
