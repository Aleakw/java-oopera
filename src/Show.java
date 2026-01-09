import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    // Печать режиссёра (имя + фамилия)
    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director);
    }

    // Печать актёров
    public void printActors() {
        System.out.println("Актёры спектакля " + title + ":");

        if (listOfActors.isEmpty()) {
            System.out.println("  (список пуст)");
            return;
        }

        for (Actor actor : listOfActors) {
            System.out.println("  - " + actor);
        }
    }

    // Добавить актёра + проверка дубля (equals)
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("!!!!! Актёр уже добавлен: " + actor);
            return;
        }
        listOfActors.add(actor);
    }

    // Заменить актёра по фамилии
    public void replaceActorBySurname(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);

            if (current.getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Замена: " + current + " -> " + newActor);
                return;
            }
        }

        System.out.println("!!!!! Актёр с фамилией " + surnameToReplace + " не найден.");
    }
}
