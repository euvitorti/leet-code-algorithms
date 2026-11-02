
/**
 * @param {number} n
 * @return {number}
 */
var numPrimeArrangements = function (n) {
    const MOD = 1000000007;

    // Count how many prime numbers exist from 1 to n.
    // Conta quantos números primos existem de 1 até n.
    let primeCount = 0;

    for (let num = 2; num <= n; num++) {

        // Assume the current number is prime.
        // Assume que o número atual é primo.
        let isPrime = true;

        // Check if the current number has any divisor.
        // Verifica se o número atual possui algum divisor.
        for (let divisor = 2; divisor * divisor <= num; divisor++) {

            // If the remainder is zero, the number is not prime.
            // Se o resto da divisão for zero, o número não é primo.
            if (num % divisor === 0) {
                isPrime = false;
                break;
            }
        }

        // If no divisor was found, increase the prime counter.
        // Se nenhum divisor foi encontrado, incrementa o contador de primos.
        if (isPrime) {
            primeCount++;
        }
    }

    // All remaining numbers are non-prime.
    // Todos os números restantes são não primos.
    const nonPrimeCount = n - primeCount;

    // Calculate the factorial of the prime count.
    // Calcula o fatorial da quantidade de números primos.
    let primeFactorial = 1;

    for (let i = 2; i <= primeCount; i++) {
        primeFactorial = (primeFactorial * i) % MOD;
    }

    // Calculate the factorial of the non-prime count.
    // Calcula o fatorial da quantidade de números não primos.
    let nonPrimeFactorial = 1;

    for (let i = 2; i <= nonPrimeCount; i++) {
        nonPrimeFactorial = (nonPrimeFactorial * i) % MOD;
    }

    // Multiply both factorials and return the result modulo MOD.
    // Multiplica os dois fatoriais e retorna o resultado módulo MOD.
    return Number(
        (BigInt(primeFactorial) * BigInt(nonPrimeFactorial)) % BigInt(MOD)
    );
};
