package org.example.hash;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        for (String pb : phone_book) {
            set.add(pb); // phone_book에 있는 전화번호들을 HashSet 에 넣어준다.
        }

        for (String pb : phone_book) { // phone_book에 있는 모든 전화번호
            for (int i = 0; i < pb.length(); i++) { // 전화번호를 숫자 하나씩 늘려가며
                if (set.contains(pb.substring(0, i))) { // HashSet 에 저장된 데이터랑 비교하며 접두사가 되는지 여부를 확인
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        String[] arr = {"118", "97674223", "1195524421"};
        System.out.println(phoneBook.solution(arr));
    }
}
