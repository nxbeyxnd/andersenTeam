package ru.andersen.app.user_patterns.ilnaz.randomizer;

import java.util.Locale;

import static ru.andersen.app.user_patterns.ilnaz.randomizer.ListOfStudents.students;

public class Random {

    private Student randomStudentAskQuestion() {
        Student student = students.get((int) (Math.random() * (33 - (1) + 1)));
        while (student.isQuestion() || !student.isPresent()) {
            randomStudentAskQuestion();
        }
        return student;
    }

    private Student randomStudentAnswers() {
        Student student = students.get((int) (Math.random() * (33 - (1) + 1)));
        while (student.isAnswer() || !student.isPresent()) {
            randomStudentAnswers();
        }
        return student;
    }

    public void coupleRandomStudent() {
        boolean areFind = false;
        while (!areFind) {
            Student studentQuestion = randomStudentAskQuestion();
            Student studentAnswer = randomStudentAnswers();
            while (studentQuestion.getId() == studentAnswer.getId() || studentQuestion.getTeamId() == studentAnswer.getTeamId()) {
                studentAnswer = randomStudentAnswers();
            }
            studentQuestion.setQuestion(true);
            studentAnswer.setAnswer(true);
            System.out.println("Вопрос задает: "
                    + studentQuestion.getName().toUpperCase(Locale.ROOT) + " команда № " + studentQuestion.getTeamId() +
                    ".\nОтвечает: " + studentAnswer.getName().toUpperCase(Locale.ROOT) + " команда № " + studentAnswer.getTeamId() + ".");
            areFind = true;
        }

    }

}