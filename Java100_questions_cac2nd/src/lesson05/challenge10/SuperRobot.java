package lesson05.challenge10;
//第5章 ロボット工場のお仕事

//
//問題10 新しいロボットの作成
//
//G博士のロボットが簡単な調理しかできなかったため
//Rさんは独自に高性能な調理ロボットを作ることにしました。
//以下の内容でクラスを作成してください。
//
//パッケージ名  lesson8.challenge10
//クラス名      SuperRobot
//
//処理の内容：(あなたが思う)豪華な料理を作成する機能

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {
	int energy;
	String name;
	int water;

	void pumpWater() {
		System.out.println("水を" + water + "リットル出します。\n");
	}

	void randomWater() {
		water = (int) (Math.random() * 10 % 9) + 1;
	}

	void setWater(int water) {
		this.water = water;
	}

	void makeOmelet(int eggNum, int butterNum) {
		int omu1 = eggNum / 2;
		int omu2 = butterNum / 5;

		if (omu1 > omu2) {
			System.out.println("\n" + omu2 + "人分のオムレツを作成しました。\n");
		} else {
			System.out.println("\n" + omu1 + "人分のオムレツを作成しました。\n");
		}
	}

	public int getWater() {
		randomWater();
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {

		if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			return "クッキー";
		}
		if (eggNum >= 2 && butterNum >= 5) {
			return "オムレツ";
		}
		if (eggNum > 0) {
			return "ゆで卵";
		} else {
			return null;
		}
	}

	String makeSuperDish(int flourNum, int sugarNum, int eggNum, int butterNum) {

		if (flourNum >= 200 && sugarNum >= 100 && eggNum >= 3 && butterNum >= 100) {
			return "特製ケーキ";
		}

		return null;
	}

}

class ClearRobot {
	void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("あとかたづけをしてくれるロボットも欲しいところですね。\n");
		System.out.println("G博士：");
		System.out.println("そうれはもう作ってあるぞ。\n");
		System.out.println("Rさん：");
		System.out.println("えっ！どうやって使うんですか？\n");
		System.out.println("G博士：");
		System.out.println("今まで使ってきた材料をまとめて、料理と一緒に渡すときれいにしてくれるんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("早速やってみます。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		Robot robot = new Robot();

		String eggdishes = robot.makeSuperDish(flourNum, sugarNum, eggNum, butterNum);

		if (eggdishes == null) {
			eggdishes = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);
		}

		if (eggdishes == null) {
			System.out.println("\n何も作れません。");
		} else {
			System.out.println("\n" + eggdishes + "が出来ました。");
		}

		System.out.println("\nあとかたづけをします。\n");
		int[] ingredients = new int[4];
		ingredients[0] = flourNum;
		ingredients[1] = sugarNum;
		ingredients[2] = eggNum;
		ingredients[3] = butterNum;

		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("小麦粉  ：" + ingredients[0] + "g");
		System.out.println("砂糖    ：" + ingredients[1] + "g");
		System.out.println("卵      ：" + ingredients[2] + "個");
		System.out.println("バター  ：" + ingredients[3] + "g");

		System.out.println("\nきれいになりました。");
	}

}
