public class Frage {
    private String frageText;
    private int richtigeAntwort;

    public Frage(String frageText, int richtigeAntwort) {
        this.frageText = frageText;
        this.richtigeAntwort = richtigeAntwort;
    }

    public String getFrageText() {
        return frageText;
    }

    public boolean pruefeAntwort(int antwort) {
        return antwort == richtigeAntwort;
    }
}