package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Cat extends codeforces_solutions.Animal {
    private String breed;

    public Cat(String name, double weight, codeforces_solutions.Owner owner, LocalDate birthDay, List<codeforces_solutions.Vaccination> vaccinations, codeforces_solutions.Color color, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}