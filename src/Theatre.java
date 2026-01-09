public class Theatre {
    public static void main(String[] args) {
        // актёры
        Actor a1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor a2 = new Actor("Анна", "Соколова", Gender.FEMALE, 168);
        Actor a3 = new Actor("Олег", "Ильин", Gender.MALE, 175);

        // режиссёры
        Director d1 = new Director("Сергей", "Волков", Gender.MALE, 12);
        Director d2 = new Director("Мария", "Кузнецова", Gender.FEMALE, 8);

        // автор музыки и хореограф
        Person composer = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);

        // спектакли
        Show drama = new Show("Городской детектив", 110, d1);

        Opera opera = new Opera(
                "Евгений Онегин", 160, d2,
                composer,
                "Идёт опера...",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро", 145, d1,
                composer,
                "Идёт баллет...",
                choreographer
        );

        // распределяем актёров
        drama.addActor(a1);
        drama.addActor(a2);

        opera.addActor(a2);
        opera.addActor(a3);

        ballet.addActor(a1);
        ballet.addActor(a3);

        // попытка добавить дубль
        ballet.addActor(new Actor("Иван", "Петров", Gender.MALE, 180));

        // печать актёров
        System.out.println();
        drama.printDirectorInfo();
        drama.printActors();

        System.out.println();
        opera.printDirectorInfo();
        opera.printActors();

        System.out.println();
        ballet.printDirectorInfo();
        ballet.printActors();

        // замена актёра
        System.out.println();
        drama.replaceActorBySurname("Соколова", a3);
        drama.printActors();

        // замена несуществующего
        System.out.println();
        opera.replaceActorBySurname("Несуществующий", a1);

        // либретто
        System.out.println();
        opera.printLibretto();

        System.out.println();
        ballet.printLibretto();
    }
}
