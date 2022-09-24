public class Lamp {
    private String navn;
    private boolean ts = true;
    private String result;
    private boolean ts2 = true;


    public String getNavn(){
        return navn;
    }

    public String isTs(){
        result = ts ? "Tændt" : "Slukket";
        return result;
    }

    public boolean isTs2(){
        if (ts2 == true){
            System.out.println("tændt");
        } if (ts2 == false){
            System.out.println("slukket");
        }
        return ts2;
    }

    public String translate(boolean ts2){
        if (ts2 == true){
            System.out.println("tændt");
        } if (ts2 == false){
            System.out.println("slukket");
        }
        return  ts2 ? "tændt" : "slukket";
    }

    public String toString(){
        return "Navn: " + getNavn() + "\nTændt/slukket? " + isTs();
    }

}
