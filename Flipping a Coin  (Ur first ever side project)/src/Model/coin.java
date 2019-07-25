package Model;

public class coin {
    private String state;
    public coin(String state) {
          this.state = state;
    }
    //MODIFY: this
    //EFFECT: change status of coin
    public void flip (){
      if (state.equals("Heads"))
      {state = "Tails"; }
      else { if (state.equals("Tails"))
                { state= "Heads"; }}


    }

    //MODIFY: this
    //EFFECT: return status of coin
    public String checkstate(){
        return state;
    }
}
