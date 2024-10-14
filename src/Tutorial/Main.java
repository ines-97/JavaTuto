package Tutorial;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //variables
        int x;//declaration
        x=123;//assignment
        float y=123.2f;//initialization
        System.out.println("hello to java expert world ");
        System.out.println(x+"      "+y);

    //Scanners
        Scanner n = new Scanner(System.in);//initilization of scanner

        System.out.println("name:");
        String name = n.nextLine();//call the method for string->nextLine()
        System.out.println("age");
        int age = n.nextInt();//call the method for int->nextInt()
        n.nextLine();//clean the scanner to use nextLine() again
        System.out.println("food");
        String food = n.nextLine();
        System.out.println("wight");
        String wight = n.nextDouble();//call fot the double method->nextDouble

        System.out.println(name);//print variables of the scanner
        System.out.println(age);
        System.out.println(food);
        n.close();//close scanner


    //GUI
        String nom= JOptionPane.showInputDialog("enter your name") ;//message all the time are string
        JOptionPane.showMessageDialog(null,"hello "+nom);

        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your name")); //convert it into int if it needed
        JOptionPane.showMessageDialog(null,"hello "+age);

        float hieght=Float.parseFloat(JOptionPane.showInputDialog("enter your name")); //convert it into float if it needed
        JOptionPane.showMessageDialog(null,"hello "+hieght);

    //Math method
        double x =3.14;
        double y =-3.15;
        double z = Math.max(x,y);
        double n = Math.min(x,y);
        double a = Math.abs(z);
        double q = Math.sqrt(x);//racine carré
        double r = Math.round(x);//presque(less or more 0.5)
        double e = Math.ceil(x); //jump to the next int(round up)
        double g = Math.floor(x);//round down

        System.out.println(g);

        System.out.println(Math.addExact(5, 6));//operation addition
        System.out.println(Math.abs(-10)); //valeur absolut |-10|=10
        System.out.println((int) Math.pow(2, 2));//int pour la castration


// logical oprators

&& -> and
|| -> or
! -> not
!= -> not equals
!(x).equals -> not equals

//random values
        Random r =new Random();//generate random values -> usefull for giving user a random ID without tap it manually
        int x= r.nextInt(7)+1;//generation start from 0 so we add 1 to start generating from 1
        double v= r.nextDouble();//from 0 to 1
        System.out.println(v);


//If statement
        System.out.println("----------If basique--------");
        int age = 17;
        if (age >= 18) {
            System.out.println("adult");
        } else if (age > 15 && age < 18) {
            System.out.println("presque adult");
        } else {
            System.out.println("n'est pas adult");
        }

//if avancé
        System.out.println("----------If avancé--------");
        String message = age > 18 ?
                "adult" :
                "n'est pas adult";
        System.out.println(message);

        int age = 17;

        int message = age > 18 ?
        1:
        0;
        System.out.println(message);


//Swith
        System.out.println("----------swith--------");
        String gender = "femme";
        switch (gender) {
            case "femme":
                System.out.println("identifer comme une femme");
                break;
            case "male":
                System.out.println("idenifier comme un male");
                break;
            case "non identifier":
                System.out.println("il est non identifier");
                break;
            default:
        }

//loop statement-- for
        System.out.println("----basic loop-----------");
        String name="";
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("entert your name");
            name=sc.nextLine();
        }while (name.isBlank());
        System.out.println("hello "+ name);

//for loop statement
        System.out.println("----------basic for----");

         for (int i = 0; i<10; i++){
             System.out.println(i);
         }
        System.out.println("----------basic for inverse----");
        for (int i = 10; i>0; i--){
            System.out.println(i);
        }

 //nested loop(for inside for)
         int r =4;
         int c=6;
         String s="&";
         for (int i=1;i<=r;i++){
             for (int j=1;j<=c;j++){
                 System.out.print(s);//we drow a rectangle with & symbol
             }
             System.out.println();
         }

//array is a variable witch we can store multiple variables

        String[] cars={"BMW","Tesla", "marsedese"};//1st way to create an  Array
        //or 2nd way to create an Array
        String[] car= new String[3];
        car[0]="bmw";
        car[1]="tesla";
        car[2]="marsedese";
        System.out.println(Arrays.toString(car));//write down the table

        System.out.println(cars[0]);//incrementation starts with 0
        System.out.println(car[0]);
//for +Array
        for(int i=0;i< car.length;i++){
            System.out.println(car[i]);
        }

//2D Array( rows and colonms)

        String[][] cars ={
                {"Tesla","bi","ibm"},
                {"Tesla1","bi1","ibm1"},
                {"Tesla2","bi3","ibm3"}
                };


        //or 2nd way
        String[][]car=new String[3][3];
        car[0][0]="Tesla";
        car[0][1]="bi";
        car[0][2]="ibm";
        car[1][0]="Tesla1";
        car[1][1]="bi1";
        car[1][2]="ibm1";
        car[2][0]="Tesla2";
        car[2][1]="bi2";
        car[2][2]="ibm2";
        // write down the content of the table
        for (int i=0;i< car.length;i++){
            for (int j=0;j< car[i].length;j++){
                System.out.println(car[i][j]);
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(cars));
 */
//String Methods(isEmpty()---isBlank()----)
      String l="              Lili kiki";
      String L=" ";
      String P= null;
        System.out.println(l.isBlank());
        System.out.println(L.isBlank());
        //System.out.println(P.isBlank()); // didn't work

        System.out.println(l.isEmpty());
        System.out.println(L.isEmpty());
        //System.out.println(P.isEmpty());//didn't work
    //isEmpty  is for empty String
    //isBlank() accept spaces,tabs and new ligns
        System.out.println(l.equals("lili"));//egale
        System.out.println(l.toUpperCase());
        System.out.println(l.toLowerCase());
        System.out.println(l.indexOf("i"));// index of the letter i
        System.out.println(l.trim());//no spaces
        System.out.println(l.charAt(15));//the 15th caracter












    }



}
