public class Biodata {
    public static void main(String[] args) {
        //Head
        String biodata = "BIODATA";
        System.out.println(biodata);

        //nama lengkap
        String namaDepan = "Risa Meilenia";
        String namaBelakang = "Ananda Putri";
        String namaLengkap = namaDepan+" "+namaBelakang;
        System.out.println("Nama Lengkap : "+namaLengkap);

        //tempat tanggal lahir
        String tempat = "KEREMBONG";
        int tgl = 31;
        int bln =12;
        int thn = 2000;
        System.out.println("TTL : "+tempat+"/"+tgl+"/"+bln+"/"+thn);

        //umur
        int tahuna = 2000;
        int tahunb = 2022;
        int umur = 2022-2000;
        System.out.println("Umur : "+umur+" Tahun");

        //jenis kelamin
        char jk = 'P';
        System.out.println("Jenis Kelamin : "+jk);

        //alamat
        String alamat = "Kerembong";
        System.out.println("Alamat : "+alamat);

        //pendidikan
        String sd = "Sekolah Dasar Negri 1 Kerembong";
        String smp = "MTS Sirajul Huda";
        String smk = "SMK Islam Sirajul Huda";
        String kuliah = "STMIK Lombok";
        System.out.println("Riwayat Pendidikan");
        System.out.println("Sekolah Dasar : "+sd);
        System.out.println("Sekolah Menengah Pertama : "+smp);
        System.out.println("Sekolah Menengah Kejuruan : "+smk);
        System.out.println("Sekolah Tinggi : "+kuliah);


    }
}
