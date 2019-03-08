package ac.za.cput;

public class Musician {

    private String song;

    public Musician(String song)
    {
        this.song = song;
    }

    public String songName()
    {
        System.out.println(song);
        return song;
    }

    public String artist()
    {
        song = "Notshi's song is " + song;
        System.out.println(song);
        return song;

    }

}
