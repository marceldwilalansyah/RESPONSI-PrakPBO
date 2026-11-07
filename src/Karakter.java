public abstract class Karakter {
    public static final int MAX_hp = 100;
    private final String idKarakter;

    private String nama;
    private int hp;

    public Karakter (String idKarakter){
        this.idKarakter = idKarakter;
        this.nama = "NPC";
        this.hp = 100;
    }
     public Karakter( String idKarakter, String nama, int hp){
        this.idKarakter = idKarakter;
        this.nama = nama;
        this.hp = hp;
     }
     public abstract void damagemasuk(int damage);

    public void hpKarakter(){
        System.out.println(" Nama " + nama + "Hp " + hp);
    }

    public String getNama (){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public int gethp(){
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getidKarakter(){
        return this.idKarakter;
    }
}
