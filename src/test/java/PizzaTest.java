import oojava.coursera.*;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    private Pizza p;

    @Before
    public void criarObjetos() {
        this.p = new Pizza();

    }
    @After
    public void zerarIngredientes(){
        this.p.zerarIng();
    }
    @Test
    public void testPreco(){

        p.adicionaIngrediente("Frango");
        p.adicionaIngrediente("Catupiry");
        assertEquals(15, p.getPreco());

        p.adicionaIngrediente("Milho");
        p.adicionaIngrediente("Ervilha");
        p.adicionaIngrediente("Molho");
        assertEquals(20,p.getPreco());

        p.adicionaIngrediente("Cebola");
        assertEquals(23,p.getPreco());
    }
    @Test
    public void testAddIng(){
        p.adicionaIngrediente("Muçarela");
        assertNotNull(p.getIngrediente());
    }
}