import com.example.todo.*;

public class HelloWorld
{
    public static void main(String[] args)
    {
        User user = new User("jmanuelemus", "Juan Manuel", "Lemus", "hola@jmanuelem.us");

        System.out.println(user.getUid());
    }
}
