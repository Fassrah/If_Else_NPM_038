#  If Else While Loop

1. Setelah deklarasi variabel, biasanya akan ada kode tambahan untuk mengambil input dari pengguna, seperti meminta pengguna memasukkan nilai bilangan1, bilangan2, dan opsi, kemudian melakukan operasi matematika berdasarkan opsi, dan menyimpan hasilnya dalam variabel hasil. Namun, potongan kode yang sebenarnya untuk mengambil input dan melakukan operasi matematika belum ditampilkan dalam potongan kode yang Anda berikan.

       Scanner input = new Scanner(System.in);
              char opsi;
              double bilangan1, bilangan2;
              double hasil = 0;

2. Dalam sebuah loop while (true), program terus menampilkan menu dan menunggu masukan dari pengguna. Opsi yang dipilih oleh pengguna disimpan dalam variabel opsi, namun kode tidak menunjukkan inisialisasi variabel input yang digunakan untuk menerima input pengguna. Untuk menerima input, biasanya digunakan kelas Scanner.

       while (true) {
                  System.out.println("\nPilih operasi matematika:");
                  System.out.println("0. Keluar");
                  System.out.println("1. Penjumlahan (+)");
                  System.out.println("2. Pengurangan (-)");
                  System.out.println("3. Perkalian (x)");
                  System.out.println("4. Pembagian (:)");
                  System.out.print("\nMasukkan pilihan: ");
                  opsi = input.next().charAt(0);

3. Potongan kode yang diberikan adalah bagian dari struktur pengendalian yang terletak di dalam loop tak terbatas dalam bahasa pemrograman Java. Lebih tepatnya, ini adalah sebuah pernyataan if yang mengevaluasi nilai dari variabel opsi. Jika nilai opsi sama dengan karakter '0', ini menandakan bahwa pengguna telah memilih untuk keluar dari program.

        if (opsi == '0') {
                        System.out.println("\nTerima kasih :)");
                        break;
        }

4. Pernyataan if yang mengevaluasi apakah nilai dari variabel opsi berada dalam rentang '1' hingga '4', termasuk karakter '1', '2', '3', dan '4'. Ini memeriksa apakah input pengguna adalah untuk melakukan operasi matematika (penjumlahan, pengurangan, perkalian, atau pembagian).

       if (opsi >= '1' && opsi <= '4') {
                      System.out.print("Bilangan ke-1: ");
                      bilangan1 = input.nextDouble();
                      System.out.print("Bilangan ke-2: ");
                      bilangan2 = input.nextDouble();

5. Kode tersebut melakukan operasi matematika berdasarkan nilai dari variabel opsi. Jika opsi adalah '1', program akan menjumlahkan bilangan1 dan bilangan2. Untuk opsi '2', program akan mengurangkan bilangan2 dari bilangan1. Pada opsi '3', program akan mengalikan kedua bilangan. Jika opsi adalah '4', program akan membagi bilangan1 dengan bilangan2, kecuali jika bilangan2 sama dengan nol, maka program akan mencetak "Tak terdefinisi".

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

6. System.out.println() adalah perintah dalam Java yang digunakan untuk mencetak teks ke layar. Dalam kasus ini, teks "HASIL: " akan dicetak diikuti dengan nilai dari variabel hasil.

       System.out.println("HASIL: " + hasil);

7. Bagian ini adalah bagian dari struktur kendali if-else. Jika kondisi dalam if sebelumnya tidak terpenuhi, maka bagian else akan dijalankan. Di sini, pesan "Pilihan hanya dari nomor 1-4" akan dicetak ke konsol.

        } else {
            System.out.println("Pilihan hanya dari nomor 1-4");
        }

8. Perintah input.close() digunakan untuk menutup sumber input. Dalam konteks ini, sepertinya input adalah objek dari kelas yang mungkin digunakan untuk menerima masukan dari pengguna. Dengan memanggil metode close(), sumber daya input ditutup setelah penggunaan selesai.

       input.close();
