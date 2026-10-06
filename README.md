# Resolução Exercicio23_while]

## Descrição do problema 
Escreva um programa em Java usando while que solicite ao usuário um número
inteiro inicial e um número inteiro final. Calcule a soma de todos os números
dentro da faixa de valor informada INCLUINDO o número inicial e final.

## Como Funciona
1. O usuário insere o número inicial (`numinicial`) e o número final (`numfinal`) via console.
2. A variável `controle` é inicializada recebendo o mesmo valor de `numinicial`, servindo como o ponto de partida do loop.
3. A estrutura de repetição `while (controle <= numfinal)` executa o bloco contanto que o valor atual não ultrapasse o limite final:
   - Acumula o valor de `controle` na variável `soma` (`soma += controle;`).
   - Incrementa a variável de controle em uma unidade (`controle++;`) a cada iteração.
4. Ao final do laço, o programa imprime uma mensagem exibindo os limites do intervalo e o total somado.