
class Kuts{

  public static void main(String[] args){
    String registrationNumber;
    String departureTime;
    String arrivalTime;
    String cost; //but should be converted to double type


    if (args.length > 0){
      // Args is a list with all the input parsed in
      // use indexing
      registrationNumber = args[0];
      departureTime = args[1];
      arrivalTime = args[2];
      cost = args[3];
      //Now you have your values, print as requested
      for (String val : args){
        //Iterating over args
        //me fooling around
        System.out.println(args[0]);
      }
    }else{
      System.out.println("No Arguments Supplied");
    }
  }
}
