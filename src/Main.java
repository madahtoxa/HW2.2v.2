import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        Griffidor[] griffidors = {
                new Griffidor("Гарри Поттер", 23, 100, 10, 20, 30),
                new Griffidor("Гермиона Грейнджер", 20, 22, 23, 24, 25),
                new Griffidor("Рон Уизли", 33, 34, 35, 36, 37),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 1, 2, 3, 4, 5, 1),
                new Kogtevran("Падма Патил", 1, 2, 3, 4, 5, 1),
                new Kogtevran("Маркус Белби", 1, 2, 3, 4, 5, 1),

        };
        Puffendui[] puffenduis = {
                new Puffendui("Захария Смит", 1, 2, 2, 3, 4),
                new Puffendui("Седрик Диггори", 1, 2, 5, 6, 7),
                new Puffendui("Джастин Финч-Флетчли", 1, 2, 1, 6, 2),

        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 1, 2, 3, 4, 5, 6, 7),
                new Slizerin("Грэхэм Монтегю", 1, 2, 3, 4, 5, 6, 7),
                new Slizerin("Грегори Гойл", 1, 2, 3, 4, 5, 6, 7),

        };
        for (Griffidor gryffindorStudent : griffidors) {
            gryffindorStudent.printDescriptionStudent();
            System.out.println();
        }
        for (Kogtevran kogtevranStudent : kogtevrans) {
            kogtevranStudent.printDescriptionStudent();
            System.out.println();
        }
        for (Puffendui puffenduiStudent : puffenduis) {
            puffenduiStudent.printDescriptionStudent();
            System.out.println();
        }
        for (Slizerin slizerinStudent : slizerins) {
            slizerinStudent.printDescriptionStudent();
            System.out.println();
        }

        learnBestGriffidorStudent(griffidors[0], griffidors[1]);
        learnBestKogtevranStudent(kogtevrans[1], kogtevrans[0]);
        learnBestPuffenduiStudent(puffenduis[1], puffenduis[2]);
        learnBestSlizerinStudent(slizerins[1], slizerins[2]);
    }

    static void learnBestGriffidorStudent(Griffidor aStudent, Griffidor bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }


    static void learnBestSlizerinStudent(Slizerin aStudent, Slizerin bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }

    static void learnBestPuffenduiStudent(Puffendui aStudent, Puffendui bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }

    static void learnBestKogtevranStudent(Kogtevran aStudent, Kogtevran bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго!");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого!");
        }
    }
}
