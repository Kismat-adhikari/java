// 1
// public class thirdmay {

// public static void odd( int b){
// for (int i = 1; i <= b; i++) {
// if (i % 2 != 0) {
// System.out.println(i);
// }
// }
// }

// public static void main(String[] args) {
// Scanner scanner= new Scanner (System.in);
// System.out.println("Enter a number:");
// int b = scanner.nextInt();

// odd(b);
// scanner.close();
// }
// }

// 2Create a method to convert a given number of days into years, months, and
// days
// public class thirdmay{

// public static void converter(int num){
// int years = (num) / 365;

// int months = (num - years *365) / 30;

// int days = (num - years * 365 - months*30);

// System.out.println(years + "Years,"+ months + "months and "+ days +"days");

// }

// public static void main(String[] args) {

// Scanner scanner=new Scanner(System.in);
// System.out.print("Enter number to calcualte:");
// int num = scanner.nextInt();

// converter(num);
// scanner.close();

// }
// }

// no 3. Write a method to determine whether a number is a Harshad number or not

// public class thirdmay{

// public static void Harshad(int num){

// int sum=0;
// int tempo=num;
// while( num >0){
// sum += num%10;
// num /=10;
// }

// if(tempo%sum==0){
// System.out.println("The given number is Harshad number,"+tempo);
// }
// else{
// System.out.println("The given number is not Harshad number,"+tempo);

// }
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter a number to check:");
// int num=scanner.nextInt();

// Harshad(num);
// scanner.close();

// }
// }

// 5 Write a method to calculate the compound interest given principal, rate,
// and time
// import java.util.Scanner;

// public class thirdmay {
// public static void ci(int principal, int rate, int time) {
// double amount = principal + (principal * rate * time) / 100;
// double compoundInterest = amount - principal;
// System.out.println("The compound interest is: " + compoundInterest);
// System.out.println("The total amount is: " + amount);

// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter value for principle:");
// int principle = scanner.nextInt();
// System.out.println("Enter value for rate:");
// int rate = scanner.nextInt();
// System.out.println("Enter value for time:");
// int time = scanner.nextInt();

// ci(principle,rate,time);

// scanner.close();

// }
// }

// 4 Write a method to count the number of words in a given string

// public static void thirdmay(String a) {
// int count = 0;
// int i = 0;
// int len = a.length();

// while (i < len) {
// while (i < len && (a.charAt(i) == ' ' || a.charAt(i) == '\t' || a.charAt(i)
// == '\n')) {
// i++;
// }

// if (i < len) {
// count++;
// while (i < len && a.charAt(i) != ' ' && a.charAt(i) != '\t' && a.charAt(i) !=
// '\n') {
// i++;
// }
// }
// }

// System.out.println("Word count: " + count);
// }

// 6. Palindrome Prime
// public class thirdmay {

// public static boolean isPrime(int n) {
// if (n < 2) {
// System.out.println(n + " is not prime");
// }
// for (int i = 2; i < n; i++) {
// if (n % i == 0) {
// System.out.println(n + " is not prime");
// }
// }
// return true;
// }

// public static void isPalindromePrime(int n) {
// int reversed = 0, original = n;
// while (n > 0) {
// reversed = reversed * 10 + n % 10;
// n /= 10;
// }
// if (reversed == original) {
// System.out.println(original + " is a Palindrome Prime.");
// } else {
// System.out.println(original + " is NOT a Palindrome Prime.");
// }
// }

// public static void main(String[] args) {
// isPalindromePrime(131)
// }
// }

// Write a method to swap two numbers using a temporary variable
// public class thirdmay {

// public static void swap(int a, int b) {
// int temp;
// temp = a;
// a = b;
// b = temp;
// System.out.println("a: " + a + " b: " + b);
// }

// public static void main(String[] args) {
// swap(5, 10); //looked this up on yt
// }
// }

// // Write a method to swap two numbers without using a temporary variable
// public class thirdmay {

// public static void swap(int a, int b) {
// a = a + b;
// b = a - b;
// a = a - b;
// System.out.println("a: " + a + " b: " + b);
// }

// public static void main(String[] args) {
// swap(5, 10);
// }
// }

// Create a method to find the sum of the first n natural numbers
// public class thirdmay {

// public static int sumofn(int n) {
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// sum += i;
// }
// return sum;
// }

// public static void main(String[] args) {
// System.out.println("Sum of first 5 natural numbers: " + sumofn(5));
// }
// }

// Write a method to print all factors of a number
// public class thirdmay {

// public static void printFactors(int n) {
// for (int i = 1; i <= n; i++) {
// if (n % i == 0) {
// System.out.print(i + " ");
// }}
// System.out.println();
// }
// public static void main(String[] args) {
// System.out.print("Factors of 12: ");
// printFactors(12);
// }
// }

// // Create a method to calculate the cube of a given number
// public class thirdmay {

// public static int cube(int n) {
// return n * n * n;
// }

// public static void main(String[] args) {
// System.out.println("Cube of 3: " + cube(3));
// }
// }

// Write a method to determine if a number is a Duck number

// public class thirdmay {

// public static boolean isduck(int n) {
// String num = String.valueOf(n);
// if (num.charAt(0) == '0') return false;
// return num.contains("0");
// }

// public static void main(String[] args) {
// System.out.println(isduck(203)); // true
// System.out.println(isduck(123)); // false
// }
// }

// Create a method to print the multiplication tables from 1 to 10
//
// public class thirdmay {

// public static void table() {
// for (int i = 1; i <= 10; i++) {
// for (int j = 1; j <= 10; j++) {
// System.out.print(i * j + "\t");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// table();
// }
// }

// // Write a method that returns the sum of squares of digits of a number

// public class thirdmay {

// public static int sumsquare(int n) {
// int sum = 0;
// while (n > 0) {
// int digit = n % 10;
// sum += digit * digit;
// n /= 10;
// }
// return sum;
// }

// public static void main(String[] args) {
// System.out.println(sumsquare(123)); // 14
// }
// }

// // Create a method to count uppercase and lowercase characters in a string
// public class thirdmay {

// public static void count(String str) {
// int upper = 0, lower = 0;
// for (int i = 0; i < str.length(); i++) {
// if (Character.isUpperCase(str.charAt(i))) {
// upper++;
// } else if (Character.isLowerCase(str.charAt(i))) {
// lower++;
// }
// }
// System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
// }

// public static void main(String[] args) {
// count("Hello World!");
// }
// }

// Write a method to generate the first n terms of the Fibonacci series
// public class thirdmay {

// public static void fibonacci(int n) {
// int a = 0, b = 1;
// if (n >= 1) System.out.print(a + " ");
// if (n >= 2) System.out.print(b + " ");
// for (int i = 3; i <= n; i++) {
// int next = a + b;
// System.out.print(next + " ");
// a = b;
// b = next;
// }
// }

// public static void main(String[] args) {
// fibonacci(5);
// }
// }
