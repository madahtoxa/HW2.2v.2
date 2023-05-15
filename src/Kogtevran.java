public class Kogtevran extends Hogwards {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int magicPwr, int transgression,
                     int mind, int wisdom, int wit, int creativity) {
        super(name, magicPwr, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    protected void printDescriptionStudent() {
        System.out.println("Характеристика студента Kogtevran: ");
        System.out.println("student.getName() = " + this.getName());
        System.out.println("super.getMagicPwr() = " + this.getMagicPwr());
        System.out.println("student.getTransgression() = " + this.getTransgression());
        System.out.println("this.getMind() = " + this.getMind());
        System.out.println("this.getWisdom() = " + this.getWisdom());
        System.out.println("this.getWit() = " + this.getWit());
        System.out.println("this.getCreativity() = " + this.getCreativity());
    }

    @Override
    protected int rating() {
        return (this.magicPwr + this.transgression + this.mind + this.wisdom
                + this.wit + this.creativity);
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}

