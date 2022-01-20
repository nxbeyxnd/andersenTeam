package ru.andersen.app.user_patterns.ilnaz.randomizer;

public class Student {
    private int id;
    private int teamId;
    private boolean present;
    private String name;
    private boolean question;
    private boolean answer;

    public Student(int id, int teamId, boolean present, String name) {
        this.id = id;
        this.teamId = teamId;
        this.present = present;
        this.name = name;
    }

    public boolean isPresent() {
        return present;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", question=" + question +
                ", answer=" + answer +
                '}';
    }

    public void setQuestion(boolean question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

}

