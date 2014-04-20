/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

/**
 *
 * @author lorenz
 */
public class bin {
    public static double bin_dec(String bin) {
        double dec=0;
        bin=new StringBuffer(bin).reverse().toString();
        for(int x=0; x<bin.length(); x++) {
            dec=dec+(Integer.parseInt(String.valueOf(bin.charAt(x))))*(Math.pow(2, x));
        }
        System.out.println(dec);
        return dec;
    }
    
    public static double bin_dec_noprint(String bin) {
        double dec=0;
        bin=new StringBuffer(bin).reverse().toString();
        for(int x=0; x<bin.length(); x++) {
            dec=dec+(Integer.parseInt(String.valueOf(bin.charAt(x))))*(Math.pow(2, x));
        }
        return dec;
    } 
    
    public static void bin_hex(String bin) {
        double bin_dec=bin_dec_noprint(bin);
        String bin_dec_string=String.valueOf(bin_dec);
        bin_dec_string=bin_dec_string.substring(0, bin_dec_string.length()-2);
        int bin_dec_int=Integer.parseInt(bin_dec_string);
        String bin_hex=dec.dec_hex(bin_dec_int);
    }
}
