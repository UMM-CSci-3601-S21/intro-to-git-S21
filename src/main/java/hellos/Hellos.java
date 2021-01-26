package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static void main(String[] args) {
    Hellos helloRunner = new Hellos();
    helloRunner.run();
  }

  public void run() {
    String output = generateOutput();
    System.out.println(output);
  }

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();
    
    builder.append(cassieSaysHello());
    builder.append(DanteSaysHello());
    builder.append(halleySaysHi());
    builder.append(jeffSaysHello());
    builder.append(joshSaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    builder.append(thomasSaysHello());
    
    return builder.toString();
  }

  private static String joshSaysHello() {
    return "Josh says 'Hello World!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }
  
  private String DanteSaysHello() {
    return "Dante says 'Hello!'\n";
  }

  private String thomasSaysHello() {
    return "Thomas says 'Hola!'\n";

  }

  private String halleySaysHi() {
    return "Halley says 'Yo!'\n";
  }

  private String jeffSaysHello(){
    return "Jeff says 'Hello!'\n";
  }

  private String cassieSaysHello(){
    return "Cassie says 'Hello!'\n";
  }

}
