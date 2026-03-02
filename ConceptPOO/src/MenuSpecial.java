public final class MenuSpecial extends Plat {
    private final double reduction = 0.1;

    public MenuSpecial(String nom, double prix) {
        super(nom, prix);
    }

    public double calculerPrixFinal() {
        return (prix - (prix * reduction)) + (prix * tva) ;
    }
}

