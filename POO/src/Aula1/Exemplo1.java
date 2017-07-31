/*
* Materiais de aula da disciplina de Programação Orientada a Objetos
* Turma 2017.2
* Universidade Tiradentes
 */
package Aula1;

/**
 *
 * @author Prof. Fabio Gomes Rocha
 * @email fabio.gomes@souunit.com.br
 */
public class Exemplo1 {
    //método responsável por inicializar a aplicação, cada programa deve ter um main
    public static void main(String[] args) {
        //int = variável do tipo inteiro, neste caso, declaramos as variáveis a, b e c.
        int a, b, c;
        a=10;
        b=5;
	//Exemplos de operadores (soma, subtração, divisão, multiplicação e mod - resto de divisão)
        c = a+b;
        //System.out.println é responsável por exibir os dados no console e ao término quebra linha
        System.out.println("O resultado da soma de A+B é " + c);
        c = a-b;
        System.out.println("O resultado da subtração de A-B é " + c);
        c = a/b;
        System.out.println("O resultado da divisão de A/B é " + c);
        c = a*b;
        System.out.println("O resultado da multiplicação de A*B é " + c);
	c = 11%2;
        System.out.println("O resto da divisão de 11 por 2 é " + c);
        // O tipo String não é nativo
	String nome = "Fabio";
	System.out.println(nome);
	float d;
	d = a/b*c+0.5f;
	System.out.println("O resultado de A/B*C+0,5 usando ponto flutuante é " + d);
        double e;
	e = d/c*0.5;
	System.out.println("O resultado de d/c*0.5 usando double é " + e);
        
    }
    
}
