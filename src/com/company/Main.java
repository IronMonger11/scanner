package com.company;

import java.util.Scanner;

public class Main {

    static void thang(int i) {
        Scanner trombone = new Scanner(System.in);
        int test = trombone.nextInt();
        if (i == 1) {
            System.out.println("well, in that case, welcome, welcome (fully)");
        }
        if (i == 0) {
            System.out.println("well, in that case.... please leave this website");
        }
    }
    public static void main(String[] args) {
	Scanner nemnam = new Scanner(System.in);
        System.out.println("enter your age");
        int demo = nemnam.nextInt();
        int cringe = 18 - demo;
        if (demo <= 10) {
            System.out.println("go away son. This place is NOT for you. Come back " + cringe + " years later.");
        }
        if (demo < 18 && demo > 10) {
            System.out.println("little brother, you are super young, grow up " + cringe + " years old and i will allow you >)");
            System.exit(0);
        }
        if (demo > 60 && demo < 120) {
            System.out.println("dud, you are too old. I'm sorry but i have to terminate this process.");
            System.exit(0);
        }
        if (demo > 120) {
            System.out.println("stop bluffing. I used to do that too for other websites you know. Process terminated.");
            System.exit(0);
        }

        if (demo >= 18) {
            Scanner trimbo = new Scanner(System.in);
            System.out.println("enter your username");
            String troik = trimbo.nextLine();
            System.out.println("oh! hello, " + troik + ", welcome to \"rando's website\"");
        }

        System.out.println("why are you here in this website? for random names? answer in 1 for yes, or 0 for no,\notherwise i get angry");
        thang(1);
        System.out.println("yea whatever now do your chore and stuff otherwise i am bored");
    }
}
