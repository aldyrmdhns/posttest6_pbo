public class Hero extends Character implements Skills{
    private double attack;
    private int hp;
    private double deffense;
    private int elementalMastery;
    private double criticalRate;
    private double criticalDamage;
    private String[] skills;
    private String[] passive;

    public Hero(String isName, String isTitle, String isElement, String isAssociation, String isRegion,double isAttack, int isHp, double isDeff, int isElemental, double isCr, double isCd, String[] isSkill, String[] isPassive){
        this.name = isName;
        this.title = isTitle;
        this.element = isElement;
        this.association = isAssociation;
        this.region = isRegion;
        this.attack = isAttack;
        this.hp = isHp;
        this.deffense = isDeff;
        this.elementalMastery = isElemental;
        this.criticalRate = isCr;
        this.criticalDamage = isCd;
        this.skills = isSkill;
        this.passive = isPassive;
    }

    public void Display(){
        super.Display();
        System.out.println("=====================================");
    }

    public void activeSkills(){
        System.out.println("====== Skill List ======");
        System.out.println(" 1st Skill : " + this.skills[0]);
        System.out.println(" 2nd Skill : " + this.skills[1]);
        System.out.println(" 3rd Skill : " + this.skills[2]);
    }

    public void passiveSkills(){
        System.out.println("====== Passive Skill List ======");
        System.out.println(" 1st Passive : " + this.passive[0]);
        System.out.println(" 2nd Passive : " + this.passive[1]);
    }

    public void Display(String names){
        if (super.name.equals(names)) {
            System.out.println("=====================================");
            System.out.println("| Name              : " + super.name);
            System.out.println("| Element           : " + super.element);
            System.out.println("| Attack            : " + this.attack);
            System.out.println("| HP                : " + this.hp);
            System.out.println("| Deffense          : " + this.deffense);
            System.out.println("| Elemental Mastery : " + this.elementalMastery);
            System.out.println("| Critical Rate     : " + this.criticalRate);
            System.out.println("| Critical Damage   : " + this.criticalDamage);
            activeSkills();
            passiveSkills();

        }
    }

    public void regionBuff(String names){
        if (super.name.equals(names)){
            if (super.region.equals("Mondstat")){
                System.out.println("your Character's Buff List");
                System.out.println("==========================");
                System.out.println("Mondstat Character Got +20% Movement Speed");
            }
            else if (super.region.equals("Liyue")){
                System.out.println("your Character's Buff List");
                System.out.println("==========================");
                System.out.println("Liyue Character Got -25% Stamina Reduction and +15% HP Increase");
            } else if (super.region.equals("Inazuma")){
                System.out.println("your Character's Buff List");
                System.out.println("==========================");
                System.out.println("Inazuma Character Got +25% Increased chance while fishing");
            } else if (super.region.equals("Sumeru")){
                System.out.println("your Character's Buff List");
                System.out.println("==========================");
                System.out.println("Sumeru Character Got +50% increased chance to double the potion");
            }
        }
    }

    public String getName(){
        return super.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTitle(){
        return super.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getElement(){
        return super.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAssociation(){
        return super.association;
    }

    public void setAssociation(String association){
        this.association = association;
    }

    public String getRegion(){
        return super.region;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getDeffense() {
        return this.deffense;
    }

    public void setDeffense(double deffense) {
        this.deffense = deffense;
    }

    public int getElementalMastery() {
        return this.elementalMastery;
    }

    public void setElementalMastery(int elementalMastery) {
        this.elementalMastery = elementalMastery;
    }

    public double getCriticalRate() {
        return this.criticalRate;
    }

    public void setCriticalRate(double criticalRate) {
        this.criticalRate = criticalRate;
    }

    public double getCriticalDamage() {
        return this.criticalDamage;
    }

    public void setCriticalDamage(double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getPassive() {
        return this.passive;
    }

    public void setPassive(String[] passive) {
        this.passive = passive;
    }
}
