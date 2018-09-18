/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author GL553VD
 */
public class Bus2 {

    static void getpenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void cetakpenumpang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int penumpang;
    public int maxPenumpang;
    
    //konstruktor kelas Bus
    public Bus2(int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang=0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang=temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang"+penumpang);
        System.out.println("Penumpang maksimum seharusnya"+maxPenumpang);
    }

    void addPenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
