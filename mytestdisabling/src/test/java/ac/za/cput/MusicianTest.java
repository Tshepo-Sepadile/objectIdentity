package ac.za.cput;

import org.junit.*;

import static org.junit.Assert.*;

public class MusicianTest {

    String song = "I Believe";
    public Musician musician;

    @Before
    public void setUp() throws Exception {
        musician = new Musician(song);
    }

    @After
    public void tearDown() throws Exception {
    }

    //This is the test that is disabled
    @Ignore
    @Test
    public void songName() {

        musician = new Musician(song);
        System.out.println("Name of song");
        song = "I Believe";
        Assert.assertEquals(song, musician.songName());
    }

    //This is to show that the program works
    @Test
    public void artist() {
        musician = new Musician(song);
        System.out.println("Artist name and song name");
        song = "Notshi's song is " + "I Believe";
        Assert.assertEquals(song, musician.artist());
    }
}