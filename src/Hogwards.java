public class Hogwards {
    String name;
    int magicPwr;
    int transgression;

    public Hogwards(String name, int magicPwr, int transgression) {
        this.name = name;
        this.magicPwr = magicPwr;
        this.transgression = transgression;
    }

    protected void printDescriptionStudent() {
    }

    protected int rating() {
        return (this.magicPwr + this.transgression);
    }

    protected void learnBestStudent(Hogwards aSt, Hogwards bSt) {

    }

    public int getMagicPwr() {
        return magicPwr;
    }

    public void setMagicPwr(int magicPwr) {
        this.magicPwr = magicPwr    ;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
