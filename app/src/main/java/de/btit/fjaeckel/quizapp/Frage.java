package de.btit.fjaeckel.quizapp;

public class Frage {
    private String text;
    private String kategorie;
    private String antwort1;
    private String antwort2;
    private String antwort3;
    private String antwort4;
    private int richtig;

    public Frage(String text, String kategorie, String antwort1, String antwort2, String antwort3, String antwort4, int richtig) {
        this.text = text;
        this.kategorie = kategorie;
        this.antwort1 = antwort1;
        this.antwort2 = antwort2;
        this.antwort3 = antwort3;
        this.antwort4 = antwort4;
        this.richtig = richtig;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getAntwort1() {
        return antwort1;
    }

    public void setAntwort1(String antwort1) {
        this.antwort1 = antwort1;
    }

    public String getAntwort2() {
        return antwort2;
    }

    public void setAntwort2(String antwort2) {
        this.antwort2 = antwort2;
    }

    public String getAntwort3() {
        return antwort3;
    }

    public void setAntwort3(String antwort3) {
        this.antwort3 = antwort3;
    }

    public String getAntwort4() {
        return antwort4;
    }

    public void setAntwort4(String antwort4) {
        this.antwort4 = antwort4;
    }

    public int getRichtig() {
        return richtig;
    }

    public void setRichtig(int richtig) {
        this.richtig = richtig;
    }
}
