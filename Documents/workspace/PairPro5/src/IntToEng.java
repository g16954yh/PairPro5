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
    	String[] num3 = {"","hundred", "thousand"};
    	int tp,op,hp,thp;
    	if(n/20==0) return num1[n];
    	else if(n/100==0){
    		tp = n/10;
    		op = n%10;
    		if(op==0) return num2[tp];
    		return num2[tp]+"-"+num1[op];
    	}
    	else if(n/1000==0){
            hp = n/100;
    		n = n - hp * 100;
    		tp = n/10;
    		op = n%10;
    		if(op==0) return num1[hp]+" "+num3[1]+" "+num2[tp];
    		return num1[hp]+" "+num3[1]+" "+num2[tp]+" "+num1[op];
    	}
    	/*else{
    		thp = n/1000;
    		n = n - thp * 1000;
    		hp = n/100;
    		n = n - hp * 100;
    		tp = n/10;
    		op = n%10;
    		if(op==0) return num1[thp]+" "+num3[2]+" "+num1[hp]+" "+num3[1]+" "+num2[tp];
    		return num1[thp]+" "+num3[2]+" "+num1[hp]+" "+num3[1]+" "+num2[tp]+" "+num1[op];
    	} */
    	return "";
    }
}
