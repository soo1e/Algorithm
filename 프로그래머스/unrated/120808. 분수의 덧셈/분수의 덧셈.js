function gcd(a, b) {
    while (b !== 0) {
        const temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

function solution(numer1, denom1, numer2, denom2) {
    const commonDenom = denom1 * denom2;
    const newNumer1 = numer1 * denom2;
    const newNumer2 = numer2 * denom1;
    
    const sumNumer = newNumer1 + newNumer2;
    const gcdValue = gcd(sumNumer, commonDenom);
    
    const simplifiedNumer = sumNumer / gcdValue;
    const simplifiedDenom = commonDenom / gcdValue;
    
    return [simplifiedNumer, simplifiedDenom];
}
