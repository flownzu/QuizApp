package de.btit.fjaeckel.quizapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class FragenKatalog {

    public static List<Frage> getFragen(int count){
        List<Frage> fragen = alleFragen;
        if (count > fragen.size()) throw new IndexOutOfBoundsException();
        if (count <= 0) throw new IllegalArgumentException("Es muss mindestens eine Frage zurückgegeben werden.");
        return fragen.subList(0, count - 1);
    }

    public static List<Frage> getFragen(final String kategorie){
        List<Frage> kategorieFragen = Collections.emptyList();
        for (Frage f : alleFragen){
            if (f.getKategorie().equals(kategorie)) kategorieFragen.add(f.shuffleAntworten());
        }
        return kategorieFragen;
    }

    public static List<Frage> getFragen(String kategorie, int count){
        if (count <= 0) throw new IllegalArgumentException("Es muss mindestens eine Frage zurückgegeben werden.");
        List<Frage> kategorieFragen = getFragen(kategorie);
        if (kategorieFragen.size() >= count){
            return kategorieFragen.subList(0, count - 1);
        }
        else throw new IndexOutOfBoundsException();
    }

    private static  List<Frage> buecherUndWoerter = Arrays.asList(
            new Frage(
                    "Was bedeuten die berühmten Worte von Julius Caesar \"Alea iacta est\"?",
                    "Bücher & Wörter",
                    "Der Würfel ist gefallen.",
                    "Die Entscheidung ist getroffen.",
                    "Das ist mein Urteil.",
                    "So soll es sein.",
                    1
            )
    );

    private static List<Frage> kunstUndKultur = Arrays.asList(
            new Frage(
                    "Von wem stammt das Gemälde der Mona Lisa?",
                    "Kunst & Kultur",
                    "Pablo Picasso",
                    "Vincent van Gogh",
                    "Leonardo da Vinci",
                    "Claude Monet",
                    3
            )
    );

    private static List<Frage> glaubeUndReligion = Arrays.asList(
            new Frage(
                    "Welcher Papst sprach am 25.04.1987 erstmals \"Das Wort zum Sonntag\"?",
                    "Glaube und Religion",
                    "Johannes XXIII",
                    "Benedikt XVI",
                    "Paul VI",
                    "Johannes Paul II",
                    4
            )
    );

    private static List<Frage> medienUndUnterhaltung = Arrays.asList(
            new Frage(
                    "In welchem Land wurde der Actionfilmdarsteller und Kampfsportler Jean-Claude Van Damme geboren?",
                    "Medien und Unterhaltung",
                    "Frankreich",
                    "Belgien",
                    "USA",
                    "Kanada",
                    2
            )
    );

    private static List<Frage> musik = Arrays.asList(
            new Frage(
                    "Was ist eine musikalische Kompositionsform",
                    "Musik",
                    "Kachel",
                    "Fuge",
                    "Fliese",
                    "Walle",
                    2
            )
    );

    private static List<Frage> sportUndFreizeit = Arrays.asList(
            new Frage(
                    "Wie viele Punkte ergibt der erste gewonnene Ballwechsel beim Tennis?",
                    "Sport und Freizeit",
                    "15",
                    "1",
                    "5",
                    "10",
                    1
            )
    );

    private static List<Frage> geschichte = Arrays.asList(
            new Frage(
                    "Wer war während des zweiten Weltkrieges US-Präsident?",
                    "Geschichte",
                    "Franklin D. Roosevelt",
                    "Richard Nixon",
                    "John F. Kennedy",
                    "Ronald Reagan",
                    1
            ),
            new Frage(
                    "Wie hieß die deutsche Verteidigungslinie in Italien, auf der im zweiten Weltkrieg das Kloster Monte Carlo lag?",
                    "Geschichte",
                    "Gustavlinie",
                    "Ferdinandlinie",
                    "Franzlinie",
                    "Gretellinie",
                    1
            ),
            new Frage(
                    "Wem gelang es, im 1.Weltkrieg Deutsch-Ostafrika als einzige deutsche Kolonie bis zum Ende des Krieges gegen die britischen, belgischen und portugiesischen Truppen zu verteidigen?",
                    "Geschichte",
                    "Paul von Lettow-Vorbeck",
                    "Lothar von Trotha",
                    "Freiherr von Schleinitz",
                    "Graf von Götzen",
                    1
            ),
            new Frage(
                    "1994 fand in Ruanda als Ergebnis einer jahrzehntenlangen Feindschaft zwischen zwei Volksgruppen einer der schlimmsten Völkermorde der Menschheitsgeschichte statt. Wie heißen diese?",
                    "Geschichte",
                    "Hutu und Tutsi",
                    "Zulu und Xhosa",
                    "Bemda und Nyanja",
                    "Kikuyu und Massai",
                    1
            ),
            new Frage(
                    "Welche deutsche Stadt wurde im zweiten Weltkrieg als Erste von den Amerikanern eingenommen?",
                    "Geschichte",
                    "Aachen",
                    "Kaiserslautern",
                    "Mannheim",
                    "Koblenz",
                    1
            ),
            new Frage(
                    "Welche berühmte Person aus der Antike ließ sich von einer Schlange beißen, um Selbstmord zu begehen?",
                    "Geschichte",
                    "Cleopatra",
                    "Cäsar",
                    "Marc Anton",
                    "Sophokles",
                    1
            ),
            new Frage(
                    "Welche Stadt wurde nach Ende des 2.Weltkrieges von \"Rosinenbombern\" versorgt?",
                    "Geschichte",
                    "Westberlin",
                    "Frankfurt",
                    "München",
                    "Hamburg",
                    1
            )
    );

    private static List<Frage> geographieUndErdkunde = Arrays.asList(
            new Frage(
                    "Welches dieser Länder grenzt nicht unmittelbar an das Mittelmeer?",
                    "Geographie und Erdkunde",
                    "Slowenien",
                    "Albanien",
                    "Montenegro",
                    "Bulgarien",
                    4
            ),
            new Frage(
                    "Wie wird das windstille Zentrum eines Wirbelsturms genannt?",
                    "Geographie und Erdkunde",
                    "Auge",
                    "Herz",
                    "Hirn",
                    "Körper",
                    1
            ),
            new Frage(
                    "Wie nennt man die starken Regenfälle, die zu bestimmten Jahreszeiten in Asien niedergehen?",
                    "Geographie und Erdkunde",
                    "Monsun",
                    "Taikun",
                    "Orkan",
                    "Zyklon",
                    1
            ),
            new Frage(
                    "Was ist ein Mittelgebirge?",
                    "Geographie und Erdkunde",
                    "ein Gebirge von mittlerer Höhe",
                    "die Mitte eines Gebirges",
                    "ein Gebirge in der Mitte eines Landes",
                    "ein Gebirge zwischen zwei Gebirgen",
                    1
            ),
            new Frage(
                    "Welche Küstenform gibt es nicht?",
                    "Geographie und Erdkunde",
                    "Geestküste",
                    "Schärenküste",
                    "Boddenküste",
                    "Fördenküste",
                    1
            ),
            new Frage(
                    "Welcher der folgenden Begriffe bezeichnet keinen Wind?",
                    "Geographie und Erdkunde",
                    "Tsunami",
                    "Bora",
                    "Mistral",
                    "Schirokko",
                    1
            ),
            new Frage(
                    "Wie nennt man die Wolken, die sehr hoch am Himmel dünne weiße Streifen bilden und schlechtes Wetter ankündigen?",
                    "Geographie und Erdkunde",
                    "Federwolken",
                    "Haufenwolken",
                    "Schäfchenwolken",
                    "Schichtwolken",
                    1
            ),
            new Frage(
                    "Wer schuf die ersten modernen Landkarten?",
                    "Geographie und Erdkunde",
                    "Mercator",
                    "Beheim",
                    "Mercalli",
                    "Marconi",
                    1
            ),
            new Frage(
                    "Breite Flussmündungen mit vielen Flussarmen nennt man?",
                    "Geographie und Erdkunde",
                    "Delta",
                    "Alpha",
                    "Beta",
                    "Gamma",
                    1
            )
    );

    public static List<Frage> alleFragen = new ArrayList<Frage>(){
        {
            //addAll(buecherUndWoerter);
            //addAll(geschichte);
            //addAll(kunstUndKultur);
            //addAll(glaubeUndReligion);
            addAll(medienUndUnterhaltung);
            //addAll(musik);
            //addAll(geographieUndErdkunde);
            addAll(sportUndFreizeit);
            Collections.shuffle(this);
        }
    };
}
