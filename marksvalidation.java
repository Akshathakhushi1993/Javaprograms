class marksvalidation{
public static void main(String[] args)
{
int marks=85;
if(marks>=85 && marks<100){
System.out.println("Distinction");
}
else if(marks>=35 && marks<80){
System.out.println("FIRST CLASS");
}
else if(marks>=0 && marks<34)
{
System.out.println("FAIL");
}
else
{
System.out.println("invalid input");
}
}
}

