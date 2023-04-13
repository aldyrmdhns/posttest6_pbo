public abstract class Character {
    protected String name;
    protected String title;
    protected String element;
    protected String association;
    protected String region;

    public void Display(){
        System.out.println("=====================================");
        System.out.println("| Name          : " + this.name);
        System.out.println("| Title         : " + this.title);
        System.out.println("| Element       : " + this.element);
        System.out.println("| Association   : " + this.association);
        System.out.println("| Region        : " + this.region);
    }

    protected abstract void regionBuff(String name);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getTitle();

    public abstract void setTitle(String title);

    public abstract String getElement();

    public abstract void setElement(String element) ;

    public abstract String getAssociation();

    public abstract void setAssociation(String association);

    public abstract String getRegion();

    public abstract void setRegion(String region);
}
