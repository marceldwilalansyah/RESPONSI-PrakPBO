public class Player extends Karakter implements Tembak,Berlindung {
    private int armor;

    public Player (String idKarakter, String nama , int hp){
        super(idKarakter,nama,hp);
        this.armor = armor;
    }

    @Override
    public void damagemasuk( int damage){
        int damageMasuk = damage - armor;
        if (damageMasuk > 0) {
            setHp(gethp() - damageMasuk);
            System.out.println(getNama() + " Terkena" + damageMasuk + " damage!");
        } else {
            System.out.println(" Serangan ditahan oleh armor " + getNama() + "!");
        }
        if (gethp()<= 0 ){
            setHp(0);
            System.out.println(getNama() + " was KILLED");
        }
    }
    @Override
    public void Tembak(Karakter target){
        System.out.println(getNama() + " menembak " + target.getNama() + "1");
        target.damagemasuk(20);
    }
    @Override
    public void Berlindung(){
        this.armor += 5;
        System.out.println(getNama()+" armor bertambah");
    }
    @Override
    public void hpKarakter(){
        super.hpKarakter();
        System.out.println(" hp " + this.gethp());
    }
}
