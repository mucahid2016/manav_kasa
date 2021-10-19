import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler Oluşturulur
        double armut, elma, domates, muz,  patlıcan;

        //Kullanıcıdan Girdiler Alınır
        Scanner input= new Scanner(System.in);

        System.out.print("Armut Kaç kilo? : ");
        armut=input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        elma=input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        domates=input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        muz=input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? :");
        patlıcan=input.nextDouble();

        //Sonuç Yazdırılır
        double armutTutar=armut*2.14;
        double elmaTutar=elma*3.67;
        double domatesTutar=domates*1.11;
        double muzTutar=0.95*muz;
        double patlicanTutar=patlıcan*5.0;

        double toplamTutar= armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;
        System.out.print("Toplam Tutar : "+toplamTutar);


    }
}
