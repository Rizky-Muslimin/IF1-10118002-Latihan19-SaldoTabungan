/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118002.latihan19.saldotabungan;

/**
 *
 * Nama     : Rizky Muslimin
 * Kelas    : IF1
 * NIM      : 10118002
 * Deskripsi: Saldo tabungan
 */
public class IF110118002Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 2500000;
        int i;
        for (i = 1; i< 7 ; i++){
            saldo = (int) (saldo+(saldo*0.15));
            i=i+0;
            System.out.println("saldo di bulan ke-" +i+":"+saldo);
        }
    }
    
}
