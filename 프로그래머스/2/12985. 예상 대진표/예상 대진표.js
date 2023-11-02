function nextRoundNumber(a, b) {
    if (a % 2 === 0) {
        a = a / 2;
    } else {
        a = (a + 1) / 2;
    }

    if (b % 2 === 0) {
        b = b / 2;
    } else {
        b = (b + 1) / 2;
    }

    return [a, b];
}

function solution(n, a, b) {
    let round = 1;
    while (true) {
        const [nextA, nextB] = nextRoundNumber(a, b);
        if (nextA === nextB) {
            return round;
        }
        round++;
        a = nextA;
        b = nextB;
    }
}