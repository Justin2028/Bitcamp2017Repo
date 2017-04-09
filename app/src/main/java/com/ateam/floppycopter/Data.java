package com.ateam.floppycopter;

import java.util.AbstractCollection;

/**
 * Created by justi on 4/8/2017.
 */

public class Data {
    static String currPlayer = "";
    static enum DIFF {
        EASY,
        MEDIUM,
        HARD;
        public static DIFF difficulty;

        public void setDifficulty(DIFF d) {
            difficulty = d;
        }

        public DIFF getDifficulty() {
            if (difficulty == null) {
                difficulty = EASY;
                return difficulty;
            } else {
                return difficulty;
            }
        }
    }

    ;
    private static int hScores[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static String names[] = new String[10];

    public void setCurrPlayer(String name)
    {
        currPlayer = name;
    }
    public void newHighScore(int score, String ini) {
        if(names[0].equals(""))
        {
            for(int i = 0; i < 10; i++)names[i] = "aaa";
        }
        boolean inserted = false;
        int temp = 0, i;
        String tmp = "";
        for (i = 0; i < 10; i++) {
            if (score > hScores[i]) {
                temp = hScores[i];
                hScores[i] = score;
                tmp = names[i];
                names[i] = ini;
                inserted = true;
                i++;
                break;
            }
        }
        if (inserted) {
            for (; i < 10; i++) {
                if (temp != hScores[i]) {
                    temp ^= hScores[i];
                    hScores[i] ^= temp;
                    temp ^= hScores[i];
                }
                String tp = names[i];
                names[i] = tmp;
                tmp = tp;
            }
        }
    }
}
