package kh.java.com;

public class TestMain {

	public static void main(String[] args) {
		int [][] map = { //10x10
				{1,1,0,1,1,1,1,1,1,1},
				{1,0,0,0,1,0,0,0,0,1},
				{1,0,1,0,1,0,1,0,1,1},
				{1,0,1,0,1,0,1,0,0,1},
				{1,0,1,0,1,0,1,1,0,1},
				{1,0,1,0,1,0,1,0,0,1},
				{1,0,1,0,1,0,1,0,1,1},
				{1,0,1,0,1,0,1,0,0,1},
				{1,0,1,0,0,0,1,0,0,0},
				{1,1,1,1,1,1,1,1,1,1}
		};
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(map[i][j]==0) {
					System.out.print("  ");
				}else {
					System.out.print("■ ");
				}
			}
			System.out.println();
		}
	}

}
