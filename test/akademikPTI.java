package test;
import java.util.*;

class Peserta {
    String nama;
    int waktu;
}

class blueprint {
    public ArrayList Pebalap = new ArrayList();
    public Peserta P[] = new Peserta[5];
    public Scanner io = new Scanner(System.in);

    public void input() {
        for (int i = 0; i < 5; i++) {
            P[i] = new Peserta();
            System.out.print("Nama Peserta " + (i+1) + " : ");
            P[i].nama = io.next();
            System.out.print("Waktu Peserta " + (i+1) + " (Detik) : ");
            P[i].waktu = io.nextInt();
            Pebalap.add(P[i].nama);
            Pebalap.add(P[i].waktu);
            System.out.println();
        }
    }

    public void ubah() {
        System.out.print("Peserta nomor → ");
        int ubh = io.nextInt();
        Pebalap.remove(P[ubh-1]);
        System.out.print("Nama Pengganti : ");
        P[ubh-1].nama = io.next();
        System.out.print("Waktu Peserta (Detik) : ");
        P[ubh-1].waktu = io.nextInt();
        Pebalap.add(P[ubh-1].nama);
        Pebalap.add(P[ubh-1].waktu);
        System.out.println();
    }

    public void hapus() {
        for (int i = 0; i < P.length; i++) {
            Pebalap.remove(P[i]);
        }
        System.out.println("Semua Peserta Tereliminasi");
        System.out.println();
    }

    public void cari() {
        System.out.print("Cari Nama : ");
        String carinama = io.next();
        for(int i = 0 ; i < P.length ; i++) {
            if (P[i].nama.equals(carinama)) {
                System.out.println("Peserta Terdaftar");
            } else {
                System.out.println();
            }
        }
    }


    public void lihat() {
        for (int i = 0; i < P.length ; i++) {
            System.out.println("Peserta " + (i + 1) + " : " + P[i].nama + " dengan waktu " + P[i].waktu + " detik");
        }
    }

    public void juara() { // Maaf Logic Error Kak
//        Arrays.sort(P[i].waktu); ERROR // Collection.sort(Pebalap.get(P[i].waktu); ERROR
        // Collections.sort(Pebalap);
        int juara[] = new int[3];
        ArrayList<Integer> checker = new ArrayList<>();

        for (int i = 0; i < P.length; i++) {
            checker.add(i, P[i].waktu);
        }
        Collections.sort(checker);

        for (int i = 0; i < 3; i++) {
            juara[i] = checker.get(i);
        }        
        System.out.println("Juara 1 : " + juara[0]);
        System.out.println("Juara 2 : " + juara[1]);
        System.out.println("Juara 3 : " + juara[2]);
    }
}

public class akademikPTI {
    public static void main(String[] args) {
        blueprint lomba = new blueprint();
        Scanner io = new Scanner(System.in);
        boolean go = true;

        while(go) {
            System.out.println("MENU : ");
            System.out.println("1. Input Peserta");
            System.out.println("2. Ubah Peserta");
            System.out.println("3. Hapus Peserta");
            System.out.println("4. Cari Peserta");
            System.out.println("5. Lihat Semua Peserta");
            System.out.println("6. Lihat Juara");
            System.out.println("7. Keluar");
            System.out.print(  "[Pilih Menu] → ");
            int menu = io.nextInt();
            System.out.println();
            switch (menu) {
                case 1:
                    lomba.input();
                    break;
                case 2:
                    lomba.ubah();
                    break;
                case 3:
                    lomba.hapus();
                    break;
                case 4:
                    lomba.cari();
                    break;
                case 5:
                    lomba.lihat();
                    break;
                case 6:
                    lomba.juara();
                    break;
                case 7:
                go = false;

            }
            System.out.println();
        }
    }
}
