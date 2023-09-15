import codeforces_solutions.Color;
import codeforces_solutions.Owner;
import codeforces_solutions.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Duck extends codeforces_solutions.Animal {
    private String breed;

    public void Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, String breed) {
        super(name, weight, birthDay, owner, vaccinations, color);
        this.breed = breed;
    }

    public Duck(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public String getBreed() {
        return breed;
    }
}
