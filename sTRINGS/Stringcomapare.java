public class Stringcomapare {
    public static void main(String[] args) {
        String str1 = "Umesh";
        String str2 = "Umesh";
        String str3 = new String("Umesh"); // This takes new space In memory so this is not equal to str..As they stores
                                           // in different places

        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not1 equal");
        }
        if (str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }
        //But if we want to check if the content in the String is same or not Even they are stored in different places We have to use 
        //special java function..

        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }

    }
}
