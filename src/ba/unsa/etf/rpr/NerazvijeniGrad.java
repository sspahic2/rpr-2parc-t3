package ba.unsa.etf.rpr;

public class NerazvijeniGrad extends Grad {

    public NerazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public NerazvijeniGrad() {
    }

    @Override
    public int brojBolnica() {
        int brojBolnica = 0, brojStanovnika = this.getBrojStanovnika();
        while(brojStanovnika > 0) {
            brojBolnica++;
            brojStanovnika -= 100000;
        }
        return brojBolnica;
    }
}
