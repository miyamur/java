import java.io.*;

class inu{
  private String name;
  private int power;
  inu(String s){name=s;power=10;}
  int food()throws IOException{
    System.out.println("どれだけ食べますか");
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int x=Integer.parseInt(str);
    power+=x;
    return power;
  }
  int naku(){
    System.out.println("名前は"+name);
    power-=5;
    return power;
  }
}

class dog{
  public static void main(String[] args)throws IOException {
    System.out.println("犬を生成します");
    String s;
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    s=br.readLine();
    inu kai_inu=new inu(s);
    for (int i=0;i<5;i++){
      System.out.println("どうしますか");
      System.out.println("1食事　2なく");
      s=br.readLine();
      int ans=Integer.parseInt(s);
      if(ans==1){
        int t;
        t=kai_inu.food();
        System.out.println("犬の体力"+t);
      }
      else if(ans==2){
        int t;
        t=kai_inu.naku();
        System.out.println("犬の体力"+t);
        if(t<0){
          System.out.println("犬は鳴けませんでした");
          break;
        }

      }

    }
      System.out.println("end");
  }
}
