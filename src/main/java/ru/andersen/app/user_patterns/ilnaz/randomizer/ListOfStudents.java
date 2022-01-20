package ru.andersen.app.user_patterns.ilnaz.randomizer;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {
     public static List<Student> students = new ArrayList<Student>();
        static {
            students.add(new Student(1, 1, true, "Ананьев Максим"));
            students.add(new Student(2, 1, true, "Симонов Юрий"));
            students.add(new Student(3, 1, true, "Полтораков Сергей"));
            students.add(new Student(4, 1, true, "Деревяго Роман"));
            students.add(new Student(5, 2, true, "Пятков Петр"));
            students.add(new Student(6, 2, true, "Гайниев Эдуард"));
            students.add(new Student(7, 2, true, "Карпенков Алексей"));
            students.add(new Student(8, 3, true, "Чернов Александр"));
            students.add(new Student(9, 3, true, "Белинский Виталий"));
            students.add(new Student(10, 4, true, "Шимарин Александр"));
            students.add(new Student(11, 4, true, "Ахметханов Ильдар"));
            students.add(new Student(12, 4, true, "Дашков Ильдар"));
            students.add(new Student(13, 4, true, "Войтенков Сергей"));
            students.add(new Student(14, 5, true, "Шерхонов Алексей"));
            students.add(new Student(15, 5, true, "Фатыхов Ильназ"));
            students.add(new Student(16, 5, true, "Цема Антон"));
            students.add(new Student(17, 6, true, "Занько Анна"));
            students.add(new Student(18, 6, true, "Егоров Михаил"));
            students.add(new Student(19, 6, true, "Валеев Вадим"));
            students.add(new Student(20, 7, true, "Нестерова Марина"));
            students.add(new Student(21, 7, true, "Епифанов Анатолий"));
            students.add(new Student(22, 7, true, "Шуляев Александр"));
            students.add(new Student(23, 7, true, "Асфандиаров Тимур"));
            students.add(new Student(24, 9, true, "Федоренко Станислав"));
            students.add(new Student(25, 9, true, "Азаев Марк"));
            students.add(new Student(26, 9, true, "Борисов Дмитрий"));
            students.add(new Student(27, 10, true, "Симаков Адександр"));
            students.add(new Student(28, 10, true, "Тоболев Денис"));
            students.add(new Student(29, 10, true, "Шкарпенкин Дмитрий"));
            students.add(new Student(30, 12, true, "Мороз Александр"));
            students.add(new Student(31, 12, true, "Сажин Виктор"));
            students.add(new Student(32, 12, true, "Шолков Василий"));
            students.add(new Student(33, 12, true, "Детский Ярослав"));

        }

    public Object getName(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student.getName();
        }
        return new RuntimeException("Студент не найден");
    }

    public Object getId(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student.getId();
        }
        return new RuntimeException("Студент не найден");
    }

    public Object getStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student;
        }
        return new RuntimeException("Студент не найден");
    }

    public Object getStudent(String name) {
        for (Student student : students) {
            if (student.getName() == name)
                return student;
        }
        return new RuntimeException("Студент не найден");
    }

    public void setQuestion(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                student.setQuestion(true);
        }
    }

    public void setAnswer(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                student.setQuestion(true);
        }
    }

    public Object getQuestion(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student.isQuestion();
        }
        return new RuntimeException("Студент не найден");
    }

    public Object getAnswer(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return (Object) student.isAnswer();
        }
        return new RuntimeException("Студент не найден");
    }

    public Object getPresent(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student.isPresent();
        }
        return new RuntimeException("Студент не найден");
    }
}