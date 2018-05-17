import java.util.Scanner;

public class IntToEng {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] num1 = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
    			"eleven","twelve","thirteen","fourteen","fifteen","sisteen","seventeen","eighteen","nineteen"};
    	String[] num2 = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    	String[] num3 = {"","hundred"};
    	int tp,op,hp;
    	if(n/20==0) return num1[n];
    	else if(n/100==0){
    		tp = n/10;
    		op = n%10;
    		if(op==0) return num2[tp];
    		return num2[tp]+"-"+num1[op];
    	}
    	else {
            hp = n/100;
    		n = n - hp * 100; 
    	}
    	return "";
    }
}
