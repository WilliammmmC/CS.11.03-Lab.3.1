import java.util.Scanner;

public class TextBasedGame {
    static Scanner scanner = new Scanner(System.in);
    static int CurrentValue = 100;
    int GoalValue = 1000;
    static int lotteryimput = 0;
    static String riddleimput = "";
    static String boximput = "";

    static boolean Gameover = false;
    public static void main(String[] args) {
        System.out.println("Welcome to the stock market game");
        System.out.println("What is your name?");
        String Username = scanner.nextLine();
        System.out.println("Welcome, " + Username + ". You are a stock market trader.");
        System.out.println("You have $100 for now, and your goal is to reach $1000");
        System.out.println("Invest wise, you loose when your balance reaches zero.");
        System.out.println("Good luck, and enjoy.");
    if(!Gameover){
            while (CurrentValue > 50) {
                System.out.println("Please choose a stock to purchase (StockA, StockB, StockC, StockD)");
                String input = scanner.nextLine();
                if (CurrentValue >= 1000) {
                    System.out.println("You have completed the game. Congrats");
                    Gameover = true;
                } else if (input.equals("StockA")) {
                    BuyStockA();
                } else if (input.equals("StockB")) {
                    BuyStockB();
                } else if (input.equals("StockC")) {
                    BuyStockC();
                } else if (input.equals("StockD")) {
                    BuyStockD();
                } else {
                    System.out.println("Please check your input.");
                }
            }
            while (CurrentValue <= 50 && CurrentValue > 0) {
                System.out.println("Oops. It looks like your balance is running low!");
                System.out.println("Lets play some lottery!");
                System.out.println("Pick a game (Game1, Game2, Game3");
                String PickAGame = scanner.nextLine();
                if (PickAGame.equals("Game1")) {
                    System.out.println("Pick a number between 1 and 9");
                    lotteryimput = scanner.nextInt();
                    Lottery(lotteryimput);
                } else if (PickAGame == "Game2") {
                    System.out.println("Solve the following riddle:");
                    System.out.println("I am always hungry, I must always be fed,\n" + "The finger I touch, will soon turn red.");
                    riddleimput = scanner.nextLine();
                    Riddle(riddleimput);
                } else {
                    System.out.println("Theres four boxes in front of you. Pick one (Box1, Box2, Box3, Box4");
                    boximput = scanner.nextLine();
                    if (boximput.equals("Box1")) {
                        Box1();
                    } else if (boximput.equals("Box2")) {
                        Box2();
                    } else if (boximput.equals("Box3")) {
                        Box3();
                    } else{
                        Box4();
                        System.out.println("Your current value is: " + CurrentValue);
                    }

                }

            }
        }
    else{
        System.out.println("Congrats. You have succeeded");
    }

    }
    public static void BuyStockA(){
        System.out.println("you have purchased Stock A.");
        CurrentValue += 100;
        System.out.println("Now, you have " + "$" + CurrentValue);
    }

    public static void BuyStockB(){
        System.out.println("you have purchased Stock B.");
        CurrentValue -= 50;
        System.out.println("Now, you have " + "$" + CurrentValue);
    }

    public static void BuyStockC(){
        System.out.println("you have purchased Stock C");
        CurrentValue *= 2;
        System.out.println("Now, you have " + "$" + CurrentValue);
    }

    public static void BuyStockD(){
        System.out.println("you have purchased Stock D");
        CurrentValue /=2;
        System.out.println("Now, you have " + "$" + CurrentValue);
    }

    public static void Lottery( int lotteryimput){
        CurrentValue = CurrentValue + lotteryimput*10;
        System.out.println("Now, you have " + "$" + CurrentValue);
    }

    public static String Riddle(String riddleimput){
        if(riddleimput == "fire"){
            CurrentValue += 100;
            return "Congratulation, you have guessed the riddle. Now, you have " + "$" + CurrentValue;
        } else{
            return "Oops, not quite.";
        }
    }

    public static String Box1(){
        CurrentValue -= 100;
        return "Oh no. The Fed raised the interest rate. Your balance dropped to" + CurrentValue;
    }
    public static double Box2(){
        return CurrentValue*2;
    }

    public static boolean Box3(){
        System.out.println("Congrats. You stock value rose exponentially in the past hour. You succeeded");
        return Gameover = true;
    }

    public static int Box4(){
        return CurrentValue += 100;
    }

}
