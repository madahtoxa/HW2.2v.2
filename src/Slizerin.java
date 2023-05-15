public class Slizerin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slizerin(String name, int witchcraft, int transgression,
                    int cunning, int determination, int ambition,
                    int resourcefulness, int thirstForPower) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    protected void printDescriptionStudent() {
        System.out.println("Характеристика студента Slizerin: ");
        System.out.println("student.getName() = " + this.getName());
        System.out.println("super.getMagicPwr() = " + this.getMagicPwr());
        System.out.println("student.getTransgression() = " + this.getTransgression());
        System.out.println("this.getCunning() = " + this.getCunning());
        System.out.println("this.getDetermination() = " + this.getDetermination());
        System.out.println("this.getAmbition() = " + this.getAmbition());
        System.out.println("this.getResourcefulness() = " + this.getResourcefulness());
        System.out.println("this.getThirstForPower() = " + this.getThirstForPower());
    }

    @Override
    protected int rating() {
        return (this.magicPwr + this.transgression + this.cunning +
                this.determination + this.ambition + this.resourcefulness + this.thirstForPower);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }


}

