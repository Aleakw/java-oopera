public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Печать либретто
    public void printLibretto() {
        System.out.println("Либретто " + title + ":");
        System.out.println(librettoText);
    }
}
