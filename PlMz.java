import java.util.Scanner;

public class PlMz(start,goal,maze,PL){

    public void Koma_Distination(){
    //コマの移動入力はWASDのキーボードを使っておこなう　W = UP,S = DOWN,A = LEFT,D = RIGHT
    System.out.println("移動したい方向を入力してください");
    System.out.println("W -> 上　S -> 下　A -> 左　D -> 右");
    Scanner GO = new Scanner(System.in); //進行方向を聞く
    String Distination = GO.nextString();
    switch (Distination) {
        case W:
            PL[1] = PL[1] - 1;
            break;
  
        case S:
            PL[1] = PL[1] + 1;
            break;

        case A:
            PL[0] = PL[0] - 1;
            break;

        case D:
            PL[0] = PL[0] + 1;
            break;
    
        default:
            break;
    } 
    } 

}