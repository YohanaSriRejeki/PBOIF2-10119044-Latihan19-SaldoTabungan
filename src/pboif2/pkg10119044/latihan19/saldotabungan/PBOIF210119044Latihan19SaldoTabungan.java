/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan19.saldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan saldo tabungan dengan 
 * perulangan
 */

public class PBOIF210119044Latihan19SaldoTabungan {
    
    public static void main(String[] args) {
        int saldoAwal,lama,i,akhir;
        double bunga;
       
        saldoAwal=2500000;
        bunga=15;
        lama=6;
        
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(" Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        rupiah.setDecimalFormatSymbols(formatRp);
        
        for(i=1; i <=lama; i++){
            akhir=(int) (saldoAwal+((bunga/100)*saldoAwal));
            saldoAwal=akhir;
            
            System.out.println("Saldo di bulan ke-"+i+rupiah.format(akhir));
        }
        
        
        
    }
}
