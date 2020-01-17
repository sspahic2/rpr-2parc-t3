package ba.unsa.etf.rpr;

public class SrednjeRazvijeniGrad extends Grad {

    public SrednjeRazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public SrednjeRazvijeniGrad() { }

    @Override
    public int brojBolnica() {
        int brojBolnica = 0, brojStanovnika = this.getBrojStanovnika();
        while(brojStanovnika > 0) {
            brojBolnica++;
            brojStanovnika -= 25000;
        }
        return brojBolnica;
    }
}
