import java.io.*;

class hero{
  private int power;
  hero(){power=100;}
  void kougeki(int n){
    System.out.println("どかーん");
    power-=n;
    if(power>0){
      System.out.println("現在のパワーは"+power);
    }
    else{
      System.out.println("ヒーローは倒れた");
    }
  }

  void bougyo(int n){
    System.out.println("攻撃された");
    power-=n;
    if(power>0){
      System.out.println("現在のパワーは"+power);
    }
    else{
      System.out.println("やられた");
    }
  }
}

class daimao
{
  private int  power;
  daimao(){power=100;}
  void kougeki(int n){
    System.out.println("どかーん");
    power-=n;
    if(power<0){
      System.out.println("やられた");
    }
  }
  void bougyo(int n){
    power-=n;
    if(power<0){
      System.out.println("やられた");
    }
  }
}

class battle{
  private daimao bu;
  private hero you;
  private int bu_basyo;
  private int you_basyo;
  battle()throws IOException{
    bu=new daimao();
    you=new hwro();
    System.out.println("対決開始");
    System.out.println("身をひそめる場所は");
    BufferedReader br=
    new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    you_basyo=Integer.parseInt(str);
    
  }
  void taiketu() throws IOException{
    String str;
    int iti,kougeki;

  }
}
