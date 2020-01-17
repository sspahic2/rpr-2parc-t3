package ba.unsa.etf.rpr;

public class RazvijeniGrad extends Grad {

    public RazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public RazvijeniGrad() {
    }

    @Override
    public int brojBolnica() {
        int brojBolnica = 0, brojStanovnika = this.getBrojStanovnika();
        while(brojStanovnika > 0) {
            brojBolnica++;
            brojStanovnika -= 10000;
        }
        return brojBolnica;
    }
}
