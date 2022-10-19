public class Demo {
    public static void main(String[] args) {
        Character player = new Character("Elana","assassin","human");

        Stats temp = Stats.generate();
        player.setAttributes(temp);
        player.pritnSheet();

        CareTaker careTaker = new CareTaker();
        temp = Stats.generate();
        temp.printStats();
        careTaker.add(temp.save());

        temp = Stats.generate();
        temp.printStats();
        careTaker.add(temp.save());

        temp.undoToLastSave(careTaker.get(0));
        temp.printStats();

        temp.undoToLastSave(careTaker.get(1));
        temp.printStats();

    }
}