import java.util.ArrayList;

public class DiscountCampaignTrail {
  //for now, only election of 2000, but later on, maybe other elections like 2020, 1960, 1948, 1988, etc
  int[] years = {2000};
  ArrayList<State> states;
  //ArrayList<Question> questions;

  public DiscountCampaignTrail(int year) {
    for (int y : years) {
      if (year == 2000) {
        //System.out.println(true);
        
      }
    }
    //System.out.println(false);
  }

  public static void main(String[] args) {
    DiscountCampaignTrail DCT = new DiscountCampaignTrail(2000);
  }
}
