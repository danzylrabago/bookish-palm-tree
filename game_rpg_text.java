import java.util.Scanner;
import java.math.*;
import java.util.Random;
import java.util.function.*;
/*these are the packages in the java interface that must be imported 
before using or making the code work*/
//includes Math java, randomization, and the basic package Scanner

public class game_rpg_text extends TestSleepMethod1 implements Falcon1, Sandman2, Thor3 {
    static String name;
    static int life;
    static int pointsTotal;
    static int agility;
    static int speed;
    static int attack;
    static int defence;
    static int counterAttack;
    static int MonsterZLife;
    // this i declared a public class and named it as it is also implemented with
    // three interfaces//
    /*
     * also named static variables that can be used later in the code, static means
     * it can be utilized as a field in the other classes included in this code
     */

    public static void main(String[] args) {
        game_rpg_text gm = new game_rpg_text();

        gm.Name(name);

        gm.GameMode();
    }
    // in the mainclass I declared and instantiated the first class i created
    /*
     * also named an object gm and invoked other methods that are serving as
     * pathways to execute specific processes that would display the desired output
     */

    public String Choice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Chooose your hero: ");
        System.out.println("1- Falcon");
        System.out.println("2 - Sandman");
        System.out.println("3 - Thor");
        System.out.println();
        int x = in.nextInt();
        switch (x) {
            case 1:
                falcon();
                System.out.println();

            case 2:
                sandman();
                System.out.println();

            case 3:
                thor();
                System.out.println();

        }
        return "welcome";
    }
    /*
     * this part of the code consists of options that would be accessible to the
     * choice selection, made three choices of heroes that will be the preference of
     * the end-user
     */
    // also included methods that are contained inside the three interfaces created
    // namely Falcon, Sandman, and Thor//
    // returns a simple string at the end of the line/

    // this part sets the name of the user and retrieves its data to be used as an
    // identification
    // also allows users to input their name

    public String GameMode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 or 2 to select your Game Mode: ");
        System.out.println("1 - Story");
        System.out.println("2 - Survival");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("There are three heroes that have the powers of lightning, land, and wind.");
            System.out.println("These are Thor, Sandman, and Falcon.");
            Choice();
            lifeCount(30);
            random_stats();
            MonsterZ(counterAttack);
            System.out.println("your life count: " + life + "    " + "Monster Z life count: " + MonsterZLife);
            missionStatus();
        }
        if (x == 2) {
            System.out.println("There are three heroes that have the powers of lightning, land, and wind.");
            System.out.println("These are Thor, Sandman, and Falcon.");
            Choice();
            random_stats();
            lifeCount(10, 1);
            random_stats();
            MonsterZ(counterAttack);
            run();
            System.out.println("your life count: " + life + "    " + "Monster Z life count: " + MonsterZLife);
            missionStatus();
        }
        return "game_mode_select";
    }
    /*
     * this part of the code is about selection of game modes and also includes the
     * life count of each hero at the starting point of the game
     */

    public String Name(String userName) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userName = sc.next();
        name = userName;
        return userName;
    }
    // input user name

    @Override
    public String falcon() {
        System.out.println("You have chosen Falcon. Good luck.");
        System.out.println();
        System.out.println(
                "The Falcon is ready to fly. He got 7 points agility, 5 points speed, 4 points attack, and 7 points defense.");
        System.out.println();
        System.out.println("Falcon is up and  flying towards the area of the Monster Z.");
        System.out.println();
        System.out.println("ATTACK THE MONSTER...");
        return "falcon";
    }
    // this is the hero Falcon's part, it narrates how this character in the game
    // fights against his enemy//

    @Override
    public String sandman() {
        System.out.println("You have chosen Sandman. Good luck.");
        System.out.println();
        System.out.println("The Sandman is ready to ravage.");
        System.out.println();
        System.out.println("Sandman is on the ground and coming towards the area of the Monster Z.");
        System.out.println();
        System.out.println("ATTACK THE MONSTER...");
        return "sandman";
    }
    // this is the part of Sandman and how he fights his villain

    @Override
    public String thor() {
        System.out.println("You have chosen Thor. Good luck.");
        System.out.println();
        System.out.println("Thor is ready to strike.");
        System.out.println();
        System.out.println("Thor is pumping up and walking towards the area of the Monster Z.");
        System.out.println();
        System.out.println("ATTACK THE MONSTER...");
        return "thor";
    }
    // this is Thor's part and how it continues to fight his enemy

    public void random_stats() {
        int agility = (int) (Math.random() * 10);
        int speed = (int) (Math.random() * 10);
        int attack = (int) (Math.random() * 10);
        int defence = (int) (Math.random() * 10);

        System.out.println("AGILITY : " + agility);
        System.out.println("SPEED: " + speed);
        System.out.println("ATTACK: " + attack);
        System.out.println("DEFENCE: " + defence);
    }
    // this explicitly shows and displays in the output the rating of each hero
    // character in this mini-rpg-game

    public int lifeCount(int life) {
        life = 10;
        int counter = 1;
        int intLife = life - counter;
        life = intLife;
        return life;
    }
    /*
     * this is the part of the code where the life count is computed as being
     * diminished by the value of the counterattack of the enemy
     */

    public int lifeCount(int life1, int life2) {
        int intLife = life1 - life2;
        if (life1 > life2) {
            intLife = life1 - life2;
            life = intLife;
        }
        return life;
    }
    /*
     * this is a recursive function used in this part of the code, it calculates the
     * amount of damage taken from the hero's foe and subtracts it from his life
     * count continually
     */

    public void missionStatus() {
        if (life > 0) {
            System.out.println("Mission complete. Congratulations. You defeated the Monster Z.");
        } else if (life <= 0) {
            System.out.println("Mission unsuccessful. You were defeated by the Monster Z.");
        }
    }
    // this displays the overall mission status

    public int MonsterZ(int counterAttack) {
        int Monster_z_Life = 20;
        MonsterZLife = Monster_z_Life;
        counterAttack = (int) (Math.random() * 7);
        int damage1 = agility - counterAttack;
        int damage2 = speed - counterAttack;
        int damage3 = attack - counterAttack;
        int damage4 = defence - counterAttack;
        counterAttack = (damage1 + damage2 + damage3 + damage4) / 5;
        life = -counterAttack;
        int attack = (damage1 + damage2 + damage3 + damage4);
        MonsterZLife = -attack;
        return MonsterZLife;
    }

    /*
     * this is the part of computing the monster's life or the enemy of the three
     * heroes here, calculating damages taken from each specific attacks from the
     * villain and subtracting it with each skill stat points of the heroes
     */

    public int lifeCount() {
        return life;
    }
    // returns life count

    public void run() {

        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Battle Commencing...." + i + "%");
        }

        System.out.println("Battle Ended.");
    }
}
