import oojava.coursera.*;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    private CarrinhoDeCompras c;
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;


    @Before
    public void criarObjetos() {
        this.p1 = new Pizza();
        this.p2 = new Pizza();
        this.p3 = new Pizza();
        this.c = new CarrinhoDeCompras();
    }
    @After
    public void zerarIngredientes(){
        this.p1.zerarIng();
        this.p2.zerarIng();
        this.p3.zerarIng();
    }
    @Test
    public void testPreco(){

        p1.adicionaIngrediente("Frango");
        p1.adicionaIngrediente("Catupiry");
        assertEquals(15, p1.getPreco());

        p1.adicionaIngrediente("Milho");
        p1.adicionaIngrediente("Ervilha");
        p1.adicionaIngrediente("Molho");
        assertEquals(20,p1.getPreco());

        p1.adicionaIngrediente("Cebola");
        assertEquals(23,p1.getPreco());
    }
    @Test
    public void testAddIng(){
        p2.adicionaIngrediente("Muçarela");
        assertNotNull(p2.getIngrediente());
    }
}