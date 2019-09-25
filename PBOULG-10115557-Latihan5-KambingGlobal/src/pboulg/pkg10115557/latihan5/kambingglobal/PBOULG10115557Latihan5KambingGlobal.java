/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan5.kambingglobal;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 1 / latihan 5
 */
public class PBOULG10115557Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		KambingGlobal kambingSusu = new KambingGlobal();

		//menampilkan jumlah kambing yang ada saat program pertama x berjalan
		kambingSusu.getJumlahKambing();

		//menambah satu kambing 
		kambingSusu.tambahKambing();

		//menampilkan jumlah kambing yang ada
		kambingSusu.getJumlahKambing();	
	}
}
