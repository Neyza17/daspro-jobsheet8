import java.util.Scanner;

public class AtletCabor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPoliteknik, i, k;
        String namaPoliteknik, dataAtlet, namaAtlet;

        System.out.print("Masukkan jumlah Politeknik yang mendaftar : ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        String[] cabangOlahraga = {"Badminton", "Basket", "Tenis Meja", "Bola Voli"};
        dataAtlet = "";

        for (i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama Politeknik ke- " + i + ":");
            namaPoliteknik = sc.nextLine();
            dataAtlet += "Politeknik" + i + "("+ namaPoliteknik +") :\n";

            for (String cabang : cabangOlahraga) {
                dataAtlet += "cabang" + cabang + ":\n";

                for (k = 1; k <= 5; k++) {
                    System.out.print("Masukkan nama Atlet ke- " + k + "untuk cabang" + cabang + ":");
                    namaAtlet = sc.nextLine();
                    dataAtlet += "Atlet" + k + ":" + namaAtlet + "\n";
                }
            }
            dataAtlet += "\n";
        }
        System.out.println("Nama Atlet Porseni 2024");
        System.out.println(dataAtlet);
        sc.close();
    }
}
