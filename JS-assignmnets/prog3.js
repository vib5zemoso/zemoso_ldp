const printName = (nm) => "Hi " + nm;

console.log(printName("Ron"));

const printBill = (names, bill) => {
    return `Hi ${names}, please pay: ${bill}`;
}

console.log(printBill("Raj",1000));

const person = {
    name: "Noam Chomsky",
    age: 92
};
  
const { name, age } = person;
  
console.log(name);
console.log(age);