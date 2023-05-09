public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор Lego", 10, 20);
        Toy toy2 = new Toy(2, "Плюшевый медведь", 5, 10);
        Toy toy3 = new Toy(3, "Футбольный мяч", 20, 70);


        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
    
    


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы выйграли: " + prizeToy.getName());
        }
    }
}
