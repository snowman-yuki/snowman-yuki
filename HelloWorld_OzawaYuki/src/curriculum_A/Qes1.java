package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		// 問1 & 問2
		byte p = 0; // 変数byteNumの初期値を設定
		p =10; // 変数byteNumに10を代入
		
		
		short q = 0; // 変数shortの初期値を設定
		q = 100; // 変数shortNumに100を代入
		
		
		int c = 0; // 変数intNumの初期値を設定
		c = 1000; // 変数intNumに1000を代入
		
		
		long d = 0L; // 変数longNumの初期値を設定
		d = 10000; // 変数longNumに10000を代入
		
		
		float s = 0.0f; // 変数floatNumの初期値を設定
		s = 9.5f; // 変数floatNumに9.5fを代入
		
		
		double y = 0.0; // 変数doubleNumの初期値を設定
		y = 10.5; // 変数doubleNumに10.5を代入
		
		
		char letter = '\u0000'; // 変数letterの初期値を設定
		letter = 'a'; // 変数letterに'a'を代入
		
		
		String greeting = null; // 変数lettersの初期値を設定
		greeting = "ハロー"; // 変数lettersに"ハロー"を代入
		
		
		boolean isOverTeenage = false; // 変数isBooleanの初期値を設定
		isOverTeenage = true; // 変数isBooleanにtrueを代入
		
		
		
		
		// 問3
		System.out.println( p + q + c + d ); // 11110を出力
		System.out.println( p + p ); // 20を出力
		System.out.println( letter + greeting + isOverTeenage ); // a ハロー trueを出力
		System.out.println( p + p + p + q + c + d ); //　数字を全て足して出力
		System.out.println( d * d * q ); //　小数点以外の数字を全てかけて出力
		System.out.println( y / q ); // 10.5割る100をして出力
		System.out.println( p - q ); // 10引く100をして出力
		
		
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
		
		
		// 問8
		/*
		 * priceというdouble型の変数を宣言し、99.99を代入
		 * priceをint型に変換し、整数価格:99とコンソールに表示してください。
		 */
		
		
		double price = 99.99;
		int pr = (int) price;
		System.out.println( "整数価格:" + pr );
		
		
		// 問9
		/*
		 * String 型の変数 numStr に "123" を代入
		 * numStr を int 型に変換し、
		 * 変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示してください。
		 */
		
		
		String numStr = "123";
		int n = Integer.parseInt(numStr);
		System.out.println( n + 10 );
		
		
		// 問10
		/*
		 * int 型の変数 num に 50 を代入
		 * num を String 型に変換し、"得点: 50点" の形で表示
		 */
		
		
		int num = 50;
		String str = String.valueOf(num);
		System.out.println( "得点:" + str + "点" );
		
		
		// 問11
		/*
		 * 次の条件を満たすプログラムを条件演算子を使用して作成してください。
		 * int 型の変数 a に 10 を代入
		 * int 型の変数 b に 20 を代入
		 * a が b より小さいかどうかを boolean 変数 result に代入
		 * result の値を表示
		 */
		
		
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);
		
		
		// 問12
		/*
		 * 条件演算子（三項演算子）を使用してください。
		 * int 型の変数 x に 15 を代入
		 * x が 10 以上なら "OK"、そうでなければ "NG" を表示
		 */
		
		
		int x = 15;
		System.out.println( x > 10 );
		
		
		// 問13
		/*
		 * String text = "私はJavaが好きです。Javaは楽しい！";という
		 * 文章の中にある 「Java」 を 「Python」 に置き換えて表示させてください。
		 */
		
		
		
		
		

	}

}
