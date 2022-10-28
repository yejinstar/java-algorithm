package org.example.hash;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        for (String pb : phone_book) {
            set.add(pb);
        }

        for(String pb : phone_book){
            for (int i = 0; i < pb.length(); i++) {
                if(set.contains(pb.substring(0,i))){
                    answer = false;
                }
            }
        }
        return answer;
    }
}
