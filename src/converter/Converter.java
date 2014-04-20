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

public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args[0].equals(args[2])) {
            System.out.println(args[1]+" (This was useless)");
        }
        else if(args[0].equals("-d")) {
            switch(args[2]) {
                case "-b":
                    dec.dec_bin(Integer.parseInt(args[1]));
                break;
                case "-h":
                    dec.dec_hex(Integer.parseInt(args[1]));
                break;
                default:
                    System.out.println("\nInvalid Command!\nType --help for help!\n");
            }
        }
        else if(args[0].equals("-b")) {
            switch(args[2]) {
                case "-h":
                    bin.bin_hex(args[1]);
                break;
                case "-d":
                    bin.bin_dec(args[1]);
                break;
                default:
                    System.out.println("\nInvalid Command!\nType --help for help!\n");
            }
        }
        else if(args[0].equals("-h")) {
            switch(args[2]) {
                case "-b":
                    hex.hex_bin(args[1]);
                break;
                case "-d":
                    hex.hex_dec(args[1]);
                break;
                default:
                    System.out.println("\nInvalid Command!\nType --help for help!\n");
            }
        }
        else {
            System.out.println("\nInvalid Command!\nType --help for help!\n");
        }
    }
    
}
