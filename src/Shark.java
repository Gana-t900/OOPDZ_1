import codeforces_solutions.Color;
import codeforces_solutions.Owner;
import codeforces_solutions.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Shark extends codeforces_solutions.Animal {
    public Shark(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }
}
