class GamblingSimulator{
public static void main (String args[]){
int STAKE=100;
int bet=1;
System.out.println( "Welcome to  Gambling program" );
double gambling=Math.floor(Math.random()*10) % 2;
if(gambling==1){
System.out.println("win");
}
else{
System.out.println("lose");
}


}

}
