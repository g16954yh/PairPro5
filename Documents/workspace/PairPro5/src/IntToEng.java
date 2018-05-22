import java.util.Scanner;

public class IntToEng {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }
	
	// 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] num1 = {"","one","two","three","four","five","six","seven","eight","nine","ten",
    			"eleven","twelve","thirteen","fourteen","fifteen","sisteen","seventeen","eighteen","nineteen"};
    	String[] num2 = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
    	String[] num3 = {"","hundred", "thousand"};
    	int tp,op,hp,thp,tthp;
    	//0~19
    	if(n/20==0){
    		if(n==0) return "zero";
    		return num1[n];
    	}
    	//20~99
    	else if(n/100==0){
    		tp = n/10;
    		op = n%10;
    		return num2[tp]+" "+num1[op];
    	}
    	//100~999
    	else if(n/1000==0){
            hp = n/100;
    		n = n - hp * 100;
    		tp = n/10;
    		op = n%10;
    		return num1[hp]+" "+num3[1]+" "+num2[tp]+" "+num1[op];
    	}

    	//1000~9999
    	else {
    		thp = n/1000;
    		n = n - thp * 1000;
    		hp = n/100;
    		n = n - hp * 100;
    		tp = n/10;
    		op = n%10;
    		return num1[thp]+" "+num3[2]+" "+num1[hp]+" "+num3[1]+" "+num2[tp]+" "+num1[op];
    	}
    }
}
