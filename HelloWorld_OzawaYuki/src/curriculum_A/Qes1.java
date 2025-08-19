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
		System.out.println( d * d * b ); //　小数点以外の数字を全てかけて出力
		System.out.println( y / b ); // 10.5割る100をして出力
		System.out.println( a - b ); // 10引く100をして出力
		
		
		// 問4
		/* 
		 * nameというstring型の変数を宣言し、
		 * その変数に“山田太郎”という値を代入してください。
		 * name変数を使用してコンソールにこんにちは、山田太郎さん！と表示してください。
		 */
		
		String name = "山田太郎";
		System.out.println( "こんにちは、" + name + "さん!" );
		
		
		// 問5
		/* 
		* ageというint型の変数を宣言し、
		* その変数に25を代入してください。
		* age変数を使用してコンソールに年齢:25歳と表示してください。
		*/
		
		int age = 25;
		System.out.println( "年齢:" + age + "歳" );
		
		
		// 問6
		/* 
		* num1というint型の変数を宣言し、10を代入
		* num2というint型の変数を宣言し、5を代入
		* num1とnum2を足した結果をsumという変数に代入し、コンソールに表示してください。
		*/
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println( sum );
		
		
		// 問7
		/* 
		* scoreというint型の変数を宣言し、80を代入
		* scoreに20を加えて更新する
		* 最終スコア:100をscoreを使用してコンソールに表示してください。
		*/
		
		int score = 80;
		score = score + 20;
		System.out.println( "最終スコア:" + score );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
