public class Main {
    public static void main(String[] args) {
        Car honda = new Car("japan", "accord", 200);
        Car toyota = new Car("japan", "camry", 180, 4, 4, true);
        Boat seasTheDay = new Boat("chin", "chai", 1200, false, 4);
        Boat serenity = new Boat("europe", "espain", 800, true, 4);
        System.out.println(honda.getMake());
        System.out.println(honda.getModel());
        System.out.println(honda.getTopSpeed());
        System.out.println(toyota.getMake());
        System.out.println(toyota.getModel());
        System.out.println(toyota.getTopSpeed());
        System.out.println(toyota.getNumberOfDoors());
        System.out.println(toyota.getNumberOfWheels());
        System.out.println(toyota.isAutomatic());
        System.out.println(seasTheDay.getMake());
        System.out.println(seasTheDay.getTopSpeed());
        System.out.println(seasTheDay.getNumberOfMotor());
        System.out.println(serenity.getTopSpeed());
        System.out.println(serenity.getModel());
        System.out.println(serenity.hashCode());

    }
}
