package bai2;

public class BieuThuc {
    private String bieuThuc;

    public BieuThuc(String bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    public void chuanHoaBieuThuc(){
        bieuThuc = bieuThuc.replace("-+", "-");
        bieuThuc = bieuThuc.replace("+-", "-");
        bieuThuc = bieuThuc.replace("--", "-0-");
        bieuThuc = bieuThuc.replace("++", "+0+");
        System.out.println(bieuThuc);
    }

    public void tinhBieuThuc(){
        String temps = bieuThuc.replace("+", "-");
        System.out.println(temps);
        String[] arrStr = temps.split("-");
        for(String s : arrStr){
            System.out.println(s);
        }
        int tong = 0;
        tong += Integer.parseInt(arrStr[0]);
        int k = 1;
        for(int i = 0; i < bieuThuc.length(); i++){
            if(bieuThuc.charAt(i) == '+'){
                tong += Integer.parseInt(arrStr[k]);
                k++;
            }else if(bieuThuc.charAt(i) == '-'){
                tong -= Integer.parseInt(arrStr[k]);
                k++;
            }
        }
        System.out.println("Gia tri cua bieu thuc: " + tong);
/*        for(int i = 0; i < bieuThuc.length(); i++){
            if(bieuThuc.charAt(i) == '+'){
                tong += Integer.parseInt(arrStr[k]);
                k++;
            }else if(bieuThuc.charAt(i) == '-'){
                tong -= Integer.parseInt(arrStr[k]);
                k++;
            }
        }*/
    }
}
