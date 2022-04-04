
package bus;

public class BigBus {
     public static void main(String[] args){
        Bus bigBus = new Bus();
        bigBus.penumpang = 12;
        bigBus.maxPenumpang = 10;
        bigBus.cetak();
        
        bigBus.penumpang =  bigBus.penumpang+5;
        bigBus.cetak();
    }
}
