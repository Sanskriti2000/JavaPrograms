import java.io.*;
public class color
    {
        public static void main(String args[])throws IOException
        {
            int ch;
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);

            System.out.println("Enter 1 for V, 2 for I, 3 for B, 4 for G, 5 for Y, 6 for O, 7 for R");
            System.out.println("Enter your Choice");
            ch=Integer.parseInt(in.readLine());

            switch(ch)
            {
                case 1:
                    System.out.println("Color of the VIBGYOR is Violet.");
                    break;
                case 2:
                    System.out.println("Color of the VIBGYOR is Indigo.");
                    break;
                case 3:
                    System.out.println("Color of the VIBGYOR is Blue.");
                    break;
                case 4:
                System.out.println("Color of the VIBGYOR is Green.");
                    break;
                case 5:
                    System.out.println("Color of the VIBGYOR is Yellow.");
                    break;
                case 6:
                    System.out.println("Color of the VIBGYOR is Orange.");
                    break;
                case 7:
                    System.out.println("Color of the VIBGYOR is Red.");
                    break;
                    default:
                        System.out.println("It is a wrong choice");
            }
        }
}
