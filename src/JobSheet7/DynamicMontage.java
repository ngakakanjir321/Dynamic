package JobSheet7;
import java.math.BigInteger;
import java.util.Scanner;
public class DynamicMontage {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);       
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13,.. dst.\n");
    }
    public static void main(String[] args) {
        String identitas = "Muhamad Fathoni / XRPL2 / 20";        
        tampilJudul(identitas);        
        int n = tampilInput();        
        BigInteger hasil = fibo(n);        
        tampilHasil(n, hasil);
    }
    //Initial Commit   
    private static int tampilInput() {
        Scanner scanner = new Scanner (System.in);      
        System.out.print("Bilangan Ke: ");
        int n = scanner.nextInt();        
        return n;
    }
    //Tambah Input
    
    private static BigInteger fibo(int n) {
        
        BigInteger[] hasil = new BigInteger[n];       
        hasil[0] = BigInteger.ONE;
        hasil[1] =  BigInteger.ONE;        
        for(int i = 2; i < n; i++) {
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    //Tambah Hitung Fibonacci
    
    private static void tampilHasil(int n, BigInteger hasil) {
        System.out.println("Bilangan Fibonacci Ke - "+n+" : "+hasil);
    }
    //Tambah Tampil Hasil
}
