// import java.util.Scanner;

// public class calculator_evan {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);

// System.out.println("=".repeat(30));
// System.out.println(" Kalkulator Sederhana");
// System.out.println(" Operasi Matematika");
// System.out.println("=".repeat(30));
// System.out.println(" 1. Penjumlahan (+)");
// System.out.println(" 2. Pengurangan (-)");
// System.out.println(" 3. Perkalian (*)");
// System.out.println(" 4. Pembagian (/)");
// System.out.println("=".repeat(30));

// System.out.print("Pilih Operasi (1/2/3/4): ");
// String operasi = input.nextLine();
// System.out.print("Masukan Bilangan Pertama : ");
// double bil1 = input.nextDouble();
// System.out.print("Masukan Bilangan Kedua : ");
// double bil2 = input.nextDouble();
// System.out.println("=".repeat(30));

// switch (operasi) {
// case "1":
// System.out.println("User Memilih Operasi Penjumlahan");
// break;
// case "2":
// System.out.println("User Memilih Operasi Pengurangan");
// break;
// case "3":
// System.out.println("User Memilih Operasi Perkalian");
// break;
// case "4":
// System.out.println("User Memilih Operasi Pembagian");
// break;
// default:
// System.out.println("Tidak Valid!!!!!!!!!!");
// return;
// }

// double hasil;
// switch (operasi) {
// case "1":
// hasil = bil1 + bil2;
// System.out.println("Hasil Operasi Dari " + bil1 + " + " + bil2 + " = " +
// hasil);
// break;
// case "2":
// hasil = bil1 - bil2;
// System.out.println("Hasil Operasi Dari " + bil1 + " - " + bil2 + " = " +
// hasil);
// break;
// case "3":
// hasil = bil1 * bil2;
// System.out.println("Hasil Operasi Dari " + bil1 + " * " + bil2 + " = " +
// hasil);
// break;
// case "4":
// if (bil2 != 0) {
// hasil = bil1 / bil2;
// System.out.println("Hasil Operasi Dari " + bil1 + " / " + bil2 + " = " +
// hasil);
// } else {
// System.out.println("Pembagian dengan nol tidak valid!");
// }
// break;
// default:
// System.out.println("Tidak Valid!!!!!!!!!!");
// break;
// }

// System.out.println("=".repeat(30));
// input.close();
// }
// }
