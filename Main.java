import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int havaSicakligi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz: ");
        havaSicakligi = inp.nextInt();

        if (havaSicakligi < 5){
            System.out.println("Kayak Yap.");

            }
            else if (havaSicakligi >= 5 && havaSicakligi < 15){
            System.out.print("Sinemaya Gidebilirsin.");

        }   else if (havaSicakligi >=15 && havaSicakligi <25){
            System.out.print("Pikniğe Gidin, Hava Güzel.");

        }   else{
            System.out.print("Yüzme Güzel Fikir.");
        }








    }
}


 /*
        * Programımızda kullanıcı girişi olarak kullanıcıdan hava sıcaklığı değeri isteyeceğiz.
        * Bu değere göre belli koşullar belirteceğiz.
        * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
          Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
          Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
          Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */

         /*
        if (havaSicakligi < 5){
            System.out.println("Kayak Yap.");

            }
            else if (havaSicakligi >= 5 && havaSicakligi < 15){
            System.out.print("Sinemaya Gidebilirsin.");

        }   else if (havaSicakligi >=15 && havaSicakligi <25){
            System.out.print("Pikniğe Gidin, Hava Güzel.");

        }   else{
            System.out.print("Yüzme Güzel Fikir.");
        } */