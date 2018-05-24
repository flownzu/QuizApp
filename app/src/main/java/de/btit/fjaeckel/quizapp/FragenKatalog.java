package de.btit.fjaeckel.quizapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import de.btit.fjaeckel.quizapp.db.Frage;

public final class FragenKatalog {
    private static  List<Frage> buecherUndWoerter = Arrays.asList(
            new Frage(
                    "Was bedeuten die berühmten Worte von Julius Caesar \"Alea iacta est\"?",
                    "Bücher & Wörter",
                    "Der Würfel ist gefallen.",
                    "Die Entscheidung ist getroffen.",
                    "Das ist mein Urteil.",
                    "So soll es sein.",
                    1
            ),
            new Frage(
                    "Wodurch wird Schneewittchen wieder \"wach\"?",
                    "Bücher und Wörter",
                    "Defillibrator",
                    "Mund zu Mund Beatmung",
                    "Schlag auf die Wange",
                    "Diener stolpert mit ihrem Sarg",
                    4
            ),
            new Frage(
                    "Von welchem amerikanischen Autor stammt die \"Wüstenplanet\"-Reihe?",
                    "Bücher und Wörter",
                    "Douglas Adams",
                    "Frank Herbert",
                    "Michael Chrichton",
                    "Stephen King",
                    2
            ),
            new Frage(
                    "Es ist nicht alles Gold, was ...?",
                    "Bücher und Wörter",
                    "wertvoll ist",
                    "Bände spricht",
                    "glänzt",
                    "glitzert",
                    3
            ),
            new Frage(
                    "\"Ich bin ein Pfau unter Hühnern\", sagte ...?",
                    "Bücher und Wörter",
                    "Buddha",
                    "Dao Li",
                    "Konfuzius",
                    "Chin Chang",
                    4
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
            ),
            new Frage(
                    "Welcher dieser Malter gehört nicht zum Impressionismus?",
                    "Kunst & Kultur",
                    "Monet",
                    "Brueghel",
                    "Renoir",
                    "Cezanne",
                    2
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
            ),
            new Frage(
                    "Wie viele Jahre soll Methusalem laut Altem Testament gelebt haben?",
                    "Glaube und Religion",
                    "572",
                    "969",
                    "897",
                    "799",
                    2
            ),
            new Frage(
                    "Die Ikonoklasten zerstörten heilige Bilder und Denkmäler...?",
                    "Glaube und Religion",
                    "der eigenen Religion",
                    "anderer Religionen",
                    "des Islams",
                    "der polytheistischen Religionen",
                    1
            ),
            new Frage(
                    "Welcher Heilige gilt als als Patron der Reisenden und des Verkehrs?",
                    "Glaube und Religion",
                    "Valentin",
                    "Petrus",
                    "Christophorus",
                    "Barbara",
                    3
            ),
            new Frage(
                    "Papst Johannes Paul I. stammte aus?",
                    "Glaube und Religion",
                    "Italien",
                    "Ungarn",
                    "Rumänien",
                    "Polen",
                    1
            ),
            new Frage(
                    "Welche Philosophie behauptet, dass die Frage zur Existenz eines Gottes nicht endgültig zu klären sei?",
                    "Glaube und Religion",
                    "Agnostizismus",
                    "Atheismus",
                    "Theismus",
                    "Nihilismus",
                    1
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
            ),
            new Frage(
                    "Wie heißt der erste Columbo Film aus dem Jahr 1968?",
                    "Medien und Unterhaltung",
                    "Mord nach Rezept",
                    "Peng du bist tot",
                    "Bei Anruf Mord",
                    "Schach dem Mörder",
                    1
            ),
            new Frage(
                    "Welche Schauspielerin nahm nicht den Namen des Vaters an?",
                    "Medien und Unterhaltung",
                    "Liza Minelli",
                    "Romy Schneider",
                    "Carri Fisher",
                    "Melanie Griffith",
                    2
            ),
            new Frage(
                    "Welche Farbe hat Oskar aus der Sesamstraße?",
                    "Medien und Unterhaltung",
                    "Blau",
                    "Grün",
                    "Gelb",
                    "Braun",
                    2
            ),
            new Frage(
                    "Wer ist kein Feind von Batman?",
                    "Medien und Unterhaltung",
                    "Pinguin",
                    "Lex Luthor",
                    "Riddler",
                    "Two Face",
                    2
            ),
            new Frage(
                    "Wie viele Oscars erhilt das Epos \"Lawrence von Arabien\"?",
                    "Medien und Unterhaltung",
                    "3",
                    "10",
                    "5",
                    "7",
                    4
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
            ),
            new Frage(
                    "In dem musikalischen Märchen \"Peter und der Wolf\" ist jede Person und jedes Tier der Handlung einem eigenen Instrument zugeordnet. Welches Instrument steht für den Großvater?",
                    "Musik",
                    "Fagott",
                    "Klavier",
                    "Kontrabass",
                    "Trompete",
                    1
            ),
            new Frage(
                    "In welchem Takt wird ein Bolero gespielt?",
                    "Musik",
                    "3/4",
                    "6/8",
                    "5/8",
                    "4/4",
                    1
            ),
            new Frage(
                    "Aus welchem Land stammt die Rumba ursprünglich?",
                    "Musik",
                    "Mexiko",
                    "Argentinien",
                    "Brasilien",
                    "Kuba",
                    4
            ),
            new Frage(
                    "Wer war der goldene Reiter?",
                    "Musik",
                    "Joachim Witt",
                    "Markus",
                    "Herbert Grönemeier",
                    "Reinhard Fendrich",
                    1
            ),
            new Frage(
                    "Wer sang das Original \"Major Tom\"?",
                    "Musik",
                    "Falco",
                    "Joachim Witt",
                    "Peter Schilling",
                    "Nena",
                    3
            ),
            new Frage(
                    "Welchen Titel trägt die Nationalhymne der USA?",
                    "Musik",
                    "Stars and Stripes",
                    "Living in America",
                    "Amazing Grace",
                    "The Star Spangled Banner",
                    4
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
            ),
            new Frage(
                    "Wie heißt die japanische Kampfsportart, bei der Bambusschwerter zum Einsatz kommen?",
                    "Sport und Freizeit",
                    "Naginatado",
                    "Jiu Jutsu",
                    "Kyudo",
                    "Kendo",
                    4
            ),
            new Frage(
                    "Bei welcher Sportart besteht der Ball aus Elch- oder Rosshaar?",
                    "Sport und Freizeit",
                    "Polo",
                    "Prellball",
                    "Radball",
                    "Völkerball",
                    3
            ),
            new Frage(
                    "Welche Sportart wird auf einer Straße ausgeübt?",
                    "Sport und Freizeit",
                    "Bandy",
                    "Boccia",
                    "Boßeln",
                    "Bootschen",
                    3
            ),
            new Frage(
                    "Wie lautete der Spitzname von Helmut Rahn?",
                    "Sport und Freizeit",
                    "Major",
                    "Boss",
                    "Eisenfuß",
                    "Chef",
                    2
            ),
            new Frage(
                    "Wie endete das einzige Fußballspiel zwischen der Bundesrepublik Deutschland und der DDR?",
                    "Sport und Freizeit",
                    "1:2",
                    "2:1",
                    "0:1",
                    "1:0",
                    3
            ),
            new Frage(
                    "Bei welchem Sport gibt es ein \"Sandwich\"?",
                    "Sport und Freizeit",
                    "Basketball",
                    "Polo",
                    "Volleyball",
                    "Eishockey",
                    2
            ),
            new Frage(
                    "In welchem Jahr wurde die Bundesrepublik Deutschland zum ersten Mal Handball-Weltmeister?",
                    "Sport und Freizeit",
                    "2003",
                    "1990",
                    "1978",
                    "2007",
                    3
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
            addAll(buecherUndWoerter);
            addAll(geschichte);
            addAll(kunstUndKultur);
            addAll(glaubeUndReligion);
            addAll(medienUndUnterhaltung);
            addAll(musik);
            addAll(geographieUndErdkunde);
            addAll(sportUndFreizeit);
            Collections.shuffle(this);
        }
    };
}
