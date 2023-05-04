import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Напиши свой взраст, и я подскажу, что тебе делать!");
        // System.out.println();
        Main application = new Main();
        application.input();

    }
    public void input(){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age == 10){
            System.out.println("10 лет - заниматься спортом и увлекаться науками");}
        if(age == 11){
            System.out.println("11 лет - то же, что и в 10, + закреплять отношения с друзьями");}
        if(age == 12){
            System.out.println("12 лет - пора задуматься об определении рода деятельности после учёбы");}
        if(age == 13){
            System.out.println("13 лет - выбирать, на что делать упор: спорт, наука, литература");}
        if(age == 14){
            System.out.println("14 лет - рекомендуется начать работать летом через молодёжные организации и центр занятости");}
        if(age == 15){
            System.out.println("15 лет - должно появляться более глубокое сознание, надо тщательно развивать вкус");}
        if(age == 16){
            System.out.println("16 лет - обратить внимание на учёбу, сдать чёртовы экзамены, не стоит стесняться поступать на спо");}
        if(age == 17){
            System.out.println("17 лет - ЕГЭ - это серьёзно! Нужно сделать грамотный выбор и начать хорошо готовиться");}
        if(age == 18){
            System.out.println("18 лет - будь уже ответственней, сделай правильный выбор, потом будет очень сложно что-то поменять");}
        if(age == 19){
            System.out.println("19 лет - учись, не блядуй, но и задротом быть не надо, не забудь про спорт и про маму");}
        if(age == 20){
            System.out.println("20 лет - не ведись на отношения");}
        if(age == 21){
            System.out.println("21 год - не ведись на пьянки и на отношения");}
        if(age == 22){
            System.out.println("22 года - выбери достойную работу, не торгуй принципами, разбирайся в истории и политике, спутница должна быть хорошей, НЕ КУРИ");}
        if(age == 23){
            System.out.println("23 года - терпи, дальше - труднее");}
        if(age > 23){
            System.out.println("хуй его знает, копи на гроб, если ты до сих пор ничтожество и доверяешь свою судьбу программе");}
        if(age <= 0)
            System.out.println("не выпендривайся, умник хуев");
        else if (age < 10){
            System.out.println("иди соси сиську, пиздюк");}
        }
        //System.out.println(age);
    }
