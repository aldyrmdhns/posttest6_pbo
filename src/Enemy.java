public class Enemy extends Character{
    private String grade;
    private String category;

    public Enemy(String isName, String isTitle, String isElement, String isAssociation, String isRegion,String isGrade, String isCategory){
        this.name = isName;
        this.title = isTitle;
        this.element = isElement;
        this.association = isAssociation;
        this.region = isRegion;
        this.grade = isGrade;
        this.category = isCategory;
    }

    public void Display(){
        super.Display();
        System.out.println("| Grade : " + this.grade);
        System.out.println("| Category   : " + this.category);
        System.out.println("=====================================");
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

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
