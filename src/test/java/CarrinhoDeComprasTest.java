
import oojava.coursera.*;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;
public class CarrinhoDeComprasTest {
    private Pizza p;
    private Pizza p2;
    private Pizza p3;
    private CarrinhoDeCompras c;


    @Before
    public void criarObjetos() {
        this.p = new Pizza();
        this.p2 = new Pizza();
        this.p3 = new Pizza();
        this.c = new CarrinhoDeCompras();
    }
    @After
    public void zerarIngredientes(){
        this.p.zerarIng();
        this.p2.zerarIng();
        this.p3.zerarIng();
    }
    @Test
    public void testAddSemIng(){
        c.addPizza(p);
        assertNotNull(c.totalPizzas());
    }
    @Test
    public void somaPizza(){
        p.adicionaIngrediente("A");
        p.adicionaIngrediente("B");
        p.adicionaIngrediente("C");
        p.adicionaIngrediente("D");
        p.adicionaIngrediente("E");
        p.adicionaIngrediente("F");
        p.adicionaIngrediente("G");

        p2.adicionaIngrediente("A");
        p2.adicionaIngrediente("B");

        p3.adicionaIngrediente("A");
        p3.adicionaIngrediente("B");
        p3.adicionaIngrediente("C");
        p3.adicionaIngrediente("D");
        p3.adicionaIngrediente("E");

        c.addPizza(p);
        c.addPizza(p2);
        c.addPizza(p3);

        assertEquals(58,c.getPrecoTotal());
    }
}
