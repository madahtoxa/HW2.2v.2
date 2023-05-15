public class Puffendui extends Hogwards {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int witchcraft, int transgression,
                            int diligence, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    protected void printDescriptionStudent() {
        System.out.println("Характеристика студента Puffendui: ");
        System.out.println("student.getName() = " + this.getName());
        System.out.println("super.getMagicPwr() = " + this.getMagicPwr());
        System.out.println("student.getTransgression() = " + this.getTransgression());
        System.out.println("this.getDiligence() = " + this.getDiligence());
        System.out.println("this.getLoyalty() = " + this.getLoyalty());
        System.out.println("this.getHonesty() = " + this.getHonesty());
    }

    @Override
    protected int rating() {
        return (this.magicPwr + this.transgression + this.diligence
                + this.loyalty + this.honesty);
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}