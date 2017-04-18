package busybug;


import java.text.MessageFormat;
import java.util.Scanner;

public class Busybug {


    public void input(){

    //    map m = new map();
        map[] m = new map[4];//把大地图分为四小块地图
        for(int i = 0 ; i < 4; i ++) //初始化四小块地图
            m[i] = new map();


        int [] c = new int [9]; //记录小地图上种类信息
        int [] p = new int [9]; //记录挡板信息
        int [] t = new int [5]; //记录题目要求
        System.out.println("Welcome to the Busybug game.");
        System.out.println("First, please input the 3*3 SubMap information: (0-empty 1-yellow 2-green 3-white 4-red 5-brown)");
        for(int count = 0; count < 4; count++){ //循环输入四个map的信息

            System.out.println("The creatures of Map "+(count+1)+": ");

            Scanner in = new Scanner(System.in);
            int layout = in.nextInt(); //读入一串int作为小地图种类的分布

            for(int count1 = 0; count1<9; count1++) //把这一串int数分别一一存入c数组当中
                c[count1] = (layout / (int) Math.pow(10, (8 - count1))) % 10; //取每个位数的数字存到对应数组

            m[count].setCreature(c); //赋值地图上的图案给每个小地图

        }

        System.out.println("Second, please input the 3*3 Pieces information: (0-unfold 1-block)");
        for (int count = 0; count < 4; count++) //输入挡板的信息
        {
            System.out.println((count+1)+" of 4 pieces of the game: ");

            Scanner in1 = new Scanner(System.in);
            int piece = in1.nextInt();

            for(int count1 = 0; count1<9; count1++)
                p[count1] = (piece / (int) Math.pow(10, (8 - count1))) % 10;

            m[count].setPieces(p);
        }

        System.out.println("Input the target combination: (the number of yellow/green/white/red/brown creatures)");
        Scanner in3 = new Scanner(System.in);
        int target = in3.nextInt();

        for(int count1 = 0; count1<5; count1++) //输入题目要求
            t[count1] = (target / (int) Math.pow(10, (4 - count1))) % 10;

        System.out.println(MessageFormat.format("The target combination is: {0} yellow,{1} green,{2} white,{3} red,{4} brown.", t[0], t[1], t[2], t[3], t[4]));
        System.out.println("Game start!");
    }


}