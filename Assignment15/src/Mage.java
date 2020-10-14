public class Mage implements Character {
    private String name;
    private String characterType = "Mage";

    public Mage(String name, String characterType) {
        this.name = name;
        this.characterType = characterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    @Override
    public void rangedAttack() {
        System.out.println(this.name  +" firing magic");

    }

    @Override
    public void closeAttack() {
        System.out.println(this.name  + " staff attack");

    }

    @Override
    public void specialAttack() {
        System.out.println(this.name  + " magic attack");

    }
}
