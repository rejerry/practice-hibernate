package practice.hibernate52.javaTest;
import java.net.URLDecoder;
import java.util.UUID;

public class test {
    String haha = "sb";
    public static void main(String[] args) {
        asciiToString2();
    }

    public static void uuid(){
        for(int i=0;i<10;i++){
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid);
        }
    }
    public static void testParam(){
        String haha = "sb2";    //ok
        if(2-1>0){
//            String haha = "sb3";  //error
        }
        System.out.println(haha);
    }

//    拆装箱
    public static void autoboxing(){
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }

    public static void getUUID32(){
        System.out.println(UUID.randomUUID().toString().replace("-", "").toLowerCase() );
    }

    public static String asciiToString(String value) {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }

    public static void asciiToString2() {
        try{
            String value = "%26";
            String a = URLDecoder.decode(value, "utf-8");
            System.out.println(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
