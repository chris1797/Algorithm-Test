package org.example;

import java.util.Scanner;

public class Main {

    String[] players = {"김철수", "이영희", "홍길동"};

    String[] callings = {"김철수", "이영희", "홍길동"};

    public void solution(String[] players, String[] callings) {

        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (j != 0 && callings[i].equals(players[j])) {
                    String winner = players[j];
                    String roser = players[j-1];
                    players[j-1] = winner;
                    players[j] = roser;
                }
            }
        }

        System.out.println(players);
    }

    public static void main(String[] args) {

    }
}