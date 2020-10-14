public class Main {
    public static void main(String[] args) {
        LightSwitch alexa = new LightSwitch(123987,false);
        System.out.println(alexa.Id);
        System.out.println(alexa.isOn);
        alexa.setIsOn();
        System.out.println(alexa.isOn());
    }
}
