public class Rogue implements Character {
    private String name;
    private String characterType = "Rogue";

    public Rogue(String name, String characterType) {
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
        System.out.println(this.name + " throwing knife");

    }

    @Override
    public void closeAttack() {
        System.out.println(this.name + " stabbing with knife");

    }

    @Override
    public void specialAttack() {
        System.out.println(this.name + " turning invisible");

    }
}
