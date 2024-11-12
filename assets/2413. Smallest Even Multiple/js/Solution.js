function smallestEvenMultiple(n) {
    // Se 'n' for ímpar, o menor múltiplo par é n * 2.
    if (n % 2 !== 0) {
        return n * 2;
    } else {
        // Se 'n' já for par, o menor múltiplo par é n.
        return n;
    }
}

// Chamada da função com um número (por exemplo, 5)
let result = smallestEvenMultiple(5);

// Exibe o resultado
console.log(result);  // Saída: 10
