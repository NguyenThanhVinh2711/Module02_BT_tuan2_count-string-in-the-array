import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String string ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap noi dung cho chuoi : ");
        string = scanner.nextLine();
        System.out.println("Nhap ky tu : ");
        char kytu;
        kytu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kytu){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua : " + kytu + " la " + count );
    }
}
