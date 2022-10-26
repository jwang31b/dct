public class State {
  float r, d, u;
  String name, abv;

  public State(String n, String a, float rs, float ds, float us) {
    name = n;
    abv = a;
    r = rs;
    d = ds;
    u = us;
  }
  /* GET METHODS */
  public String getName() {
    return name;
  }

  public String getAbv() {
    return abv;
  }

  public float getR() {
    return r;
  }

  public float getD() {
    return d;
  }

  public float getU() {
    return u;
  }

  /* MUTATOR METHODS (CAN ADD OR SUBTRACT) */
  public void addR(float s) {
    r += s;
  }

  public void addD(float s) {
    d += s;
  }

  public void addU(float s) {
    u += s;
  }

  //prints all related info in form of string
  public void printInfo() {
    System.out.println(name + ", " + abv + ", " + r + ", " + d + ", " + u);
  }

  public static void main(String[] args) {
    State NewYork = new State("New York", "NY", (float)38.5, (float)60.5, (float)1);
    NewYork.printInfo();
  }
}
