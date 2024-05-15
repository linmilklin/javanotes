import java.util.Scanner;

public class Homework001 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("输入体重");
		int tz = sc.nextInt();
		if (tz >= 70) {
			System.out.println("输入年龄");
			int nl = sc.nextInt();
			if (nl >= 18) {
				System.out.println("参加成人组70公斤级比赛");
			} else {
				System.out.println("参加少年组70公斤级比赛");
			}
		} else if (tz >= 60) {
			System.out.println("输入年龄");
			int nl = sc.nextInt();
			if (nl >= 18) {
				System.out.println("参加成人组60公斤级比赛");
			} else {
				System.out.println("参加少年组60公斤级比赛");
			}
		} else if (tz >= 50) {
			System.out.println("输入年龄");
			int nl = sc.nextInt();
			if (nl >= 18) {
				System.out.println("参加成人组50公斤级比赛");
			} else {
				System.out.println("参加少年组50公斤级比赛");
			}
		} else {
			System.out.println("不能参加比赛");
		}
	}
}
