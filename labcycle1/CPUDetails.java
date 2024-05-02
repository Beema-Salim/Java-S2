class CPU
{
double price;
class Processor
{
double cores;
String manufacturer;
double getCache()
{
return 4.3;
}
}
protected class RAM
{
double memory;
String manufacturer;
double getClockSpeed()
{
return 5.5;
}
}
}
public class CPUDetails
{
public static void main(String[] args)
{
CPU cpu=new CPU();
CPU.Processor processor=cpu.new Processor();
CPU.RAM ram=cpu.new RAM();
System.out.println("Beema Salim");
System.out.println("23MCA044");
System.out.println("13/02/24");
System.out.println("5. Create CPU with attribute price. Create inner class Processor
(no. of cores, manufacturer) and static nested class RAM (memory, manufacturer). Create
an object of CPU and print information of Processor and RAM.\n");
System.out.println("Processor Cache=" + processor.getCache());
System.out.println("Ram Clock speed" + ram.getClockSpeed());
}
}