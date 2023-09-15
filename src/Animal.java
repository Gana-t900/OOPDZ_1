package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected double weight;
    protected codeforces_solutions.Owner owner;
    protected LocalDate birthDay;
    protected List<codeforces_solutions.Vaccination> vaccinations;
    protected codeforces_solutions.Color color;
    protected final String TYPE = this.getClass().getSimpleName();

    public Animal(String name, double weight, codeforces_solutions.Owner owner, LocalDate birthDay, List<codeforces_solutions.Vaccination> vaccinations, codeforces_solutions.Color color) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
    }

    public Animal(String name, double weight, codeforces_solutions.Owner owner, LocalDate birthDay, codeforces_solutions.Color color) {
        this(name, weight, owner, birthDay, null, color);
    }

    public Animal(String name) {
        this.name = name;
    }


    public void lifeCycle() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
    private void wakeUp() {
        System.out.println(this.TYPE + " проснулся.");
    }

    private void findFood() {
        System.out.println(this.TYPE + " ищет еду.");
    }

    private void eat() {
        System.out.println(this.TYPE + " кушает.");
    }

    private void toPlay() {
        System.out.println(this.TYPE + " играет.");
    }

    private void goToSleep() {
        System.out.println(this.TYPE + " собирается спать.");
    }

    public void sound() {
        System.out.println(this.TYPE + " издает звук.");
    }
    // getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public codeforces_solutions.Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<codeforces_solutions.Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<codeforces_solutions.Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public codeforces_solutions.Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }
    private void gittoGo() {
System.out.println(this.TYPE + "двигаться");
    }
    private  void gitFly(){
        System.out.println(this.TYPE + "летать");
    }
    private void gitSwim(){
        System.out.println(this.TYPE + "плавать");
    }
}
