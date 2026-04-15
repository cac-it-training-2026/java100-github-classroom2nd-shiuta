/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println("ピスターシュ \t\\320 ・・・ 残り" + (int) pistersh + "個\n");

		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計\t" + (int) sum_price + "円\n");

		System.out.println("内訳");

		double sitron_per = 100 * sitron_price / sum_price;
		double chocora_per = 100 * chocora_price / sum_price;
		double pistersh_per = 100 * pistersh_price / sum_price;

		System.out.println("シトロン \t\t\\" + (int) sitron_price + " ・・・ " + (int) sitron_per + "%");
		System.out.println("ショコラ \t\t\\" + (int) chocora_price + " ・・・ " + (int) chocora_per + "%");
		System.out.println("ピスターシュ \t\\" + (int) pistersh_price + " ・・・ " + (int) pistersh_per + "%");

	}

}
