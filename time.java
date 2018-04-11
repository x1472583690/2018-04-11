import java.util.*;
class Time {
	static public long days(Date begin,Date end){
	return (end.getTime()-begin.getTime())/(1000*60*60*24);
	}
	static public double years(Date begin,Date end){
	return (end.getTime()-begin.getTime())/(1000*60*60*24*365.0);
	}
	public static void main (String [] args){
		String S = "2010/01/01";
		Date s= new Date(S);
		Date t= new Date(args[0]);
		System.out.println("®t"+days(s,t)+"¤Ñ");
		System.out.printf("®t%.2f¦~ ",years(s,t));
	}
}