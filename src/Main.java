
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI GAME PERANG DIMULAI ===\n");

        Tembak player1 = new Player("P01", "Kopassus", 100);

        Karakter musuh = new Enemy("E01", "Alien", 100);

        System.out.println("--- STATUS AWAL ---");
        System.out.println("Player: " + ((Karakter) player1).getNama() + " | HP: " + ((Karakter) player1).gethp());
        System.out.println("Musuh: " + musuh.getNama() + " | HP: " + musuh.gethp());
        System.out.println();

        System.out.println("--- PERTEMPURAN ---");

        player1.Tembak(musuh);

        if (musuh instanceof Tembak) {
            ((Tembak) musuh).Tembak(((Karakter) player1));
        }

        if (player1 instanceof Berlindung) {
            ((Berlindung) player1).Berlindung(); // Menambah armor
        }

        player1.Tembak(musuh);
        player1.Tembak(musuh);
        player1.Tembak(musuh);
        player1.Tembak(musuh);

        System.out.println("\n--- STATUS AKHIR ---");
        System.out.println("Player: " + ((Karakter) player1).getNama() + " | HP: " + ((Karakter) player1).gethp());
        System.out.println("Musuh: " + musuh.getNama() + " | HP: " + musuh.gethp());
    }
}
