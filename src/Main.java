import Models.student;

public class Main
    {
    public static void main(String[] args)
        {

        student mario = new student();
        student pino = new student();

        mario.setGrades(25);
        mario.setGrades(26);
        mario.setGrades(27);
        pino.setGrades(20);
        pino.setGrades(22);
        pino.setGrades(24);



        System.out.println("\n" + mario.getGrades());
        int mediaMario = mario.getAverageGrade();
        System.out.println("\n Media : " + mediaMario);

        System.out.println("\n" + pino.getGrades());
        int mediaPino = pino.getAverageGrade();
        System.out.println("\n Media : " + mediaPino);
         }
    }