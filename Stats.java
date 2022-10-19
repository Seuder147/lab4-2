
public class Stats {
    private Stats state;

    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;

    public Stats(int str, int dex, int con, int intel, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }

    public Stats(Stats state){
        this.state = state;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getIntel() {
        return intel;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }
    public static Stats generate(){
        return new Stats(Dice.rollStat(),Dice.rollStat(),Dice.rollStat(),Dice.rollStat(),Dice.rollStat(),Dice.rollStat());
    }
    public void printStats(){
        System.out.println("Attributes sheet\nStrength: "+str+"\nDexterity: "
                +dex+"\nConstitution: "+con+"\nIntelligence: "+intel+
                "\nWisdom: "+wis+"\nCharisma: "+cha);
    }
    public Memento save(){
        return new Memento(this.str,this.dex,this.con,this.intel,this.wis,this.cha);
    }
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.str = memento.str;
        this.dex = memento.dex;
        this.con = memento.con;
        this.intel = memento.intel;
        this.wis = memento.wis;
        this.cha = memento.cha;
    }
    private class Memento{
        private int str,dex,con,intel,wis,cha;

        public Memento(int str, int dex, int con, int intel, int wis, int cha) {
            this.str = str;
            this.dex = dex;
            this.con = con;
            this.intel = intel;
            this.wis = wis;
            this.cha = cha;
        }
    }
}

