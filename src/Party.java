public final class Party {
    private final String partyName = "Party 1";
    private String[] member;
    private String[] element;

    public final void Display(){
        if (member == null) {
            System.out.println("Your Party's Empty");
        } else{
            System.out.println(" 1. " + this.member[0] + " | Element : " + this.element[0]);
            System.out.println(" 2. " + this.member[1] + " | Element : " + this.element[1]);
            System.out.println(" 3. " + this.member[2] + " | Element : " + this.element[2]);
            System.out.println(" 4. " + this.member[3] + " | Element : " + this.element[3]);
        }
    }

    public final String getPartyName() {
		return this.partyName;
	}

    public final String[] getElement() {
        return this.element;
    }

    public final void setElement(String[] element) {
        this.element = element;
    }

    public final String[] getMember() {
        return this.member;
    }

    public final void setMember(String[] member) {
        this.member = member;
    }
}
