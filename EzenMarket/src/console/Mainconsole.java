package console;

import java.util.Scanner;

public class Mainconsole extends Thread{
    Scanner sc = new Scanner(System.in);
    @Override
    public void run() {
        while(true){
            System.out.println("> ");
            sc.nextLine();
        }
    }
}
