
for (let i = 0; i < 10; i++) {
    let num = Math.floor(Math.random() * 100);
    if (num % 2 === 0) {
        console.log(num + " is even");
    } else {
        console.log(num + " is odd");
    }
}

function repeat(n, action){
    for (let i = 0; i < n; i++) {
        action(i);
    }
}
repeat(4, console.log);

let labels = [];
repeat(5, i => {
    labels.push(`Label ${i + 1}`);
});
console.log(labels);
