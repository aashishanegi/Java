class TrunkCall{
//declare the rate of each call
int ordinary_rate=23;
int urgent_rate=43;
int lighting_rate=54;
public static void  main(String args[]){

ordinary o=new ordinary();
o.charges(3);
urgent u=new urgent();
u.charges(4);
lighting l=new lighting();
l.charges(6);
}
}
class ordinary extends TrunkCall{
//methods
void charges(int hours){
System.out.println(ordinary_rate*hours);
}}
class urgent extends TrunkCall{
void charges(int hours){
System.out.println(urgent_rate*hours);
}}
class lighting extends TrunkCall{
void charges(int hours){
System.out.println(lighting_rate*hours);
}}
