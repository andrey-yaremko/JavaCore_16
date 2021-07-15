import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Aplication {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = Person.class;

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);

        }
        Constructor<Person>[] constructors =  personClass.getConstructors();
        for (int i = 0;i<constructors.length;i++){
            Constructor<Person> constructor = constructors[i];
            System.out.println("Constructor = "+ constructor);
        }

        Constructor<Person> personConstructor = personClass.getConstructor(String.class,int.class);
        Person newInstancePerson = personConstructor.newInstance("Andrey",22);
        System.out.println(newInstancePerson);

        methods[4].invoke(newInstancePerson,18);
        System.out.println(newInstancePerson);


    }
}