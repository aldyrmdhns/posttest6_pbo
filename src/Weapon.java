public class Weapon {
    private String name;
    private int rarity;
    private String family;
    private String affix;
    private double baseAttack;

    public Weapon(String isName, int isRarity, String isFamily, String isAffix, Double isBase){
        this.name = isName;
        this.rarity = isRarity;
        this.family = isFamily;
        this.affix = isAffix;
        this.baseAttack = isBase;
    }

    public void Display(){
        System.out.println("=====================================");
        System.out.println("| Name          : " + this.name);
        System.out.println("| Rarity        : " + this.rarity);
        System.out.println("| Family        : " + this.family);
        System.out.println("| Affix         : " + this.affix);
        System.out.println("| Base Attack   : " + this.baseAttack);
        System.out.println("=====================================");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRarity() {
        return this.rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAffix() {
        return this.affix;
    }

    public void setAffix(String affix) {
        this.affix = affix;
    }

    public double getBaseAttack() {
        return this.baseAttack;
    }

    public void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

}
