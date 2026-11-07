public class Enemy extends Karakter implements Tembak{
    public Enemy ( String idkarakter, String Nama, int hp){
        super(idkarakter,Nama,hp);
    }
    @Override
    public void damagemasuk(int damage){
        setHp(gethp()-damage);
        if (gethp()<=0){
            setHp(0);
            System.out.println("Enemy "+getNama()+" was KILLED");
        }
    }
    @Override
    public void Tembak(Karakter Target){
        System.out.println("Enemy "+getNama()+" menembak "+Target.getNama()+"!");
        damagemasuk(20);
    }
}
