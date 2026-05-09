import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Frage[] fragen = {
            new Frage("Was ist 7 + 5?", 12),
            new Frage("Was ist 9 * 3?", 27),
            new Frage("Was ist 100 - 44?", 56),
            new Frage("Was ist 81 / 9?", 9)
        };

        int punkte = 0;

        // alt:
        System.out.println("=== Willkommen beim Zahlen-Quiz! ===");

        // neu:
        System.out.println("=== Willkommen beim Mathe-Quiz! ===");

        for (Frage frage : fragen) {
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
        scanner.close();
    }
}