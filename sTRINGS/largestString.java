public class largestString {
    public static void main(String[] args) {
        String  Fruits[]={"Mango" , "Apple","Papaya"};

        String Largest = Fruits[0];

        for(int i=0; i<Fruits.length;i++){
            if(Largest.compareTo(Fruits[i])<0){
                Largest = Fruits[i];
            }

        }
        System.out.println(Largest);  // Papaya is lexicographycally  letter...largest
    } 
}

