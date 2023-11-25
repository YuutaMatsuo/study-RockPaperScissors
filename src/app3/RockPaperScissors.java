package app3;

import java.util.Random;
import java.util.Scanner;

//このクラスを元にプレイヤーとコンピュータを作成する
public class RockPaperScissors {
	String[] rpsArray = { "グー", "チョキ", "パー" };
	int hund;

	// コンソールからの入力を受け取りフィールド変数へ格納するメソッド
	public void input() {
		boolean isError = false;
		System.out.print("コンソールを使ってグーチョキパーを選んでね！\n1:グー 2:チョキ 3:パー\n>>");
		do {
			int hund = new Scanner(System.in).nextInt();
			if (hund >= 1 && hund <= 3) {
				this.hund = hund;
				System.out.println("保存しました");
			} else {
				isError = true;
				System.out.println("入力に誤りがあります。もう一度入力してください。");
			}
		} while (isError = true);
		System.out.println("メソッド終了");
	}

	// ランダムに１～３の数値を生成するメソッド
	public void random() {
		this.hund = new Random().nextInt(1, 3);
	}

	// 引数に応じてグーチョキパーの文字列を返すメソッド
	public String disp() {
		return rpsArray[hund - 1];
	}
}
