package app3;

//じゃんけんの処理を行うクラス
public class Logic {

	// じゃんけんの勝ち負け処理 (１：グー２：チョキ３：パー とした時のplayer - cpuの値を計算し勝ち負けを判定する）
	public static void judgment(int player, int cpu) {
		int calc = player - cpu;
		switch (calc) {
		case -1:
		case 2:
			System.out.println("あなたの勝ちです！");
		case 1:
		case -2:
			System.out.println("ざんねん！あなたの負けです。");
		case 0:
			System.out.println("あいこですね。もう一回！");
		}
	}

	public static void gameStart() {
		System.out.println("それじゃ、じゃんけんを始めるよ！！");
		try {// 1秒待機
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("じゃーんけーん\n\n");
		try {// 2秒待機
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ぽん！\n\n");
	}
}
