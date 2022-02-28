package com.company;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello word! , hi is this teja");
        int num1 = ((12 * 33) - 12);
        int num2 = 33 / 5;
        float num3 = 33f / 5f;
        double num = 33d / 5d;
        float pound = 200f;
        double num4 = 300d;
        char unicode = '\u1F61';
        String myString = "hi this is teja";
        myString = myString + ", how are you.";
        myString = myString + "\u2764";

        double number = 20;
        double  number1= 80;
        double res = ((80 + 20) * 25);
        double re = res % 40;
        if (re <= 20) {
//            System.out.println("Total was over limit");
        }
        float result = pound * 0.45359237f;

//        System.out.println(num1 + num2);
//        System.out.println("the value of num " + num1);
//        System.out.println(num2);
//        System.out.println(num3+"f");
//        System.out.println(num+"d");
//        System.out.println(num4+"d");
//        System.out.println(pound+"f");
//        System.out.println(result);
//        System.out.println(unicode);
//        System.out.println(myString);
//        System.out.println(res);
//        System.out.println(re);

//example:1 (variables and dataTypes)
        double var = 20;
        double var2 = 80;
        double total = var + var2;
//        System.out.println(total);
        total *= 25;
//        System.out.println(total);
        total %= 40;
//        System.out.println(total);
        if (total <= 20) {
//            System.out.println("total was over the limit");
        }

//example:2 (codeBlocks)
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
//            System.out.println(finalScore);
        }
//example:5(switch case)
        String name = "MoHaN";
        switch (name.toLowerCase()) {
            case "pooja":
                System.out.println("pooja is found ");
                break;
            case "mohan":
                System.out.println("mohan is found " );
                break;
            case "jaya": case "ramana": case "teja":
                System.out.println("it is jaya or ramana or teja");
                System.out.println("it is "+name);
                break;
            default:
                System.out.println("it is not found ");
        }

//example:3 (methods)
//        int highScorePosition = calculated(200);
//        highScore("tom",highScorePosition);
//        highScorePosition = calculated(2500);
//        highScore("jon",highScorePosition);
//        highScorePosition = calculated(500);
//        highScore("rose",highScorePosition);

//        calcFeetAndInchesToCentimeter(6,4);
//        calcFeetAndInchesToCentimeter(24);
//        calcFeetAndInchesToCentimeter(-24);
//        calcFeetAndInchesToCentimeter(24);

//        Practise.someFunction();
//        Practise.userInput();
//        Practise.minAndMax();

//        BankAccount binsAccount= new BankAccount("23444",1452.0,"pooja","aa@gmail.com","254123654225");
//        System.out.println(binsAccount.getBalance());
//        binsAccount.setBalance(1000);
//        binsAccount.deposit(4000);
//        binsAccount.withDraw(3000);
//        loan loan=new loan("55545",142.22,"teja","jiuh@gmail.com","254121",4555,147852147,4,5);
//        loan.withDraw(140);
    }
    public static void highScore(String playerName, int score) {
        System.out.println(playerName +" "+ "managed to get into position"
               +" " + score  +" " + "on the high score table.");
    }
    public static int calculated(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100 ) {
            return 3;
        } else {
            return 4;
        }//we can create many same name public static but parameters are different;
    }
//example:4 (method over loading)
    //display calculation part in main (example-3)
    public static double calcFeetAndInchesToCentimeter(double feet,double inches) {
        if((feet < 0)||(inches < 0 || inches > 12)) {
            System.out.println("invalid feet and inches");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + "feet," + inches + "inch = "+ centimeter + "cm");
        return centimeter;
    }
    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches<0) {
            System.out.println("invalid inches");
            return -1;
        }
        double feet =inches/12;
        double remainingInches = inches % 12;
        System.out.println(inches +"inches is equal to " + feet +"feet and " +remainingInches +"inches");
        return calcFeetAndInchesToCentimeter(feet,inches);
    }


}


