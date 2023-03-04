#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>
#include <assert.h>

#define N_BCD_DIGITS 8

uint32_t packed_bcd(uint32_t packed_bcd);

int main(int argc, char *argv[]) {

    for (int arg = 1; arg < argc; arg++) {
        long l = strtol(argv[arg], NULL, 0);
        assert(l >= 0 && l <= UINT32_MAX);
        uint32_t packed_bcd_value = l;

        printf("%lu\n", (unsigned long)packed_bcd(packed_bcd_value));
    }

    return 0;
}

// given a packed BCD encoded value between 0 .. 99999999
// return the corresponding integer
uint32_t packed_bcd(uint32_t packed_bcd_value) {

    // PUT YOUR CODE HERE

    uint32_t bit = 0, result = 0, one = 1;
    for (int i = 31; i >= 0; i--) {

        if((i != 31) && ((i+1)%4 == 0)){
            result *= 10;
            result += bit;
            bit = 0;
        }

        bit = bit << 1;
        if (packed_bcd_value & (one << i)) {
            bit |= 1;
        }
    }

    result *= 10;
    result += bit;

    return result;
}