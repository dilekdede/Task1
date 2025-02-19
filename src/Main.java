import enums.ProcessType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean str= true;

        while (str) {
            System.out.println("Yapacağınız işlem için menüden sayı giriniz , Çıkmak için 0 giriniz");

            Scanner input = new Scanner(System.in);
            System.out.println("1." + ProcessType.SUM.getName());
            System.out.println("2." + ProcessType.SUBTRACTION.getName());
            System.out.println("3." + ProcessType.MULTIPLICATION.getName());
            System.out.println("4." + ProcessType.DIVISION.getName());
            System.out.println("5." + ProcessType.EXPONENTIATION.getName());
            System.out.println("6." + ProcessType.SQUARE.getName());

            int operation = input.nextInt();

            if(operation==0){
                System.out.println("İşlem yapılmayacaktır..");
                str=false;
            }else if(operation>6){
                System.out.println("Geçersiz işlem seçimi");
            } else {
                int processType = getProcessType(ProcessType.findByCode(operation));
                calculate(processType);
            }
        }
    }

    private static void calculate(int processType){
        Scanner input= new Scanner(System.in);
        if(processType==ProcessType.SUM.getCode()){
            sum(input);
        }

        else if(processType==ProcessType.SUBTRACTION.getCode()){
            subtraction(input);

        }
        else if(processType==ProcessType.MULTIPLICATION.getCode()){
            multiplication(input);
        }

        else if(processType==ProcessType.DIVISION.getCode()){
            division(input);
        }
        else if (processType==ProcessType.EXPONENTIATION.getCode()) {
            exponentiation(input);
        }
        else if(processType==ProcessType.SQUARE.getCode()){
            square(input);
        }
        else{
            System.out.println("Geçersiz işlem seçimi.");
        }
    }

    private static Integer getProcessType(ProcessType process){
        return switch (process) {
            case SUM -> ProcessType.SUM.getCode();
            case SUBTRACTION -> ProcessType.SUBTRACTION.getCode();
            case MULTIPLICATION -> ProcessType.MULTIPLICATION.getCode();
            case DIVISION -> ProcessType.DIVISION.getCode();
            case EXPONENTIATION -> ProcessType.EXPONENTIATION.getCode();
            case SQUARE -> ProcessType.SQUARE.getCode();
            default -> null;
        };
    }


    private static void square(Scanner input) {
        System.out.println("Karekökünü almak istediğiniz sayıyı giriniz");
        double number= input.nextInt();
        double result=Math.sqrt(number);
        System.out.println("Sonuç: "+result);
    }

    private static void exponentiation(Scanner input) {
        System.out.println("Taban değerini giriniz.");
        double number1 = input.nextInt();
        System.out.println("Üs değerini giriniz.");
        double number2 = input.nextInt();

        double result = Math.pow(number1,number2);
        System.out.println("Sonuç: "+result);
    }

    private static void division(Scanner input) {
        System.out.println("İşlem yapacağınız sayı adetini giriniz.");
        int counter= input.nextInt();
        System.out.println("1.Sayıyı giriniz");
        double result= input.nextDouble();
        for(int i=2;i<=counter;i++){
            System.out.println(i+" .sayıyı giriniz");
            int number=input.nextInt();
            result=result/number;

        }

        System.out.println("Sonuç:" +result);
    }

    private static void multiplication(Scanner input) {
        System.out.println("İşlem yapacağınız sayı adetini giriniz.");
        int counter= input.nextInt();

        double result= 1.0;
        for(int i=1;i<=counter;i++){
            System.out.println(i+" .sayıyı giriniz");
            int number=input.nextInt();
            result=result*number;

        }


        System.out.println("Sonuç:" +result);
    }

    private static void subtraction(Scanner input) {
        System.out.println("İşlem yapacağınız sayı adetini giriniz.");
        int counter= input.nextInt();
        System.out.println("1.Sayıyı giriniz");
        double result1= input.nextDouble();
        for(int i=2;i<=counter;i++){
            System.out.println(i+" .sayıyı giriniz");
            int number=input.nextInt();
            result1=result1-number;

        }

        double result=result1;
        System.out.println("Sonuç:" +result);
    }

    private static void sum(Scanner input) {
        System.out.println("İşlem yapacağınız sayı adetini giriniz.");
        int counter= input.nextInt();
        double sum =0;
        for(int i=1;i<=counter;i++){
            System.out.println(i+" .sayıyı giriniz");
            int number=input.nextInt();
            sum=sum+number;

        }

        double result=sum;
        System.out.println("Sonuç:" +result);

    }



}