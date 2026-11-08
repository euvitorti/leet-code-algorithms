/**
 * @param {number} n
 * @return {number}
 */
var sumOfMultiples = function (n) {
    // Stores the sum of all multiples found.
    // Armazena a soma de todos os múltiplos encontrados.
    let sum = 0;

    // Iterate through all numbers from 0 to n.
    // Percorre todos os números de 0 até n.
    for (let i = 0; i <= n; i++) {

        // Check if the current number is divisible by 3, 5, or 7.
        // Verifica se o número atual é divisível por 3, 5 ou 7.
        if (i % 3 === 0 || i % 5 === 0 || i % 7 === 0) {

            // Add the current number to the total sum.
            // Adiciona o número atual à soma total.
            sum += i;
        }
    }

    // Return the final sum.
    // Retorna a soma final.
    return sum;
};
