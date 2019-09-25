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
public class KambingGlobal {
    // Var jumlahKambing menjadi var instance

	int jumlahKambing = 88;

	// Method untuk menampilkan jumlah Kambing
	public void getJumlahKambing() {
		System.out.println("Jumlah kambing : " + jumlahKambing);
	
	}
	public void tambahKambing() {
		jumlahKambing = jumlahKambing + 5;
		System.out.println("Jumlah kambing setelah di tambah: " + jumlahKambing);
	}
}
