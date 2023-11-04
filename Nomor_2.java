import java.util.Scanner;

public class Nomor_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opsi;
        double bilangan1, bilangan2;
        double hasil = 0;

        while (true) {
            System.out.println("\nPilih operasi matematika:");
            System.out.println("0. Keluar");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (x)");
            System.out.println("4. Pembagian (:)");
            System.out.print("\nMasukkan pilihan: ");
            opsi = input.next().charAt(0);

            if (opsi == '0') {
                System.out.println("\nTerima kasih :)");
                break;
            }

            if (opsi >= '1' && opsi <= '4') {
                System.out.print("Bilangan ke-1: ");
                bilangan1 = input.nextDouble();
                System.out.print("Bilangan ke-2: ");
                bilangan2 = input.nextDouble();

                if (opsi == '1') {
                    hasil = bilangan1 + bilangan2;
                } else if (opsi == '2') {
                    hasil = bilangan1 - bilangan2;
                } else if (opsi == '3') {
                    hasil = bilangan1 * bilangan2;
                } else if (opsi == '4') {
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Tak terdefinisi");
                        continue;
                    }
                }
                System.out.println("HASIL: " + hasil);
            } else {
                System.out.println("Pilihan hanya dari nomor 1-4");
            }
        }
        input.close();
    }
}