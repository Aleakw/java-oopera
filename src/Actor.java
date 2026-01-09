public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        // Требование: имя фамилия (рост)
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        Actor other = (Actor) o; // считаем, что сюда передают Actor
        return height == other.height
                && name.equals(other.name)
                && surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + height;
    }
}
