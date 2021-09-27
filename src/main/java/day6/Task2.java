package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1970, 70, 162);
        airplane.info();
        airplane.setYear(1989);
        airplane.setLength(75);
        airplane.fillUp(183380);
       // airplane.info();
        airplane.fillUp(241140);
        airplane.info();

    }
}
