import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int data [] = new int[21];
    int rata, hitung;
    int total = 0;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan banyaknya variabel array: ");
    hitung = scan.nextInt();
    
      for (int i = 1; i <= hitung; i++) {
        System.out.print("nilai Ke"+ i +"=");
        data[i] = scan.nextInt();
        total = total + data[i];
    }
    rata = total / hitung;

    System.out.println("Hasil total keseluruhan = " + total);
    System.out.println("nilai Rata-rata = " + rata);
  }
}