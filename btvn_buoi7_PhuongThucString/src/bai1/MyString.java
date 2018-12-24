package bai1;

public class MyString {
    private String value;

    public MyString(String value) {
        this.value = value;
    }

    public void tinhTongKyTu(){
        char[] chars = value.toCharArray();
        int tong = 0;
        for(char c : chars){
            try {
                tong += Integer.parseInt(Character.toString(c));
            }catch (Exception ex){
            }
        }
        System.out.println("Tong cac ky tu la so trong chuoi la: " + tong);
    }

    public void tinhTongCacSo(){
        String temps = value;
        int tong = 0;

        for(int i = 0; i < temps.length(); i++){
            char c = temps.charAt(i);
            if(c < 48 || c > 57){
                temps = temps.replaceFirst(Character.toString(c), " ");
            }
        }
        String[] arr = temps.split(" ");
        for(String s : arr){
            try {
                tong += Integer.parseInt(s);
            }catch (Exception exc){

            }
        }
        System.out.println("Tong gia tri cua cac so trong chuoi value la: " + tong);

        /*        for(int i = 0; i < temps.length(); i++){
            if(temps.charAt(i) < 48 || temps.charAt(i) > 57){   // chay tu 0 den khi tim thay ky tu khong phai la so
                temps2 = temps.substring(0, i);
                temps = temps.substring(i + 1);
                i = 0;
                try {
                    temp = Integer.parseInt(temps2);
                }catch (Exception exc){
                    continue;
                }
                tong += temp;
            }else if((i + 1) == temps.length()){
                try {
                    temp = Integer.parseInt(temps);
                    tong += temp;
                }catch (Exception exc){

                }
            }
        }*/
    }

    public void ktDoiXuong(){
        int length = value.length();
        for(int i =0; i < (length / 2); i++){
            if(value.charAt(i) != value.charAt(length - 1 - i)){
                System.out.println("Chuoi " + value + " khong doi xung");
                return;
            }
        }
        System.out.println("Chuoi " + value + " doi xung");
        StringBuilder builder = new StringBuilder(value);

    }
}
