class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    

    String c_file = "calculator.c";
    String output_exe = "calculator";
    Process compile = new ProcessBuilder("gcc", "-o " + output_exe,  c_file).start();
    Process execute = new ProcessBuilder("./" + output_exe);
  }
}