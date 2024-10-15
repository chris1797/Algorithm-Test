package org.example;

import java.util.HashMap;

public class 달리기경주 {

    public String[] solution(String[] players, String[] callings) {
        int size = players.length;

        // <이름, rank>
        HashMap<String, Integer> nameMap = new HashMap<>();


        for (int i = 0; i < size; i++) {
            nameMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            // 콜된 플레이어 현재 랭크
            int currentRank = nameMap.get(callings[i]);

            String temp = players[currentRank - 1];

            players[currentRank - 1] = callings[i];
            players[currentRank] = temp;

            nameMap.put(callings[i], currentRank - 1);
            nameMap.put(temp, currentRank);
        }

        return players;

    }
}
