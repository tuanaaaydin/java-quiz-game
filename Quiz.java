import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuizFrage[] fragen = {
            new QuizFrage("Was ist 7 + 5?", 12),
            new QuizFrage("Was ist 9 * 3?", 27),
            new QuizFrage("Was ist 100 - 44?", 56),
            new QuizFrage("Was ist 81 / 9?", 9)
        };

        int punkte = 0;

        System.out.println("=== Willkommen beim Mathe-Quiz! ===");

        for (QuizFrage frage : fragen) {
            System.out.print(frage.getFrageText() + " ");
            int antwort = scanner.nextInt();

            if (frage.pruefeAntwort(antwort)) {
                System.out.println("Richtig!");
                punkte++;
            } else {
                System.out.println("Leider falsch.");
            }
        }

        System.out.println("Du hast " + punkte + " von " + fragen.length + " Punkten!");

        // Highscore-Bewertung
        if (punkte == fragen.length) {
            System.out.println("Perfekt! Neuer Highscore!");
        } else if (punkte >= fragen.length / 2) {
            System.out.println("Gut gemacht!");
        } else {
            System.out.println("Weiter üben!");
        }

        scanner.close();
    }
}