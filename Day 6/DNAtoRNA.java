// WPU Coding Challenge 2024
// 6/366
// https://www.codewars.com/kata/5556282156230d0e5e000089

public class DNAtoRNA {
    public static String dnaToRna(String dna) {
        return String.join("U", dna.split("T", -2)); 
    }

    public static String dnaToRna2(String dna){
        return dna.replace("T", "U");
    }

    public static String dnaToRna3(String dna){
        return dna.replaceAll("T", "U");
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("GCAT"));
    }
}