class Constructor1
{
static{
System.out.println("class loading");
}
Constructor1(){
System.out.println("object initalization process");
System.out.println(this);
System.out.println(this.hashCode());
}
{
System.out.println("object creation");
}
public static void main(String []args){
new Constructor1();
new Constructor1();
new Constructor1();
}
}