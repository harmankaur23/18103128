package assignment4;
class ques2
{
    public static void main(String[] args)
    {
        int number = -1;
        byte b = (byte)number;
        int x= b;
        char c = (char)b, c1 = (char)x;
        int final_num = c;
        System.out.println("Initial integer: "+ number); // -1
        System.out.println("Byte: "+ b + " " + x + " " + c1); // -1
        System.out.println("Character: "+ c); // a rectangle char
        System.out.println("Final integer: "+ final_num); // 65535
    }
}
