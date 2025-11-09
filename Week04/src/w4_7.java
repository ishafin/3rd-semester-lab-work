public class w4_7 {
    public static void main(String[] args) {
        int a=10,b=20,c=30,d=40;
        int smallest = a;
        if(b < smallest) {
            smallest =b;
        }
        if(c< smallest) {
            smallest =c;
        }
        if(d< smallest){
            smallest =d;
        }
        System.out.println("Smallest number is :"+ smallest);
    }
}
