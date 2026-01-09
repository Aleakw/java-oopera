public class Actor extends Person {

    // private
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        Actor other = (Actor) o;
        return height == other.getHeight()
                && name.equals(other.name)
                && surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + height;
    }
}
