package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class PerpustakaanArray {
    public static void main(String[] args) {
        int menu,index,pencarian;
        String masukan;
        Scanner input =new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Scanner nomor = new Scanner(System.in);
        Scanner cari = new Scanner(System.in);
        ArrayList<String> judul_buku= new ArrayList<String>();

        do{
            System.out.println("\n\t|PILIH MENU|  ");
            System.out.println("\t1. Cek Buku Yang Tersedia");
            System.out.println("\t2. Tambahkan Buku");
            System.out.println("\t3. Cari Nomor Urutan Buku");
            System.out.println("\t4. Hapus Buku");
            System.out.println("\t5. Tutup");
            System.out.println("\t________________________________");
            System.out.print("\tPilihan Anda : ");
            menu=input.nextInt();
                if(menu==1){
                    if(judul_buku.isEmpty()){
                        judul_buku.add("\n\t"+"Interaksi Manusia Dan Komputer");
                        judul_buku.add("\n\t"+"Infrstruktur Teknologi Informasi");
                        judul_buku.add("\n\t"+"Pemrograman Bahasa C++");
                        judul_buku.add("\n\t"+"Java");
                        judul_buku.add("\n\t"+"Java Script");
                        judul_buku.add("\n\t"+"Python");
                        judul_buku.add("\n\t"+"Teknologi Informasi");
                    }
                    System.out.println("\t==============================");
                    System.out.println("\n\tjudul buku ="+judul_buku);
                    System.out.println("\n\tJumlah Buku Tersedia = "+judul_buku.size());
                    

                }else if(menu==2){
                    System.out.println("\t==============================");
                    System.out.print("\tMasukan Judul Buku     : ");
                    masukan = str.nextLine();
                    judul_buku.add("\n\t"+masukan);
                    System.out.println("\n\tjudul buku yang ditambahkan ="+masukan);
                    System.out.println("\n\tjudul buku yang tersedia="+judul_buku);
                    System.out.println("\n\tJumlah Buku Tersedia = "+judul_buku.size());
                    System.out.print("\n\n");

                }else if(menu==3){
                    int search;
                    System.out.println("\t==============================");
                    System.out.println("\n\t**Cari Judul Buku** ");
                    System.out.print("\tMasukan Judul Buku     : " );
                    pencarian=judul_buku.indexOf("\n\t"+cari.nextLine());
                    search = pencarian+1;
                    System.out.println("\tJudul tersebut terdapat pada urutan ke : "+search);


                }else if(menu==4){
                    System.out.println("\t==============================");
                    System.out.println("\n\tjudul_buku =" +judul_buku);
                    System.out.print("\tNo buku yang akan dihapus    : ");
                    index = nomor.nextInt()-1;
                    System.out.println("\t==============================");
                    System.out.println("\n\tBuku yang dihapus : "+judul_buku.get(index));
                    judul_buku.remove(index);
                    System.out.println("\n\tjudul buku yang tersedia =" +judul_buku);
                    System.out.println("\nJumlah Buku Tersedia = "+judul_buku.size());
                    System.out.print("\n\n");


                }else if(menu==5){
                    System.out.println("\n\t\t\t\t**** Terima Kasih ****");
                    System.out.println(" ");
                }else{
                    System.out.println("\n\t\t\t\tTidak tersedia!!");
                    System.out.println(" ");
                }
            } 
        while(menu!=5);   
        
    }
}
