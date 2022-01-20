package ru.andersen.app.user_patterns.ilnaz.randomizer;

import java.util.Locale;

import static ru.andersen.app.user_patterns.ilnaz.randomizer.ListOfStudents.students;

public class Random {

    private Student randomStudentAskQuestion() {
        boolean areFind = false;

        Student student = students.get((int) (Math.random() * (33 - (1) + 1)));
        while (!areFind) {
            if (student.isQuestion() || !student.isPresent()) {
                randomStudentAskQuestion();
            }
            areFind = true;
        }
        return student;
    }

    private Student randomStudentAnswers() {
        boolean areFind = false;
        while (!areFind) {
            Student student = students.get((int) (Math.random() * (33 - (1) + 1)));
            if (student.isAnswer() || !student.isPresent()) {
                randomStudentAnswers();
            }
            areFind = true;
            return student;
        }
        return null;
    }

    public void coupleRandomStudent() {
        boolean areFind = false;
        while (!areFind) {
            Student studentQuestion = randomStudentAskQuestion();
            Student studentAnswer = randomStudentAnswers();
            if (studentQuestion.getId() == studentAnswer.getId() || studentQuestion.getTeamId() == studentAnswer.getTeamId()) {
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
