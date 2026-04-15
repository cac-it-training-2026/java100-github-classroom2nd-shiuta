/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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
		System.out.println("承りました。");

	}

}
