function hello() {
    return 'Hello';
}

function greeting(name, func)
{

    const x = func();

    console.log(`${x} ${name}`);
}

greeting('Vibhuti', hello);
greeting('Raj', hello);
greeting('Yash', hello);