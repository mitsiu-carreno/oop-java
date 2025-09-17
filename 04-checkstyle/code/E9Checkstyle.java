class E9Checkstyle {
  static void printGreeting() {
    System.out.println("Hola!");
  }

  static void courseGreeting(String paramNombreMateria) {
    System.out.println("Bienvienidos a " + paramNombreMateria);
  }

  public static void main(String[] args) {
    printGreeting();

    String nombreMateria = "POO";
    courseGreeting(nombreMateria);
  }
}
