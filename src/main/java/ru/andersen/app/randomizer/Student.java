package ru.andersen.app.randomizer;

public class Student {
    private Integer id;
    private Integer teamId;
    private Boolean present;
    private String name;
    private Boolean question;
    private Boolean answer;

    public Student() {
    }

    public Student(Student student) {
        this.id = student.id;
        this.teamId = student.teamId;
        this.present = student.present;
        this.name = student.name;
        this.question = student.question;
        this.answer = student.answer;
    }

    public Student(int id, int teamId, boolean present, String name) {
        this.id = id;
        this.teamId = teamId;
        this.present = present;
        this.name = name;
        question = false;
        answer = false;
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

