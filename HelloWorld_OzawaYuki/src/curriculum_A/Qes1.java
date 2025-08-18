package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		// 問1 & 問2
		byte a; // 変数byteNumの初期値を設定
		a =10; // 変数byteNumに10を代入
		
		
		short b; // 変数shortの初期値を設定
		b = 100; // 変数shortNumに100を代入
		
		
		int c; // 変数intNumの初期値を設定
		c = 1000; // 変数intNumに1000を代入
		
		
		long d; // 変数longNumの初期値を設定
		d = 10000; // 変数longNumに10000を代入
		
		
		float x; // 変数floatNumの初期値を設定
		x = 9.5f; // 変数floatNumに9.5fを代入
		
		
		double y; // 変数doubleNumの初期値を設定
		y = 10.5; // 変数doubleNumに10.5を代入
		
		
		char letter; // 変数letterの初期値を設定
		letter = 'a'; // 変数letterに'a'を代入
		
		
		String greeting; // 変数lettersの初期値を設定
		greeting = "ハロー"; // 変数lettersに"ハロー"を代入
		
		
		boolean isOverTeenage; // 変数isBooleanの初期値を設定
		isOverTeenage = true; // 変数isBooleanにtrueを代入
		
		
		// 問3
		System.out.println( a + b + c + d ); // 11110を出力
		System.out.println( a + a ); // 20を出力
		System.out.println( letter + greeting + isOverTeenage ); // a ハロー trueを出力
		System.out.println( a + a + a + b + c + d ); //　数字を全て足して出力
		System.out.println( 1.0 * a * a * a * a * a * a * a * a * a * a ); //　小数点以外の数字を全てかけて出力
		System.out.println( y / b ); // 10.5割る100をして出力
		System.out.println( a - b ); // 10引く100をして出力
		
		

	}

}
