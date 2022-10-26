public class Answer {
  String a, r;
  float eR, eD, eU;
  State[] states;

  //remember to make all the value effects add up to 0 to make sure total support is still 100%
  public Answer(String ans, String response, State[] states, float effectR, float effectD, float effectU) {
    a = ans;
    r = response;
    this.states = states;
    eR = effectR;
    eD = effectD;
    eU = effectU;
  }

  public String getAnswer() {
    return a;
  }

  public String getResponse() {
    return r;
  }

  /*
  revisit at a later date
  public float getEffect() {
    return e;
  }
  */

  public void chosen() {
    for (State s : states) {
      s.addR(eR);
      s.addD(eD);
      s.addU(eU);
    }
  }

  public static void main(String[] args) {
    State NewYork = new State("New York", "NY", (float)38.5, (float)60.5, (float)1);
    NewYork.printInfo();
    State[] states = {NewYork};
    Answer good = new Answer("Open up the campaign with an optimistic speech.", "Way to get your base fired up!", states, (float)-2.0, (float)1.5, (float)0.5);
    good.chosen();
    NewYork.printInfo();
  }
}
