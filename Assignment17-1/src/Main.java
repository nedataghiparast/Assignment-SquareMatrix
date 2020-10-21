public class Main {
    public static void main(String[] args) {

        WindInstruments harmonica = new WindInstruments("harmonica");
        StringInstruments sitar = new StringInstruments("sitar");
        PercussionInstruments daf = new PercussionInstruments("daf");
        Department art = new Department("seattleArt");
        art.addInstrument(daf);
        art.addInstrument(harmonica);
        art.addInstrument(sitar);
        System.out.println(harmonica.getName());
        System.out.println(sitar.getName());
        System.out.println(daf.getName());
        System.out.println(art.getName());
        System.out.println(art.getNumberOfInstruments());
        System.out.println(art.getInstruments());
    }
}
