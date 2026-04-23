/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("大変お待たせいたしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！\n");

		System.out.println("本日のおすすめ商品です。\n");

		double sitron = 30;
		double chocora = 30;
		double pistersh = 30;

		double sitron_price = 250;
		double chocora_price = 280;
		double pistersh_price = 320;

		System.out.println("シトロン \t\t\\" + (int) sitron_price + " ・・・ 残り" + (int) sitron + "個");
		System.out.println("ショコラ \t\t\\" + (int) chocora_price + " ・・・ 残り" + (int) chocora + "個");
		System.out.println("ピスターシュ \t\\" + (int) pistersh_price + " ・・・ 残り" + (int) pistersh + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン\t\t>");
		String str1 = reader.readLine();
		double sitron_number = Double.parseDouble(str1);

		System.out.print("ショコラ\t\t>");
		String str2 = reader.readLine();
		double chocora_number = Double.parseDouble(str2);

		System.out.print("ピスターシュ \t>");
		String str3 = reader.readLine();
		double pistersh_number = Double.parseDouble(str3);
		System.out.print("\n");

		System.out.println("シトロン\t\t" + sitron_number + "個");
		System.out.println("ショコラ\t\t" + chocora_number + "個");
		System.out.println("ピスターシュ \t" + pistersh_number + "個\n");

		double sum_number = sitron_number + chocora_number + pistersh_number;

		sitron_price = sitron_number * sitron_price;
		chocora_price = chocora_number * chocora_price;
		pistersh_price = pistersh_number * pistersh_price;
		double sum_price = sitron_price + chocora_price + pistersh_price;

		System.out.println("合計個数\t" + sum_number + "個");
		System.out.println("合計金額   " + (int) sum_price + "円\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。\n");

		sitron = sitron - sitron_number;
		chocora = chocora - chocora_number;
		pistersh = pistersh - pistersh_number;

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン \t\t\\250 ・・・ 残り" + (int) sitron + "個");
		System.out.println("ショコラ \t\t\\280 ・・・ 残り" + (int) chocora + "個");
		System.out.println("ピスターシュ \t\\320 ・・・ 残り" + (int) pistersh + "個");

	}

}
