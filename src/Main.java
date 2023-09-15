package codeforces_solutions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        codeforces_solutions.Owner alex = new codeforces_solutions.Owner("Alexey");
       codeforces_solutions.Vaccination chumka = new codeforces_solutions.Vaccination("chumka", LocalDate.of(2010, 12, 5));
        codeforces_solutions.Animal barsik = new codeforces_solutions.Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), codeforces_solutions.Color.BLACK, "siamskiy");
        System.out.println(barsik.getName());
//        barsik.wakeUp();
        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new codeforces_solutions.Vaccination("столбняк", LocalDate.now())));
        System.out.println(barsik.getVaccinations());
        //Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), codeforces_solutions.Color.WHITE);
        List<codeforces_solutions.Animal> animals = new ArrayList<>();
        animals.add(barsik);
        codeforces_solutions.Animal barbos;
        animals.add(barbos);
        for (codeforces_solutions.Animal animal : animals) {
            if (animal instanceof codeforces_solutions.Cat) {
                System.out.println(((codeforces_solutions.Cat) animal).getBreed());
            }
            System.out.println(animal.gitNem());
        }
        ((codeforces_solutions.Cat) barsik).getBreed();
//        barsik.eat();
//        barsik.wakeUp();
//        barsik.findFood();
//        barsik.toPlay();
//        barsik.goToSleep();
        barsik.lifeCycle();

    }
}