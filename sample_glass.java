class glass
{
  private int nakami;
  glass(){nakami=10;}
  void dasu(){nakami-=2;
  System.out.println("今の中身は"+nakami);}
}

class sample_glass
{
  public static void main(String [] args){
    glass cup=new glass();
    System.out.println("コップを作りました");
    System.out.println("水を出します");
    cup.dasu();
    cup.dasu();
    cup.dasu();
    System.out.println("end");

  }
}
