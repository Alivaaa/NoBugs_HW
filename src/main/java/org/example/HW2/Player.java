package org.example.HW2;

public class Player {
    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseLevel() {
        this.level++;
    }

    public void addScore(int poits) {
        this.score++;
    }

    public void printPlayerInfo() {
        System.out.println("Игрок: " + this.nickname + " Уровень: " + this.level + " Очки: " + this.score);
    }
}
