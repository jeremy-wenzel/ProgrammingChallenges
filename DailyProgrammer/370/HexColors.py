def hex_colors(red, green, blue):
    # Get hex for red
    return "#" + convert_decimal_to_hex(red) + convert_decimal_to_hex(green) + convert_decimal_to_hex(blue)
    # Get hex for green
    # Get hex for blue

def convert_decimal_to_hex(decimal):
    return get_hex_value(decimal // 16) + get_hex_value(decimal % 16)

def get_hex_value(decimal):
    switcher = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"]
    return switcher[decimal]

def hex_colors_2(red, green, blue):
    return print(f'#{red:2X}{green:02X}{blue:2X}')

print(hex_colors_2(255, 10, 55))