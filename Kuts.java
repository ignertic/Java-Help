
class Kuts{

  public static void main(String[] args){
    private String registrationNumber;
    private String departureTime;
    private String arrivalTime;
    private double cost;


    if (args.length > 0){
      // Args is a list with all the input parsed in
      // use indexing
      registrationNumber = args[0]
      departureTime = args[1]
      arrivalTime = args[2]
      cost = args[3]
      
      for (String val : args){
        //Iterating over args
        System.out.println(val);
        System.out.println(args[0]);
      }
    }else{
      System.out.println("No Arguments Supplied");
    }
  }
}
