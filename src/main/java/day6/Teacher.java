package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String facultative;
    public Teacher(String name, String facultative){
        this.name = name;
        this.facultative = facultative;
    }

    public void evaluate(Student student){
     Random random = new Random();
     int score = random.nextInt(4) + 2;
       String grade = "";

        switch (score){
            case 2:
              grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
               break;
            case 4:
                    grade = "хорошо";
                    break;
            case 5:
                grade = "отлично";
                    break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " +
                              facultative +  " на оценку " + grade);
    }
}
