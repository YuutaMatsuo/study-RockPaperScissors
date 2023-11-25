package app2;

public class Main {
	public static void main(String[] args) {
		//複数メソッドに分割し、リファクタリングを行ったじゃんけんゲーム
		String[] rpsArray = { "グー", "チョキ", "パー" };
		int player;
		int cpu;
		String result;

		do {
			System.out.println("じゃんけんゲームへようこそ！");
			System.out.print("コンソールを使ってグーチョキパーを選んでね！\n1:グー 2:チョキ 3:パー\n>>");
			// player: コンソールからの入力を受け取る cpu: ランダムに１～３の値を生成する
			player = new java.util.Scanner(System.in).nextInt();
			cpu = new java.util.Random().nextInt(1, 3);
			// 画面演出
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
			// じゃんけんの処理
			result = rockPaperScissors(player, cpu);
			// 結果を出力
			System.out.println("あなた：" + rpsArray[cpu - 1] + " わたし：" + rpsArray[player - 1]);
			System.out.println(result);

		} while (player == cpu);
	}

	// じゃんけんの勝ち負け処理 (１：グー２：チョキ３：パー とした時のplayer - cpuの値を計算し勝ち負けを判定する）
	public static String rockPaperScissors(int player, int cpu) {
		String result;
		int calc = player - cpu;
		switch (calc) {
		case -1:
		case 2:
			return result = "あなたの勝ちです！";
		case 1:
		case -2:
			return result = "ざんねん！あなたの負けです。";
		case 0:
			return result = "あいこですね。もう一回！";
		}
		return result = "入力に誤りがあります";
	}
}