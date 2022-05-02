import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MercadoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Endereco enderecoMercado = new Endereco("Avenida Logo Ali", 1);
        Endereco enderecoGerente = new Endereco("Rua dos Bobos", 0);
        Gerente gerente = new Gerente("Giuseppe", "0", "0", enderecoGerente);
        Mercado mercado = new Mercado("Mercado Original", 10, gerente, enderecoMercado);

        Mercado mercadoClone = mercado.clone();
        mercadoClone.setNome("Mercado do Clone");
        mercadoClone.getEndereco().setNumero(42);
        mercadoClone.getGerente().getEndereco().setLogradouro("Rua 73");

        assertEquals("Mercado{nome='Mercado Original', numeroFuncionarios=10, gerente=Gerente{nome='Giuseppe', cpf='0', telefone='0', endereco=Endereco{logradouro='Rua 73', numero=0}}, endereco=Endereco{logradouro='Avenida Logo Ali', numero=1}}", mercado.toString());
        assertEquals("Mercado{nome='Mercado do Clone', numeroFuncionarios=10, gerente=Gerente{nome='Giuseppe', cpf='0', telefone='0', endereco=Endereco{logradouro='Rua 73', numero=0}}, endereco=Endereco{logradouro='Avenida Logo Ali', numero=42}}", mercadoClone.toString());
    }
}
