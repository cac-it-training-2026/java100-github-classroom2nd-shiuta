/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int sitron_price = 250;
		int chocora_price = 280;
		int pistersh_price = 320;

		System.out.println("シトロン \t\t\\" + sitron_price + " ・・・ 残り" + sitron + "個");
		System.out.println("ショコラ \t\t\\" + chocora_price + " ・・・ 残り" + chocora + "個");
		System.out.println("ピスターシュ \t\\" + pistersh_price + " ・・・ 残り" + pistersh + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン\t\t>");
		String str1 = reader.readLine();
		int sitron_number = Integer.parseInt(str1);

		System.out.print("ショコラ\t\t>");
		String str2 = reader.readLine();
		int chocora_number = Integer.parseInt(str2);

		System.out.print("ピスターシュ \t>");
		String str3 = reader.readLine();
		int pistersh_number = Integer.parseInt(str3);
		System.out.print("\n");

		System.out.println("シトロン\t\t" + sitron_number + "個");
		System.out.println("ショコラ\t\t" + chocora_number + "個");
		System.out.println("ピスターシュ \t" + pistersh_number + "個\n");

		int sum_number = sitron_number + chocora_number + pistersh_number;

		sitron_price = sitron_number * sitron_price;
		chocora_price = chocora_number * chocora_price;
		pistersh_price = pistersh_number * pistersh_price;
		int sum_price = sitron_price + chocora_price + pistersh_price;

		System.out.println("合計個数\t" + sum_number + "個");
		System.out.println("合計金額  " + sum_price + "円\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。\n");

		sitron = sitron - sitron_number;
		chocora = chocora - chocora_number;
		pistersh = pistersh - pistersh_number;

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン \t\t\\250 ・・・ 残り" + sitron + "個");
		System.out.println("ショコラ \t\t\\280 ・・・ 残り" + chocora + "個");
		System.out.println("ピスターシュ \t\\320 ・・・ 残り" + pistersh + "個");

	}

}
