package OOPs_Questions.Week_2.live;

import OOPs_Questions.Week_2.music.Playable;
import OOPs_Questions.Week_2.music.string.Veena;
import OOPs_Questions.Week_2.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}