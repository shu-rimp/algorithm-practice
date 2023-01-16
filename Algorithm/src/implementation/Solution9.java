package implementation;

import java.util.*;

// Programmers 개인정보 수집 유효기간
class Solution9 {

    public int[] solution(String today, String[] terms, String[] privacies) {

        String[] splitedToday =  today.split("\\.");
        int convertedToday = Integer.parseInt(splitedToday[0]) * 12 * 28
                + Integer.parseInt(splitedToday[1]) * 28
                + Integer.parseInt(splitedToday[2]);

        Map<String, Integer> expireDates = new HashMap<>();
        List<UserPrivacy> userList = new ArrayList<>();

        for(String term: terms) {
            String[] splitedTerm = term.split(" ");
            expireDates.put(splitedTerm[0], Integer.parseInt(splitedTerm[1]) * 28);
        }

        int userId = 1;
        for(String privacy: privacies) {
            UserPrivacy user = new UserPrivacy();

            String[] splitedPrivacy = privacy.split(" ");
            String[] splitedPrivacyExpire = splitedPrivacy[0].split("\\.");

            user.acceptedAt = Integer.parseInt(splitedPrivacyExpire[0]) * 12 * 28
                    + Integer.parseInt(splitedPrivacyExpire[1]) * 28
                    + Integer.parseInt(splitedPrivacyExpire[2])
                    - 1;

            user.type = splitedPrivacy[1];
            user.id = userId;

            userId++;

            userList.add(user);
        }

        return userList.stream()
                .filter(user -> user.acceptedAt < convertedToday - expireDates.get(user.type))
                .map(user -> user.id)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // TODO: delete before submit
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(sol.solution(today, terms, privacies)));
    }
}

class UserPrivacy {
    public int id;
    public String type;
    public int acceptedAt;
}
