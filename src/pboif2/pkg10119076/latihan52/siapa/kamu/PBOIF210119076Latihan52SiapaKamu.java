/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan52.siapa.kamu;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Siapa Kamu
 */
public class PBOIF210119076Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setMataKuliah("PBO");
        
        System.out.println("NIP Dosen : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        mahasiswa.setUmur(17);
        mahasiswa.setNama("Nindi");
        mahasiswa.setKelas("PBO");
        
        System.out.println("NIM Mahasiswa : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
    
}
