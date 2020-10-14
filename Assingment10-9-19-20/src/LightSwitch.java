public class LightSwitch {
    public int Id;
    public boolean isOn;

    public LightSwitch(int Id, boolean isOn) {
        this.Id = Id;
        this.isOn = isOn;

    }

    public int getId() {

        return Id;
    }

    public void setId(int id) {

        Id = id;
    }

    public boolean isOn() {

        return isOn;
    }

    public void setIsOn() {
        if (isOn == true) {
            System.out.println("if isOn true should change to false");
            this.isOn = false;
        } else if (isOn == false) {
            System.out.println("if isOn false should change to true");
            this.isOn = true;
        }
    }
}

