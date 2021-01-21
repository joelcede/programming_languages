'''
Write a function that takes an integer as input,
and returns the number of bits that are equal to one in the binary
representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010,
so the function should return 5 in this case.
'''

def count_binary_number():
    number = int(input('Write a number: '))
    convert_binary = bin(number)
    if number < 0:
        return count_binary_number()
    else:
        result_binary = convert_binary[2::]
        counts_ones = result_binary.count('1')
        print("The binary representation of {} is: {}, Count Ones: {}"
            .format(number,result_binary,counts_ones))

count_binary_number()
