package ru.andersen.app.user_patterns.ilnaz.randomizer;

import ru.andersen.app.user_patterns.ilnaz.randomizer.Student;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;

import static ru.andersen.app.user_patterns.ilnaz.randomizer.ListOfStudents.students;

public class RandomUserApp {
    Random random = new Random();
    private Student randomStudentAskQuestion() {
        List<Student> s = students.stream()
                .filter(x -> !x.isQuestion())
                .collect(Collectors.toList());
        if (s.isEmpty()) return null;
        return s.get(random.nextInt(s.size()));
    }

    private Student randomStudentAnswers(Student first, Student student) {
        List<Student> s = students.stream()
                .filter(x -> !x.equals(student))
                .filter(x -> !x.equals(first))
                .filter(x -> !x.isAnswer())
                .filter(x -> !(x.getTeamId() == student.getTeamId()))
                .collect(Collectors.toList());
        if (s.isEmpty()) return null;
        return s.get(random.nextInt(s.size()));
    }

    private List<Student> showStudentsWithoutAnswer() {
        return students.stream()
                .filter(x -> !x.isAnswer() || !x.isQuestion())
                .collect(Collectors.toList());
    }

    private void printResult(Student s1, Student s2) {
        System.out.println("Вопрос задает: "
                + s1.getName().toUpperCase(Locale.ROOT) + " команда № " + s1.getTeamId() +
                ".\nОтвечает: " + s2.getName().toUpperCase(Locale.ROOT) + " команда № " + s2.getTeamId() + ".");
    }
    public void coupleRandomStudent() {
        Student studentQuestion = randomStudentAskQuestion();
        Student first = studentQuestion;
        int i = 0;
        while (true) {
            System.out.println(i++);
            Student studentAnswer = randomStudentAnswers(first, studentQuestion);
            if (studentAnswer == null) {
                studentAnswer = first;
                printResult(studentQuestion, studentAnswer);
                break;
            }
            studentQuestion.setQuestion(true);
            studentAnswer.setAnswer(true);
            printResult(studentQuestion, studentAnswer);
            studentQuestion = studentAnswer;
        }
    }
}