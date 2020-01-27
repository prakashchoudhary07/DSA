class SwapVariable{
  public static void main(String[] args) {
      int a = 7, b = 24, c = 9;
      System.out.println("Initial values. ");
      System.out.println("a: "+a+", b: "+b+", c: "+c);

      System.out.println("Swap using XOR ");
      //Swap three variables using Xor bitwise operator variabe

      //Swap a and b
      a = a^b;
      b = a^b;
      a = a^b;
      //Swap b and c
      b = b^c;
      c = b^c;
      b = b^c;

      System.out.println("a: "+a+", b: "+b+", c: "+c);


      //Swap three variables using Addition method variabe
      System.out.println("Swap using Addition");
      //Swap a and b
      a = a + b;
      b = a - b;
      a = a - b;
      //Swap b and c
      b = b + c;
      c = b - c;
      b = b - c;

      System.out.println("a: "+a+", b: "+b+", c: "+c);


      //Swap three variables using temp variabe
      System.out.println("Swap using temp variabe ");
      int temp;
      temp = a;
      a = b;
      b = c;
      c = temp;

      System.out.println("a: "+a+", b: "+b+", c: "+c);

  }

}
