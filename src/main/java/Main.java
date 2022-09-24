import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    String lampeValg;
    boolean ts = true;
    boolean ts2 = true;
    int tsLampe;
    String navn;
    Lamp lamp = new Lamp();

    public void turnOn() {
        System.out.println("Tryk 1 for at tænde lampen");
        System.out.println("Tryk 2 for at slukke lampen");
        System.out.println("Tryk 3 for at se lampens status");
        System.out.println("tryk 4 for at slukke programmet");
        while (tsLampe != 3) {
            try {
                tsLampe = scan.nextInt();
                if (tsLampe == 1) {
                    ts2 = true;
                    System.out.println("lampen er tændt");
                    scan.nextLine();
                } else if (tsLampe == 2) {
                    ts2 = false;
                    System.out.println("lampen er slukket");
                    scan.nextLine();
                } else if (tsLampe == 3) {
                    System.out.println("Lampen hedder: " + navn + " og er: " + lamp.translate(ts2));
                    scan.nextLine();
                } else if (tsLampe == 4) {
                    System.exit(0);
                } else if (tsLampe >= 5) {
                    System.out.println("du skal vælge et tal mellem 1 og 3 ");
                    scan.nextLine();
                }
            } catch (Exception e) {
                System.out.println("du må kun vælge tal mellem 1 og 3");
                scan.nextLine();
                turnOn();
                break;
            }

        }
        System.out.println("Vil du lave en ny lampe eller vil du afslutte?");
        System.out.println("1. lav en ny lampe");
        System.out.println("2. afslut programmet");
        try {
            tsLampe = scan.nextInt();
            if (tsLampe == 1) {
                navn = scan.nextLine();
                start();
            } else if (tsLampe == 2) {
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("du valgte ikke et tal mellem 1 og 2, så du bliver sendt tilbage til menuen");
            start();
        }

    }

    public void startProgrammet() {
        System.out.println("Velkommen til lampe programmet");
        System.out.println("Hvad hedder lampen?");
        navn = scan.nextLine();

        System.out.println("Lampen hedder: " + navn + " og er: slukket");
    }

    public void start() {
        startProgrammet();
        turnOn();
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }
}
