public class Character {
    private String name;
    private String dndclass;
    private String race;
    private Stats attributes;

    public Character(String name, String dndclass, String race) {
        this.name = name;
        this.dndclass = dndclass;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDndclass() {
        return dndclass;
    }

    public void setDndclass(String dndclass) {
        this.dndclass = dndclass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }
    public void pritnSheet(){
        System.out.println("Name: "+name+"\nClass: "+dndclass+"\nRace: "+race);
        attributes.printStats();
    }
}
