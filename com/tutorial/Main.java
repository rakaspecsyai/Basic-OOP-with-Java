package com.tutorial;


//class tanpa constructor
class Polos {
    String dataString;
    int dataInteger;
    
}

//class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    //constructor
    Mahasiswa(String inputName, String inputNIM, String inputJurusan){
        nama = inputName;
        NIM = inputNIM;
        jurusan = inputJurusan;
    }
    
    void getInfo(){
        System.out.println(nama);;
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa raka = new Mahasiswa("Raka", "12345", "Teknik Persabuan");
        Mahasiswa haqi = new Mahasiswa("Haqi", "177071", "Manajemen Konflik Peradu Domba");


        raka.getInfo();
        System.out.println();
        haqi.getInfo();
    }
}
