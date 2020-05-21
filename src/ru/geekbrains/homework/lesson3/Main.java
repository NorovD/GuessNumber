package ru.geekbrains.homework.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        System.out.println("Угадайте число от 0 до 9. У вас 3 попытки.");


         do{
            getResult();
            System.out.println("Ещё разок?");
            System.out.println("1.Да 0.Нет");
            int answer = scanner();
            if(answer==1){
                System.out.println("Угадайте число от 0 до 9. У вас 3 попытки.");
                continue;

            }
            else {
                break;
            }



        }while (true);
        scanner.close();


    }
    static  void getResult(){
        Random rand=new Random();
        int randomNumber = rand.nextInt(10);

             for(int turn=0;turn<3;++turn) {


                 int inputNumber=scanner();
                 System.out.println(randomNumber);



                 if (inputNumber == randomNumber) {
                     System.out.println(("Ответ верный!!!"));
                     break;

                 } else if (inputNumber < randomNumber) {
                     System.out.println("Загаданное число больше");


                 } else {
                     System.out.println("Загаданное число меньше");

                 }


             }


    }

    private static int scanner(){
        int inputNumber = scanner.nextInt();
        return inputNumber;

    }


}
