import org.junit.Test;
import org.springframework.beans.propertyeditors.CharacterEditor;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author jianglei
 * @since 7/27/18
 */
public class Test01 {

    @Test
    public void test01() {
        String name = WebApplicationContext.class.getName() + ".ROOT";
        System.out.println(name);
    }

    @Test
    public void test02() {
        GenericApplicationContext xmlWebApplicationContext = new GenericApplicationContext();
        boolean active = xmlWebApplicationContext.isActive();
        System.out.println(active);
        xmlWebApplicationContext.refresh();
        System.out.println(active);
    }

    @Test
    public void test03() {
        CharacterEditor characterEditor = new CharacterEditor(true);
        characterEditor.setAsText("a");
        String asText = characterEditor.getAsText();
        System.out.println(asText);

        Object value = characterEditor.getValue();
        System.out.println(value.getClass().getName());
    }
}
