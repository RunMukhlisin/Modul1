/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1202357201036;

/**
 *
 * @author user
 */
public class index_ganjil {
    
    public static void main(String[] args) {
        int data[][] = 
        {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}
        };
        int JumlahData = 0;
        
        System.out.println("Kolom Ganjil ; ");
        for (int baris = 0; baris < data.length; baris++) {
            for (int kolom = 1; kolom < data[baris].length; kolom += 2) {
                if (kolom % 2 == 1){
                    System.out.print(data[baris][kolom] + " ");
                    JumlahData += data[baris][kolom];
                }
            }
            System.out.println("");
        }
        System.out.println("Total Element pada kolom ganjil = " + JumlahData);
    }
}
