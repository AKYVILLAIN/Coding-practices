import random

def generate_transaction_id(base_id):
    # Find the number of trailing zeros
    trailing_zeros = len(base_id) - len(base_id.rstrip('0'))
    # Generate random digits for the trailing zeros
    random_part = ''.join(random.choices('0123456789', k=trailing_zeros))
    # Replace trailing zeros with the random digits
    return base_id.rstrip('0') + random_part

# Example usage
base_id = "100005464236001"
transaction_id = generate_transaction_id(base_id)
print(transaction_id)
