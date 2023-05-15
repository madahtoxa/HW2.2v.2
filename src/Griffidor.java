import java.util.Scanner;

public class Griffidor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffidor(String name, int magicPwr, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPwr, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    protected void printDescriptionStudent() {
        System.out.println("Характеристика студента Griffidor: ");
        System.out.println("student.getName() = " + this.getName());
        System.out.println("super.getMagicPwr() = " + this.magicPwr);
        System.out.println("student.getTransgression() = " + this.getTransgression());
        System.out.println("student.nobility = " + this.getNobility());
        System.out.println("student.getHonor() = " + this.getHonor());
        System.out.println("student.getBravery() = " + this.getBravery());
    }

    @Override
    protected int rating() {
        return (this.magicPwr + this.getTransgression() +
                this.getNobility() + this.getHonor() + this.getBravery());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    Scanner sc = new Scanner(System.in);

    public void versus() {
        System.out.println("Номер первого ученика");
        int a = sc.nextInt();
        System.out.println("Номер второго ученика");
        int b = sc.nextInt();

    }

}

