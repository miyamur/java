class dog
{
  private String name;
  dog(String s){
    name=s;

  }
  void naku(){
    System.out.println("僕は"+name);
  }
}

class inu
{
  public static void main(String[] args){
    dog d;
    d=new dog("太郎");
    d.naku();
  }
}
