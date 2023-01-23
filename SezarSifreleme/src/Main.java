import java.util.Arrays;

public class Main {

    public static String sezarSifreleme(int kaydirmaSayisi,String goderilenMesaj){

        String[] alfabe={"a","b","c","ç","d","e","f","g","ğ","h","ı","i","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z","w","x"};
        String cozulenMesaj="";

        for (int i=0;i<goderilenMesaj.length();i++){

            char harf=goderilenMesaj.charAt(i);
            int indexNo=Arrays.asList(alfabe).indexOf(String.valueOf(harf));
            int alfabedekiKonum=indexNo+kaydirmaSayisi;

            if(alfabedekiKonum>=alfabe.length-1){
                int kalan=alfabedekiKonum-(alfabe.length-1);
                cozulenMesaj+=alfabe[kalan-1];
            }
            else{
                cozulenMesaj+=alfabe[alfabedekiKonum];
            }

        }

        return cozulenMesaj;
    }

    public static void main(String[] args) {

       System.out.println(sezarSifreleme(8,"üvxw"));

    }
}