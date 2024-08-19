from toolz import thread_last

def calculate_number(l):
    return l[1]*l[10]*l[100]*l[1000]*l[10000]*l[100000]*l[1000000]

thread_last(
    range(0,500000),
    log_data_type,
    (map, str),
    log_data_type,
    (''.join),
    log_data_type,
    (map, int),
    log_data_type,
    list,
    log_data_type,
    calculate_number,
    log_data_type,
    print
)

def log_data_type(value):
    print(type(value))
    return value
