/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("大変お待たせいたしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！\n");

		System.out.println("本日のおすすめ商品です。\n");

		int sitron = 30;
		int chocora = 30;
		int pistersh = 30;

		System.out.println("シトロン \t\t\\250 ・・・ 残り" + sitron + "個");
		System.out.println("ショコラ \t\t\\280 ・・・ 残り" + chocora + "個");
		System.out.println("ピスターシュ \t\\320 ・・・ 残り" + pistersh + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン\t\t>");
		String str1 = reader.readLine();
		int num1 = Integer.parseInt(str1);

		System.out.print("ショコラ\t\t>");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);

		System.out.print("ピスターシュ \t>");
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);
		System.out.print("\n");

		System.out.println("シトロン\t\t" + str1 + "個");
		System.out.println("ショコラ\t\t" + str2 + "個");
		System.out.println("ピスターシュ \t" + str3 + "個\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
	}

}
