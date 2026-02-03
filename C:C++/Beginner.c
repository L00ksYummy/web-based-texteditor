#include <stdio.h>

void square(int *num) {
    *num = (*num) * (*num);
}

int main() {
    int n, i;
    printf("Enter a number: ");
    scanf("%d", &n);

    printf("Squares from 1 to %d:\n", n);
    for (i = 1; i <= n; i++) {
        int temp = i;
        square(&temp);
        printf("%d squared is %d\n", i, temp);
    }
    return 0;
}