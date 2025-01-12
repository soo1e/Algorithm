def calculate_expiry_date(start_date, months):
    
    year, month, day = map(int, start_date.split('.'))
    month += months
    year += (month - 1) // 12
    month = (month - 1) % 12 + 1
    return f"{year:04}.{month:02}.{day:02}"

def solution(today, terms, privacies):
    term_dict = {term.split()[0]: int(term.split()[1]) for term in terms}
    expired_privacies = []

    for idx, privacy in enumerate(privacies):
        date, term_type = privacy.split()
        expiry_date = calculate_expiry_date(date, term_dict[term_type])

        if expiry_date <= today:
            expired_privacies.append(idx + 1)

    return expired_privacies
