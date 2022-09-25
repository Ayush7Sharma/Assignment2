public class Question4 {
    public static void main(String args[]){
        int p=80000;
        int y=0;
        while(p<=150000){
            p*=105;
            p/=100;
            y++;
        }
        System.out.println(y);
    }
}