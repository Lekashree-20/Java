package AbPacEx.Interface.live;

import AbPacEx.Interface.music.Playable;
import AbPacEx.Interface.music.string.Veena;
import AbPacEx.Interface.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();

        // a. Create an instance of Veena and call play() method
        veena.play();

        // b. Create an instance of Saxophone and call play() method
        saxophone.play();

        // c. Place the above instances in a variable of type Playable and then call play()
        Playable playable;
        playable = veena;
        playable.play();
        playable = saxophone;
        playable.play();
    }

}
