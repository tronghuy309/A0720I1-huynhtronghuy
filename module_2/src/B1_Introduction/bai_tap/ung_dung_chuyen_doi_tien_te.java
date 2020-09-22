package B1_Introduction.bai_tap;
import java.util.Scanner;
public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[]args) {
        double vnd =23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap vao so tien USD can qui doi: ");
        usd = sc.nextDouble();
        double quidoi = usd*vnd;
        System.out.println(" So tien qui doi la : " + quidoi);

    }
}
